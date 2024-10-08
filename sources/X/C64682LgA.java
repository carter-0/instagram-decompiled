package X;

import com.instagram.tagging.activity.TaggingActivity;

/* renamed from: X.LgA  reason: case insensitive filesystem */
public abstract class C64682LgA implements 27S {
    public final /* synthetic */ TaggingActivity A00;

    public C64682LgA(TaggingActivity taggingActivity) {
        this.A00 = taggingActivity;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        String str;
        C64673Lfz lfz = (C64673Lfz) obj;
        0qQ.A0B(lfz, 0);
        if (lfz.A00 != AnonymousClass05K.A01 || (str = lfz.A01) == null) {
            return false;
        }
        TaggingActivity taggingActivity = this.A00;
        if (taggingActivity.A0m.containsKey(str) || taggingActivity.A0n.contains(str)) {
            return true;
        }
        return false;
    }
}
