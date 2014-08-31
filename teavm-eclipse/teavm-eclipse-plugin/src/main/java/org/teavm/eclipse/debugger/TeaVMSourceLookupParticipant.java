/*
 *  Copyright 2014 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.eclipse.debugger;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;
import org.teavm.debugging.information.SourceLocation;

/**
 *
 * @author Alexey Andreev <konsoletyper@gmail.com>
 */
public class TeaVMSourceLookupParticipant extends AbstractSourceLookupParticipant {
    @Override
    public String getSourceName(Object object) throws CoreException {
        if (!(object instanceof TeaVMStackFrame)) {
            return null;
        }
        TeaVMStackFrame stackFrame = (TeaVMStackFrame)object;
        SourceLocation location = stackFrame.callFrame.getLocation();
        return location != null ? location.getFileName() : null;
    }
}
