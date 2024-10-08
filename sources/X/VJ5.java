package X;

public abstract class VJ5 {
    public static final void A00(String str, C62230ry r5) {
        StringBuilder sb;
        0qQ.A0B(r5, 1);
        Class cls = ((0Yh) r5).A00;
        String A0S = 002.A0S("in the polymorphic scope of '", 0q1.A01(cls), '\'');
        if (str == null) {
            sb.append("Class discriminator was missing and no default serializers were registered ");
            sb.append(A0S);
            sb.append('.');
        } else {
            sb = new StringBuilder();
            sb.append("Serializer for subclass '");
            sb.append(str);
            sb.append("' is not found ");
            sb.append(A0S);
            sb.append(".\nCheck if class with serial name '");
            sb.append(str);
            sb.append("' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '");
            sb.append(str);
            sb.append("' has to be '@Serializable', and the base class '");
            sb.append(0q1.A01(cls));
            sb.append("' has to be sealed and '@Serializable'.");
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
