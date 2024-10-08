package X;

import java.util.AbstractCollection;

/* renamed from: X.MMf  reason: case insensitive filesystem */
public final class C66296MMf extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66296MMf(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C66296MMf A00(Object obj, int i) {
        return new C66296MMf(obj, i);
    }

    public static void A01(Integer num, Object obj, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new JV5(num, (C62320sa) new C66296MMf(obj, i)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: X.KOl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: X.KOR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: X.KOm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: X.KOT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: X.KOl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v97, resolved type: X.KOl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: X.KOl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v99, resolved type: X.KOl} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r2 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        r0.A03.FIG(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cf, code lost:
        return X.LK1.A01(r1, r2, r0.A06().A0N);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x018d, code lost:
        r2.A0M(r1, r0);
        r2.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01d1, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r2 = r1.getString(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 1: goto L_0x01fa;
                case 2: goto L_0x01e7;
                case 3: goto L_0x0208;
                case 4: goto L_0x01e0;
                case 5: goto L_0x01d9;
                case 6: goto L_0x0005;
                case 7: goto L_0x01d2;
                case 8: goto L_0x0005;
                case 9: goto L_0x01d2;
                case 10: goto L_0x01b6;
                case 11: goto L_0x01ad;
                case 12: goto L_0x01ad;
                case 13: goto L_0x0194;
                case 14: goto L_0x015d;
                case 15: goto L_0x0128;
                case 16: goto L_0x015d;
                case 17: goto L_0x0128;
                case 18: goto L_0x00eb;
                case 19: goto L_0x00df;
                case 20: goto L_0x0017;
                case 21: goto L_0x00d0;
                case 22: goto L_0x000c;
                case 23: goto L_0x00bd;
                case 24: goto L_0x00b3;
                case 25: goto L_0x00a9;
                case 26: goto L_0x00a0;
                case 27: goto L_0x0097;
                case 28: goto L_0x0090;
                case 29: goto L_0x0087;
                case 30: goto L_0x007c;
                case 31: goto L_0x006f;
                case 32: goto L_0x0068;
                case 33: goto L_0x0061;
                case 34: goto L_0x005a;
                case 35: goto L_0x0053;
                case 36: goto L_0x006f;
                case 37: goto L_0x0068;
                case 38: goto L_0x0061;
                case 39: goto L_0x005a;
                case 40: goto L_0x0053;
                case 41: goto L_0x005a;
                case 42: goto L_0x004c;
                case 43: goto L_0x0045;
                case 44: goto L_0x003c;
                case 45: goto L_0x0005;
                case 46: goto L_0x002a;
                case 47: goto L_0x0005;
                case 48: goto L_0x0208;
                case 49: goto L_0x01e0;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.07f r2 = X.C51971G9r.A0U(r0)
        L_0x000b:
            return r2
        L_0x000c:
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0027
            java.lang.String r0 = "session_id_key"
            goto L_0x0021
        L_0x0017:
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x0027
            java.lang.String r0 = "creation_session_id"
        L_0x0021:
            java.lang.String r2 = r1.getString(r0)
            if (r2 != 0) goto L_0x000b
        L_0x0027:
            java.lang.String r2 = ""
            return r2
        L_0x002a:
            java.lang.Object r2 = r5.A01
            X.K6A r2 = (X.K6A) r2
            X.0eM r0 = r2.A0O
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            boolean r0 = r2.A0J
            X.KCk r2 = new X.KCk
            r2.<init>(r1, r0)
            return r2
        L_0x003c:
            java.lang.Object r1 = r5.A01
            X.0r1 r1 = (X.0r1) r1
            r0 = 1
            r1.A00 = r0
            goto L_0x01cf
        L_0x0045:
            java.lang.Object r0 = r5.A01
            X.Jh7 r0 = (X.C60188Jh7) r0
            X.KhE r1 = X.C62522KhE.VideoCoverPhotoEvent
            goto L_0x0075
        L_0x004c:
            java.lang.Object r0 = r5.A01
            X.Jh7 r0 = (X.C60188Jh7) r0
            X.KhE r1 = X.C62522KhE.VideoTrimEvent
            goto L_0x0075
        L_0x0053:
            java.lang.Object r0 = r5.A01
            X.Jh7 r0 = (X.C60188Jh7) r0
            X.KhE r1 = X.C62522KhE.EditToolEvent
            goto L_0x0075
        L_0x005a:
            java.lang.Object r0 = r5.A01
            X.Jh7 r0 = (X.C60188Jh7) r0
            X.KhE r1 = X.C62522KhE.FilterEvent
            goto L_0x0075
        L_0x0061:
            java.lang.Object r0 = r5.A01
            X.Jh7 r0 = (X.C60188Jh7) r0
            X.KhE r1 = X.C62522KhE.GalleryStickerEvent
            goto L_0x0075
        L_0x0068:
            java.lang.Object r0 = r5.A01
            X.Jh7 r0 = (X.C60188Jh7) r0
            X.KhE r1 = X.C62522KhE.TextEvent
            goto L_0x0075
        L_0x006f:
            java.lang.Object r0 = r5.A01
            X.Jh7 r0 = (X.C60188Jh7) r0
            X.KhE r1 = X.C62522KhE.AudioEvent
        L_0x0075:
            X.3ju r0 = r0.A03
            r0.FIG(r1)
            goto L_0x01cf
        L_0x007c:
            java.lang.Object r0 = r5.A01
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r0 = (com.instagram.creation.sharesheet.update.trial.TrialUseCase) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            com.instagram.trials.impl.TrialsPreferencesImpl r2 = X.LK1.A00(r0)
            return r2
        L_0x0087:
            java.lang.Object r0 = r5.A01
            X.KOT r0 = (X.KOT) r0
            com.instagram.common.session.UserSession r2 = r0.A01
            X.0iw r1 = r0.A00
            goto L_0x00c5
        L_0x0090:
            java.lang.Object r0 = r5.A01
            X.DbS.A1U(r0)
            goto L_0x01cf
        L_0x0097:
            java.lang.Object r0 = r5.A01
            X.KOm r0 = (X.C61847KOm) r0
            com.instagram.common.session.UserSession r2 = r0.A05
            X.0iw r1 = r0.A04
            goto L_0x00c5
        L_0x00a0:
            java.lang.Object r0 = r5.A01
            X.KOR r0 = (X.KOR) r0
            com.instagram.common.session.UserSession r2 = r0.A01
            X.0iw r1 = r0.A00
            goto L_0x00c5
        L_0x00a9:
            java.lang.Object r0 = r5.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.L14 r2 = new X.L14
            r2.<init>(r0)
            return r2
        L_0x00b3:
            java.lang.Object r1 = r5.A01
            X.KOo r1 = (X.C61849KOo) r1
            r0 = 1
            X.C61849KOo.A02(r1, r0)
            goto L_0x01cf
        L_0x00bd:
            java.lang.Object r0 = r5.A01
            X.KOl r0 = (X.C61846KOl) r0
            com.instagram.common.session.UserSession r2 = r0.A05
            X.0iw r1 = r0.A04
        L_0x00c5:
            X.JwD r0 = r0.A06()
            java.lang.String r0 = r0.A0N
            X.LSk r2 = X.LK1.A01(r1, r2, r0)
            return r2
        L_0x00d0:
            java.lang.Object r0 = r5.A01
            X.K4F r0 = (X.K4F) r0
            X.0eM r0 = r0.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.trials.impl.TrialsPreferencesImpl r2 = X.LK1.A00(r0)
            return r2
        L_0x00df:
            java.lang.Object r0 = r5.A01
            X.LpR r0 = (X.C65221LpR) r0
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r1 = r0.A05
            r0 = 1
            r1.A0A(r0)
            goto L_0x01cf
        L_0x00eb:
            java.lang.Object r1 = r5.A01
            X.LpW r1 = (X.C65226LpW) r1
            r0 = 1
            X.C65226LpW.A02(r1, r0)
            X.27r r0 = X.C65226LpW.A00(r1)
            X.29Y r3 = r0.A0E
            X.0wc r0 = r3.A01
            X.1Ln r2 = X.1Ln.A0A(r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x01cf
            X.80P r1 = X.AnonymousClass80P.SPINS_TOGGLE
            java.lang.String r0 = "tool_type"
            r2.A0M(r1, r0)
            X.29Y.A00(r2, r3)
            X.4yP r0 = X.C279294yP.CLIPS
            r2.A0a(r0)
            X.JVj r0 = X.C59725JVj.SHARE_SHEET
            r2.A0d(r0)
            X.HOA r1 = X.HOA.SPINNABLE_REEL
            java.lang.String r0 = "spin_type"
            r2.A0M(r1, r0)
            X.AnonymousClass7TF.A18(r2)
            X.9tN r1 = X.C391619tN.A0C
            java.lang.String r0 = "sticker_type"
            goto L_0x018d
        L_0x0128:
            java.lang.Object r0 = r5.A01
            X.LpW r0 = (X.C65226LpW) r0
            X.27r r0 = X.C65226LpW.A00(r0)
            X.29Z r1 = r0.A0F
            X.0Aj r2 = X.JTR.A0d(r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x01cf
            X.80P r0 = X.AnonymousClass80P.SPINS_TOGGLE
            X.JTO.A1O(r0, r2)
            X.283 r0 = r1.A04
            java.lang.String r0 = X.JTP.A0p(r0)
            X.JTO.A1S(r2, r0)
            X.JTP.A1E(r2)
            X.JVj r0 = X.C59725JVj.SHARE_SHEET
            X.C51965G9l.A1A(r0, r2)
            X.HOA r1 = X.HOA.SPINNABLE_REEL
            java.lang.String r0 = "spin_type"
            r2.A8M(r1, r0)
            r2.Cgf()
            goto L_0x01cf
        L_0x015d:
            java.lang.Object r0 = r5.A01
            X.LpW r0 = (X.C65226LpW) r0
            X.27r r0 = X.C65226LpW.A00(r0)
            X.29R r1 = r0.A09
            X.1Ln r2 = X.JTO.A0N(r1)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x01cf
            X.JTO.A1V(r2)
            java.lang.String r0 = "SPINS_CREATIVE_TOOL_CANCEL"
            r2.A0r(r0)
            X.29R.A00(r2, r1)
            X.AnonymousClass7TF.A18(r2)
            X.4yP r0 = X.C279294yP.CLIPS
            r2.A0a(r0)
            X.JVj r0 = X.C59725JVj.SHARE_SHEET
            r2.A0d(r0)
            X.HOA r1 = X.HOA.SPINNABLE_REEL
            java.lang.String r0 = "spin_type"
        L_0x018d:
            r2.A0M(r1, r0)
            r2.Cgf()
            goto L_0x01cf
        L_0x0194:
            X.1Z0 r4 = X.AnonymousClass2BF.A00()
            java.lang.Object r0 = r5.A01
            X.LpM r0 = (X.C65216LpM) r0
            com.instagram.common.session.UserSession r3 = r0.A03
            X.0iw r2 = r0.A02
            java.lang.String r1 = r0.A05
            X.4DH r0 = r0.A01
            java.lang.String r0 = r0.getModuleName()
            X.L5p r2 = r4.A01(r2, r3, r1, r0)
            return r2
        L_0x01ad:
            java.lang.Object r1 = r5.A01
            X.LpX r1 = (X.C65227LpX) r1
            r0 = 0
            X.C65227LpX.A02(r1, r0)
            goto L_0x01cf
        L_0x01b6:
            java.lang.Object r2 = r5.A01
            android.content.Context r2 = (android.content.Context) r2
            if (r2 == 0) goto L_0x01cf
            r0 = 4395(0x112b, float:6.159E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Failed to update Recommend-on-Facebook Settings"
            X.0wb.A03(r1, r0)
            java.lang.String r1 = "clips_recommend_on_facebook_update_error"
            r0 = 2131955690(0x7f130fea, float:1.9547915E38)
            X.C59689JTv.A0F(r2, r1, r0)
        L_0x01cf:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x01d2:
            java.lang.Object r0 = r5.A01
            X.2YM r2 = X.JTR.A0b(r0)
            return r2
        L_0x01d9:
            java.lang.Object r0 = r5.A01
            X.07f r2 = X.DbY.A0I(r0)
            return r2
        L_0x01e0:
            java.lang.Object r0 = r5.A01
            java.lang.Object r2 = X.DbT.A0r(r0)
            return r2
        L_0x01e7:
            java.lang.Object r2 = r5.A01
            com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController r2 = (com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController) r2
            android.content.Context r1 = r2.A06
            com.instagram.common.session.UserSession r0 = r2.A09
            X.2Nn r1 = X.AnonymousClass830.A00(r1, r0)
            java.lang.String r0 = r2.A0E
            java.io.File r2 = X.C39907AIy.A02(r1, r0)
            return r2
        L_0x01fa:
            java.lang.Object r0 = r5.A01
            X.KHW r0 = (X.KHW) r0
            com.instagram.common.session.UserSession r1 = r0.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.KCg r2 = new X.KCg
            r2.<init>(r1, r0)
            return r2
        L_0x0208:
            java.lang.Object r2 = r5.A01
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66296MMf.invoke():java.lang.Object");
    }
}
