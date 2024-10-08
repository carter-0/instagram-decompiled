package X;

/* renamed from: X.91n  reason: invalid class name and case insensitive filesystem */
public final class C3725991n extends 1P0 {
    public final /* synthetic */ C66762Mc7 A00;

    public C3725991n(C66762Mc7 mc7) {
        this.A00 = mc7;
    }

    public final void onFail(C268654dm r9) {
        String str;
        int A03 = AnonymousClass0fD.A03(-1027464057);
        0qQ.A0B(r9, 0);
        C3725991n.super.onFail(r9);
        C66762Mc7 mc7 = this.A00;
        C59689JTv.A01(mc7.A0E, C66579MXk.A00(1049), 2131970170, 0);
        C3725791l r5 = mc7.A07;
        String str2 = mc7.A0D;
        if (str2 == null) {
            str = "threadIdV2";
        } else {
            String str3 = mc7.A0C;
            if (str3 == null) {
                str = "participantId";
            } else {
                String str4 = mc7.A0B;
                if (str4 == null) {
                    str = "adMediaId";
                } else {
                    C3725791l.A00(r5, "direct_in_thread_ctd_banner_resume_ad_failed", str2, str3, 0se.A0M(new 0eP("media_id", str4)));
                    AnonymousClass0fD.A0A(1974933543, A03);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = AnonymousClass0fD.A03(-1091974977);
        int A032 = AnonymousClass0fD.A03(-15389011);
        0qQ.A0B(obj, 0);
        C3725991n.super.onSuccess(obj);
        C66762Mc7 mc7 = this.A00;
        C3725791l r5 = mc7.A07;
        String str2 = mc7.A0D;
        if (str2 == null) {
            str = "threadIdV2";
        } else {
            String str3 = mc7.A0C;
            if (str3 == null) {
                str = "participantId";
            } else {
                String str4 = mc7.A0B;
                if (str4 == null) {
                    str = "adMediaId";
                } else {
                    C3725791l.A00(r5, "direct_in_thread_ctd_banner_resume_ad_succeed", str2, str3, 0se.A0M(new 0eP("media_id", str4)));
                    AnonymousClass0fD.A0A(1089090587, A032);
                    AnonymousClass0fD.A0A(-1637715241, A03);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
