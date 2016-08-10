// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.core.clients.workitem.internal.form;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.xml.sax.Attributes;

import com.microsoft.tfs.core.clients.workitem.form.WIFormColumn;
import com.microsoft.tfs.core.clients.workitem.form.WIFormGroup;
import com.microsoft.tfs.core.clients.workitem.form.WIFormPaddingAttribute;

public class WIFormGroupImpl extends WIFormElementImpl implements WIFormGroup {
    private static final Log log = LogFactory.getLog(WIFormGroupImpl.class);

    private String label;
    private WIFormPaddingAttributeImpl padding;
    private WIFormPaddingAttributeImpl margin;
    private WIFormColumn[] columns;

    /**
     * Process the attributes of the "Group" element.
     *
     * Attributes: - Label: optional - Padding: optional - Margin: optional
     */
    @Override
    void startLoading(final Attributes attributes) {
        log.debug("  start loading: WIFormGroupImpl"); //$NON-NLS-1$

        label = WIFormParseHandler.readStringValue(attributes, WIFormParseConstants.ATTRIBUTE_NAME_LABEL);
        padding = WIFormParseHandler.readPaddingAttribute(attributes, WIFormParseConstants.ATTRIBUTE_NAME_PADDING);
        margin = WIFormParseHandler.readPaddingAttribute(attributes, WIFormParseConstants.ATTRIBUTE_NAME_MARGIN);
        setAttributes(attributes);
    }

    /**
     * Process the child elements of the "Group" element.
     *
     * Child elements: (sequence, minimum=1, maximum=unbounded) - Column
     */
    @Override
    void endLoading() {
        log.debug("    end loading: WIFormGroupImpl"); //$NON-NLS-1$
        columns = (WIFormColumn[]) childrenToArray(new WIFormColumn[] {});
    }

    /**
     * Corresponds to the "Label" attribute in XML use: optional
     */
    @Override
    public String getLabel() {
        return label;
    }

    /**
     * Corresponds to the "Padding" attribute in XML use: optional
     */
    @Override
    public WIFormPaddingAttribute getPadding() {
        return padding;
    }

    /**
     * Corresponds to the "Margin" attribute in XML use: optional
     */
    @Override
    public WIFormPaddingAttribute getMargin() {
        return margin;
    }

    /**
     * Corresponds to "Column" child elements in XML minOccurs: 1 maxOccurs:
     * unbounded
     */
    @Override
    public WIFormColumn[] getColumnChildren() {
        return columns;
    }
}
