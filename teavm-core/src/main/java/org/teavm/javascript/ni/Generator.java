package org.teavm.javascript.ni;

import org.teavm.codegen.SourceWriter;
import org.teavm.model.MethodReference;

/**
 *
 * @author Alexey Andreev <konsoletyper@gmail.com>
 */
public interface Generator {
    void generate(GeneratorContext context, SourceWriter writer, MethodReference methodRef);
}