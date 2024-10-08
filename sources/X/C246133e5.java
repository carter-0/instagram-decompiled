package X;

/* renamed from: X.3e5  reason: invalid class name and case insensitive filesystem */
public abstract class C246133e5 {
    public static final void A00(2Th r4, 2Th r5, Object obj) {
        if (!(obj instanceof C70682Ty)) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n            Trying to mount a RenderTreeNode, its parent should be a Host, but was '");
            sb.append(obj.getClass().getSimpleName());
            sb.append("'.\n            Parent RenderUnit: id=");
            sb.append(r5.A0H());
            sb.append("; poolKey='");
            sb.append(r5.A0I().Bdd());
            sb.append("'.\n            Child RenderUnit: id=");
            sb.append(r4.A0H());
            sb.append("; poolKey='");
            sb.append(r4.A0I().Bdd());
            sb.append("'.\n            ");
            throw new RuntimeException(0rw.A0t(sb.toString()));
        }
    }
}
