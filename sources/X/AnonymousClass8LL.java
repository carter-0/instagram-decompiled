package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8LL  reason: invalid class name */
public final class AnonymousClass8LL {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ARModelPaths{mModelPathsByCapabilityMap=");
        sb.append(this.A00);
        sb.append("}\nSparkVisionModelPaths{mSparkVisionModelPathsByName=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }
}
