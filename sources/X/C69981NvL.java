package X;

/* renamed from: X.NvL  reason: case insensitive filesystem */
public abstract class C69981NvL {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "MUSIC_RESHARE";
            case 2:
                return "INVITEE";
            case 3:
                return "COLLABORATOR";
            default:
                return "REACTION";
        }
    }
}
