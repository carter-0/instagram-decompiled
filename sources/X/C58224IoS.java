package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IoS  reason: case insensitive filesystem */
public final class C58224IoS extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58224IoS(AnonymousClass0iw r2, UserSession userSession, HLK hlk, String str, C62320sa r6, C62320sa r7, int i) {
        super(0);
        this.A00 = i;
        this.A04 = hlk;
        this.A03 = r6;
        this.A02 = r7;
        this.A06 = str;
        this.A05 = userSession;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        String str;
        Object obj2;
        int i = this.A00;
        int ordinal = ((HLK) this.A04).ordinal();
        if (i != 0) {
            if (ordinal == 0) {
                obj2 = this.A03;
            } else if (ordinal == 1) {
                obj2 = this.A02;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            DbS.A1U(obj2);
            if (ordinal != 0) {
                str = "reel_add_draft_button";
            } else {
                str = "post_add_draft_button";
            }
        } else {
            if (ordinal == 0) {
                obj = this.A03;
            } else if (ordinal == 1) {
                obj = this.A02;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            DbS.A1U(obj);
            if (ordinal != 0) {
                str = "create_reel_button";
            } else {
                str = "create_post_button";
            }
        }
        String str2 = this.A06;
        C49049EoT.A00((AnonymousClass0iw) this.A01, (0lg) this.A05, "tap", str, "opal_self_profile", str2, (String) null);
        return C60340gF.A00;
    }
}
