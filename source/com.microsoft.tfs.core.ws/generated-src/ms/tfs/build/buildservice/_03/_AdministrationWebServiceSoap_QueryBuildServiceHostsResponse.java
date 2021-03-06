// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._AdministrationWebServiceSoap_QueryBuildServiceHostsResponse;
import ms.tfs.build.buildservice._03._AgentStatus;
import ms.tfs.build.buildservice._03._BuildAgent;
import ms.tfs.build.buildservice._03._BuildController;
import ms.tfs.build.buildservice._03._BuildServiceHost;
import ms.tfs.build.buildservice._03._BuildServiceHostQueryResult;
import ms.tfs.build.buildservice._03._ControllerStatus;
import ms.tfs.build.buildservice._03._Failure;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _AdministrationWebServiceSoap_QueryBuildServiceHostsResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _BuildServiceHostQueryResult queryBuildServiceHostsResult;

    public _AdministrationWebServiceSoap_QueryBuildServiceHostsResponse()
    {
        super();
    }

    public _AdministrationWebServiceSoap_QueryBuildServiceHostsResponse(
        final _BuildServiceHostQueryResult queryBuildServiceHostsResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryBuildServiceHostsResult(queryBuildServiceHostsResult);
    }

    public _BuildServiceHostQueryResult getQueryBuildServiceHostsResult()
    {
        return this.queryBuildServiceHostsResult;
    }

    public void setQueryBuildServiceHostsResult(_BuildServiceHostQueryResult value)
    {
        this.queryBuildServiceHostsResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("QueryBuildServiceHostsResult"))
                {
                    this.queryBuildServiceHostsResult = new _BuildServiceHostQueryResult();
                    this.queryBuildServiceHostsResult.readFromElement(reader);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
