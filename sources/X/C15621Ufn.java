package X;

import com.instagram.genericsurvey.fragment.AdBakeOffFragment;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;

/* renamed from: X.Ufn  reason: case insensitive filesystem */
public final class C15621Ufn extends 1P0 {
    public final int A00;
    public final Object A01;

    public C15621Ufn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(1OC r1, Object obj, int i) {
        r1.A00 = new C15621Ufn(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x04a6, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x04a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x024d, code lost:
        r0 = "actionButtonHolder";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03cc, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x03d3, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 1: goto L_0x0479;
                case 2: goto L_0x0460;
                case 3: goto L_0x0437;
                case 4: goto L_0x040e;
                case 5: goto L_0x03f8;
                case 6: goto L_0x03e5;
                case 7: goto L_0x03bb;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x03a5;
                case 11: goto L_0x0359;
                case 12: goto L_0x0005;
                case 13: goto L_0x0327;
                case 14: goto L_0x02e5;
                case 15: goto L_0x0293;
                case 16: goto L_0x0251;
                case 17: goto L_0x020d;
                case 18: goto L_0x01cd;
                case 19: goto L_0x01b4;
                case 20: goto L_0x0173;
                case 21: goto L_0x0005;
                case 22: goto L_0x0005;
                case 23: goto L_0x015d;
                case 24: goto L_0x0147;
                case 25: goto L_0x0131;
                case 26: goto L_0x0111;
                case 27: goto L_0x00e2;
                case 28: goto L_0x0005;
                case 29: goto L_0x0005;
                case 30: goto L_0x0005;
                case 31: goto L_0x00c7;
                case 32: goto L_0x0005;
                case 33: goto L_0x0005;
                case 34: goto L_0x049c;
                case 35: goto L_0x00a8;
                case 36: goto L_0x0087;
                case 37: goto L_0x0061;
                case 38: goto L_0x0491;
                case 39: goto L_0x0049;
                case 40: goto L_0x002f;
                case 41: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C15621Ufn.super.onFail(r8)
            return
        L_0x0009:
            r0 = 788833056(0x2f04a320, float:1.2063284E-10)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            java.lang.Throwable r1 = r8.A01()
            boolean r0 = r1 instanceof java.lang.Exception
            if (r0 == 0) goto L_0x001c
            java.lang.Exception r1 = (java.lang.Exception) r1
            if (r1 != 0) goto L_0x0023
        L_0x001c:
            java.lang.String r0 = "Failed to allocate turn."
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
        L_0x0023:
            java.lang.Object r0 = r7.A01
            X.Vul r0 = (X.C18594Vul) r0
            X.C18594Vul.A01(r0, r1)
            r0 = 886069796(0x34d05a24, float:3.8808605E-7)
            goto L_0x04a6
        L_0x002f:
            r0 = 529121262(0x1f89bfee, float:5.833928E-20)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r7.A01
            X.WPg r0 = (X.C19200WPg) r0
            android.content.Context r2 = r0.A02
            r1 = 2131974361(0x7f1358d9, float:1.9585784E38)
            java.lang.String r0 = "story_bulk_like_failed"
            X.C59689JTv.A0F(r2, r0, r1)
            r0 = -775090326(0xffffffffd1cd0f6a, float:-1.10090863E11)
            goto L_0x04a6
        L_0x0049:
            r0 = -2090284196(0xffffffff8368cb5c, float:-6.8412117E-37)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r7.A01
            android.content.Context r2 = (android.content.Context) r2
            r1 = 2131974361(0x7f1358d9, float:1.9585784E38)
            java.lang.String r0 = "story_bulk_like_failed"
            X.C59689JTv.A0F(r2, r0, r1)
            r0 = -147991731(0xfffffffff72dd34d, float:-3.5255978E33)
            goto L_0x04a6
        L_0x0061:
            r0 = -548777577(0xffffffffdf4a5197, float:-1.45786E19)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r7.A01
            X.Wfz r5 = (X.C19818Wfz) r5
            androidx.fragment.app.FragmentActivity r4 = r5.A00
            r2 = 2131972232(0x7f135088, float:1.9581466E38)
            r1 = 1
            r0 = 3518(0xdbe, float:4.93E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C59689JTv.A01(r4, r0, r2, r1)
            X.1WW r1 = r5.A03
            java.lang.String r0 = "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93"
            r1.A05(r0)
            r0 = 665450051(0x27a9f643, float:4.717392E-15)
            goto L_0x04a6
        L_0x0087:
            r0 = -2036191933(0xffffffff86a22d43, float:-6.1004133E-35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r7.A01
            X.Vgl r0 = (X.C17832Vgl) r0
            X.Ubh r2 = r0.A00
            com.instagram.ui.widget.refresh.RefreshableListView r1 = r2.A0D
            if (r1 == 0) goto L_0x009c
            r0 = 0
            r1.setIsLoading(r0)
        L_0x009c:
            com.instagram.ui.emptystaterow.EmptyStateView r0 = r2.A0C
            if (r0 == 0) goto L_0x00a3
            r0.A0J()
        L_0x00a3:
            r0 = 549939450(0x20c768fa, float:3.378138E-19)
            goto L_0x04a6
        L_0x00a8:
            r0 = -1486032112(0xffffffffa76cf310, float:-3.2883344E-15)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Throwable r0 = r8.A01()
            java.lang.Object r1 = r7.A01
            X.X6j r1 = (X.C20956X6j) r1
            if (r0 != 0) goto L_0x00c2
            r0 = 0
        L_0x00ba:
            r1.DKV(r0)
            r0 = -86206948(0xfffffffffadc961c, float:-5.7267494E35)
            goto L_0x04a6
        L_0x00c2:
            java.lang.String r0 = r0.getLocalizedMessage()
            goto L_0x00ba
        L_0x00c7:
            r0 = 1378233807(0x52262dcf, float:1.78433278E11)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r7.A01
            X.VjY r1 = (X.C17996VjY) r1
            X.6vv r0 = X.C322496vv.Closed
            r1.A00 = r0
            X.VOC r0 = r1.A04
            X.Ube r0 = r0.A00
            X.C15381Ube.A03(r0)
            r0 = -1968455723(0xffffffff8aabbfd5, float:-1.653886E-32)
            goto L_0x04a6
        L_0x00e2:
            r0 = 544811199(0x207928bf, float:2.1104602E-19)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C15621Ufn.super.onFail(r8)
            java.lang.Object r2 = r7.A01
            X.W1j r2 = (X.C18783W1j) r2
            X.Vku r0 = r2.A02
            r0.A01()
            X.C18783W1j.A00(r2)
            X.FEd r1 = X.FA1.A01
            com.instagram.common.session.UserSession r0 = r2.A04
            r1.A02(r0)
            java.lang.ref.WeakReference r0 = r2.A05
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "add_all_feed_favorites_request_failure"
            X.C48774Ejx.A00(r1, r8, r0)
            r0 = -1515555975(0xffffffffa5aa7379, float:-2.9568546E-16)
            goto L_0x04a6
        L_0x0111:
            r0 = -122361810(0xfffffffff8b4e82e, float:-2.935383E34)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r7.A01
            X.Ugw r2 = (X.C15691Ugw) r2
            r0 = 0
            r2.A04 = r0
            java.lang.String r1 = "FeedFavoritesListController"
            java.lang.String r0 = "Failed to load Feed Favorites."
            X.0KC.A0C(r1, r0)
            X.C15691Ugw.A00(r2)
            X.C15691Ugw.A01(r2)
            r0 = -1796425408(0xffffffff94ecb940, float:-2.3902978E-26)
            goto L_0x04a6
        L_0x0131:
            r0 = -381681427(0xffffffffe94000ed, float:-1.4507383E25)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            X.C15621Ufn.super.onFail(r8)
            java.lang.Object r0 = r7.A01
            X.X6U r0 = (X.X6U) r0
            r0.DED()
            r0 = 269501776(0x10104550, float:2.845239E-29)
            goto L_0x04a6
        L_0x0147:
            r0 = 1896397936(0x7108bc70, float:6.770843E29)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            X.C15621Ufn.super.onFail(r8)
            java.lang.Object r0 = r7.A01
            X.X6S r0 = (X.X6S) r0
            r0.Dv1()
            r0 = -328642498(0xffffffffec69503e, float:-1.1282346E27)
            goto L_0x04a6
        L_0x015d:
            r0 = -1922830737(0xffffffff8d63ee6f, float:-7.023678E-31)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            X.C15621Ufn.super.onFail(r8)
            java.lang.Object r0 = r7.A01
            X.X6T r0 = (X.X6T) r0
            r0.DED()
            r0 = 1948263830(0x74202596, float:5.0752553E31)
            goto L_0x04a6
        L_0x0173:
            r0 = -667417870(0xffffffffd83802f2, float:-8.0929116E14)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r7.A01
            X.UaR r5 = (X.C15319UaR) r5
            X.0eM r0 = r5.A05
            X.WGU r4 = X.C13990Tnq.A0M(r0)
            X.UzE r0 = X.C16678UzE.NON_DISCRIMINATION
            java.lang.String r2 = r0.toString()
            java.lang.String r1 = "ACCEPTED_NON_DISCRIMINATION"
            r0 = 983(0x3d7, float:1.377E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0V(r2, r1, r0)
            android.content.Context r2 = r5.requireContext()
            r0 = 2131970584(0x7f134a18, float:1.9578123E38)
            java.lang.String r0 = r5.getString(r0)
            r1 = 0
            X.C59689JTv.A09(r2, r0)
            X.Vw9 r0 = r5.A00
            if (r0 != 0) goto L_0x01ac
            java.lang.String r0 = "acceptButtonHolder"
            goto L_0x03cc
        L_0x01ac:
            r0.A05(r1)
            r0 = -54862551(0xfffffffffcbadd29, float:-7.762023E36)
            goto L_0x04a6
        L_0x01b4:
            r0 = -1972987727(0xffffffff8a6698b1, float:-1.1102815E-32)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            java.lang.Throwable r1 = r8.A01()
            if (r1 == 0) goto L_0x01c8
            java.lang.Object r0 = r7.A01
            X.DQt r0 = (X.C46215DQt) r0
            X.C45891D9u.A02(r0, r1)
        L_0x01c8:
            r0 = 864195230(0x3382929e, float:6.080266E-8)
            goto L_0x04a6
        L_0x01cd:
            r0 = -1558884281(0xffffffffa3155047, float:-8.0943056E-18)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r8, r6)
            java.lang.Object r5 = r7.A01
            X.UZd r5 = (X.C15275UZd) r5
            X.0eM r0 = r5.A0G
            X.WGU r4 = X.C13990Tnq.A0M(r0)
            X.UzE r0 = X.C16678UzE.ERROR
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r1 = r8.A01()
            java.lang.String r0 = "page_created"
            r4.A0Y(r2, r0, r1)
            X.Vw9 r0 = r5.A06
            if (r0 == 0) goto L_0x024d
            r0.A05(r6)
            r0 = 2131970528(0x7f1349e0, float:1.957801E38)
            java.lang.String r1 = X.DbU.A0m(r5, r0)
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x0208
            X.C59689JTv.A09(r0, r1)
        L_0x0208:
            r0 = 250552039(0xeef1ee7, float:5.8947807E-30)
            goto L_0x04a6
        L_0x020d:
            r0 = 2133425915(0x7f297efb, float:2.2529885E38)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r8, r6)
            java.lang.Object r5 = r7.A01
            X.UZd r5 = (X.C15275UZd) r5
            X.0eM r0 = r5.A0G
            X.WGU r4 = X.C13990Tnq.A0M(r0)
            X.UzE r0 = X.C16678UzE.ERROR
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r1 = r8.A01()
            java.lang.String r0 = "take_page_onwership"
            r4.A0Y(r2, r0, r1)
            X.Vw9 r0 = r5.A06
            if (r0 == 0) goto L_0x024d
            r0.A05(r6)
            r0 = 2131970525(0x7f1349dd, float:1.9578004E38)
            java.lang.String r1 = X.DbU.A0m(r5, r0)
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x0248
            X.C59689JTv.A09(r0, r1)
        L_0x0248:
            r0 = 643490072(0x265ae118, float:7.5939E-16)
            goto L_0x04a6
        L_0x024d:
            java.lang.String r0 = "actionButtonHolder"
            goto L_0x03cc
        L_0x0251:
            r0 = -1831294152(0xffffffff92d8ab38, float:-1.3673725E-27)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            java.lang.Object r4 = r7.A01
            X.UZX r4 = (X.UZX) r4
            r0 = 2131970637(0x7f134a4d, float:1.957823E38)
            java.lang.String r2 = X.DbU.A0m(r4, r0)
            r4.requireActivity()
            X.C13990Tnq.A0h()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "error_description"
            r1.putString(r0, r2)
            X.UZG r2 = new X.UZG
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r1, r2, r4)
            X.0eM r0 = r4.A0C
            X.Dbc.A0S(r2, r1, r0)
            java.lang.Throwable r0 = r8.A01()
            java.lang.String r1 = X.DbX.A0t(r0)
            java.lang.String r0 = "paused"
            X.UZX.A01(r4, r0, r1)
            r0 = 1572884608(0x5dc05080, float:1.7322146E18)
            goto L_0x04a6
        L_0x0293:
            r0 = -833481241(0xffffffffce5215e7, float:-8.8116269E8)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            X.C15621Ufn.super.onFail(r8)
            java.lang.Object r6 = r7.A01
            X.UZX r6 = (X.UZX) r6
            X.0eM r0 = r6.A09
            java.lang.Object r5 = r0.getValue()
            X.VwK r5 = (X.C18662VwK) r5
            java.lang.String r4 = r6.A04
            if (r4 != 0) goto L_0x02b1
            java.lang.String r0 = "mediaId"
            goto L_0x03cc
        L_0x02b1:
            java.lang.Throwable r0 = r8.A01()
            if (r0 == 0) goto L_0x02bd
            java.lang.String r2 = r0.toString()
            if (r2 != 0) goto L_0x02bf
        L_0x02bd:
            java.lang.String r2 = ""
        L_0x02bf:
            java.lang.String r1 = "campaign_controls"
            java.lang.String r0 = "ads_manager"
            r5.A09(r1, r0, r4, r2)
            r4 = 2131961756(0x7f13279c, float:1.9560218E38)
            java.lang.String r2 = r6.getString(r4)
            android.content.Context r1 = r6.requireContext()
            if (r2 == 0) goto L_0x02d9
            int r0 = r2.length()
            if (r0 != 0) goto L_0x02dd
        L_0x02d9:
            java.lang.String r2 = r6.getString(r4)
        L_0x02dd:
            X.C59689JTv.A09(r1, r2)
            r0 = -1714921619(0xffffffff99c85f6d, float:-2.0718057E-23)
            goto L_0x04a6
        L_0x02e5:
            r0 = 1417740096(0x5480ff40, float:4.4323056E12)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            java.lang.Object r4 = r7.A01
            X.UZX r4 = (X.UZX) r4
            r0 = 2131970359(0x7f134937, float:1.9577667E38)
            java.lang.String r2 = X.DbU.A0m(r4, r0)
            r4.requireActivity()
            X.C13990Tnq.A0h()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r0 = "error_description"
            r1.putString(r0, r2)
            X.UZG r2 = new X.UZG
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r1, r2, r4)
            X.0eM r0 = r4.A0C
            X.Dbc.A0S(r2, r1, r0)
            java.lang.Throwable r0 = r8.A01()
            java.lang.String r1 = X.DbX.A0t(r0)
            java.lang.String r0 = "delete"
            X.UZX.A01(r4, r0, r1)
            r0 = 1210099717(0x4820a805, float:164512.08)
            goto L_0x04a6
        L_0x0327:
            r0 = 77663357(0x4a10c7d, float:3.7862387E-36)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            X.C15621Ufn.super.onFail(r8)
            java.lang.Object r5 = r7.A01
            X.UaU r5 = (X.C15322UaU) r5
            X.WGU r4 = r5.A03
            if (r4 == 0) goto L_0x0348
            X.UzE r0 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r1 = r8.A01()
            java.lang.String r0 = "hec_appeal"
            r4.A0Y(r2, r0, r1)
        L_0x0348:
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L_0x0354
            r0 = 2131961756(0x7f13279c, float:1.9560218E38)
            X.DbZ.A0w(r1, r5, r0)
        L_0x0354:
            r0 = -1563218235(0xffffffffa2d32ec5, float:-5.7241184E-18)
            goto L_0x04a6
        L_0x0359:
            r0 = -650395570(0xffffffffd93bc04e, float:-3.30295387E15)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            X.C15621Ufn.super.onFail(r8)
            java.lang.Object r5 = r7.A01
            X.UZg r5 = (X.C15278UZg) r5
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x039d
            X.WGU r4 = r5.A02
            if (r4 == 0) goto L_0x0393
            X.UzE r0 = X.C16678UzE.UPDATE_AUTO_AUDIENCE_LOCATION
            java.lang.String r2 = r0.toString()
            com.instagram.business.promote.model.PromoteData r0 = r5.A05
            if (r0 != 0) goto L_0x037e
            java.lang.String r0 = "promoteData"
            goto L_0x03cc
        L_0x037e:
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0p
            java.util.List r0 = r0.A07
            if (r0 == 0) goto L_0x03a2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x03a2
            java.lang.String r1 = "edit_auto_audience_location"
        L_0x038c:
            java.lang.Throwable r0 = r8.A01()
            r4.A0Y(r2, r1, r0)
        L_0x0393:
            android.content.Context r1 = r5.getContext()
            r0 = 2131970311(0x7f134907, float:1.957757E38)
            X.DbZ.A0w(r1, r5, r0)
        L_0x039d:
            r0 = 1527172057(0x5b06cbd9, float:3.794178E16)
            goto L_0x04a6
        L_0x03a2:
            java.lang.String r1 = "delete_auto_audience_location"
            goto L_0x038c
        L_0x03a5:
            r0 = -89919315(0xfffffffffaa3f0ad, float:-4.2561294E35)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            X.C15621Ufn.super.onFail(r8)
            java.lang.Object r0 = r7.A01
            X.Uac r0 = (X.C15328Uac) r0
            X.C15328Uac.A05(r0)
            r0 = 1394100704(0x531849e0, float:6.5407445E11)
            goto L_0x04a6
        L_0x03bb:
            r0 = -1476110109(0xffffffffa80458e3, float:-7.346746E-15)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r7.A01
            X.Uac r0 = (X.C15328Uac) r0
            X.VwK r4 = r0.A07
            if (r4 != 0) goto L_0x03d4
            java.lang.String r0 = "adsManagerLogger"
        L_0x03cc:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03d4:
            r2 = 0
            r0 = 386(0x182, float:5.41E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "ads_manager"
            r4.A09(r1, r0, r2, r2)
            r0 = -650981426(0xffffffffd932cfce, float:-3.14568935E15)
            goto L_0x04a6
        L_0x03e5:
            r0 = 535744681(0x1feed0a9, float:1.0114212E-19)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r7.A01
            X.UZU r0 = (X.UZU) r0
            X.UZU.A02(r0)
            r0 = -789644781(0xffffffffd0eefa13, float:-3.20749302E10)
            goto L_0x04a6
        L_0x03f8:
            r0 = -1878237890(0xffffffff900c5d3e, float:-2.7681963E-29)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            X.C15621Ufn.super.onFail(r8)
            java.lang.Object r0 = r7.A01
            X.UZU r0 = (X.UZU) r0
            X.UZU.A01(r0)
            r0 = -840109906(0xffffffffcdecf0ae, float:-4.9689952E8)
            goto L_0x04a6
        L_0x040e:
            r0 = -5592773(0xffffffffffaaa93b, float:NaN)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            java.lang.Object r0 = r7.A01
            X.Vsg r0 = (X.C18485Vsg) r0
            java.lang.Throwable r2 = r8.A01()
            java.util.List r0 = r0.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0423:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0433
            java.lang.Object r0 = r1.next()
            X.X6K r0 = (X.X6K) r0
            r0.onError(r2)
            goto L_0x0423
        L_0x0433:
            r0 = 1378517459(0x522a81d3, float:1.83080632E11)
            goto L_0x04a6
        L_0x0437:
            r0 = -1329699503(0xffffffffb0be6551, float:-1.3853115E-9)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            java.lang.Object r0 = r7.A01
            X.Vsg r0 = (X.C18485Vsg) r0
            java.lang.Throwable r2 = r8.A01()
            java.util.List r0 = r0.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x044c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x045c
            java.lang.Object r0 = r1.next()
            X.X6K r0 = (X.X6K) r0
            r0.onError(r2)
            goto L_0x044c
        L_0x045c:
            r0 = 1641419756(0x61d613ec, float:4.9362984E20)
            goto L_0x04a6
        L_0x0460:
            r0 = -962217749(0xffffffffc6a5b8eb, float:-21212.459)
            int r3 = X.AnonymousClass7TG.A0D(r8, r0)
            java.lang.Object r2 = r7.A01
            X.Q4D r2 = (X.Q4D) r2
            java.util.concurrent.Executor r1 = r2.A02
            X.THR r0 = new X.THR
            r0.<init>(r2, r8)
            r1.execute(r0)
            r0 = 1580517613(0x5e34c8ed, float:3.25673063E18)
            goto L_0x04a6
        L_0x0479:
            r0 = -1621337476(0xffffffff9f5c5a7c, float:-4.666166E-20)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r7.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "fetchPeopleList_error"
            X.C59689JTv.A0A(r1, r0)
            r0 = -1564434448(0xffffffffa2c09ff0, float:-5.2211045E-18)
            goto L_0x04a6
        L_0x0491:
            r0 = 217004529(0xcef39f1, float:3.6858653E-31)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 240471779(0xe554ee3, float:2.629226E-30)
            goto L_0x04a6
        L_0x049c:
            r0 = -665689441(0xffffffffd852629f, float:-9.2528406E14)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = -1948398099(0xffffffff8bddcded, float:-8.5435946E-32)
        L_0x04a6:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15621Ufn.onFail(X.4dm):void");
    }

    public final void onFailInBackground(C268654dm r5) {
        int i;
        int i2;
        switch (this.A00) {
            case 32:
                i = AnonymousClass0fD.A03(-1646812541);
                AdBakeOffFragment adBakeOffFragment = (AdBakeOffFragment) this.A01;
                adBakeOffFragment.requireActivity().runOnUiThread(new C20030Wjq(adBakeOffFragment));
                i2 = -178487997;
                break;
            case 33:
                i = AnonymousClass0fD.A03(-1692103774);
                GenericSurveyFragment genericSurveyFragment = (GenericSurveyFragment) this.A01;
                genericSurveyFragment.requireActivity().runOnUiThread(new C20031Wjr(genericSurveyFragment));
                i2 = 1079386635;
                break;
            default:
                C15621Ufn.super.onFailInBackground(r5);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0104, code lost:
        r1 = "actionBarButtonController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0149, code lost:
        r1 = "loadingSpinner";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014b, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0152, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0189, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFinish() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 1: goto L_0x0009;
                case 2: goto L_0x0023;
                case 6: goto L_0x005d;
                case 8: goto L_0x00a0;
                case 9: goto L_0x002f;
                case 11: goto L_0x00b3;
                case 13: goto L_0x00d0;
                case 14: goto L_0x0107;
                case 15: goto L_0x011d;
                case 16: goto L_0x0133;
                case 28: goto L_0x0153;
                case 37: goto L_0x0172;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C15621Ufn.super.onFinish()
            return
        L_0x0009:
            r0 = 1579860543(0x5e2ac23f, float:3.0761166E18)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r8.A01
            com.instagram.archive.fragment.ArchiveReelPeopleFragment r2 = (com.instagram.archive.fragment.ArchiveReelPeopleFragment) r2
            r1 = 0
            boolean r0 = r2.A01
            if (r0 == r1) goto L_0x001e
            r2.A01 = r1
            com.instagram.archive.fragment.ArchiveReelPeopleFragment.A00(r2)
        L_0x001e:
            r0 = -42445077(0xfffffffffd7856eb, float:-2.063124E37)
            goto L_0x0189
        L_0x0023:
            r0 = 2141299135(0x7fa1a1bf, float:NaN)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r0 = 482072106(0x1cbbd62a, float:1.2429982E-21)
            goto L_0x0189
        L_0x002f:
            r0 = 699661083(0x29b3fb1b, float:7.992757E-14)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r7 = r8.A01
            X.Uac r7 = (X.C15328Uac) r7
            boolean r0 = r7.A0V
            if (r0 != 0) goto L_0x0055
            X.WT7 r6 = r7.A08
            if (r6 != 0) goto L_0x0046
            java.lang.String r1 = "userFlowLogger"
            goto L_0x014b
        L_0x0046:
            long r4 = r6.A00
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            X.1QP r1 = r6.A01
            java.lang.String r0 = "ads_manager_suggested_boost_loaded"
            r1.flowMarkPoint(r4, r0)
        L_0x0055:
            X.C15328Uac.A05(r7)
            r0 = 978693704(0x3a55ae48, float:8.151275E-4)
            goto L_0x0189
        L_0x005d:
            r0 = 2066174810(0x7b27535a, float:8.6880415E35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r8.A01
            X.UZU r4 = (X.UZU) r4
            X.3As r0 = r4.A03
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = "recyclerViewProxy"
        L_0x006e:
            X.0qQ.A0F(r0)
            goto L_0x014e
        L_0x0073:
            r2 = 0
            r0.EaP(r2)
            X.3AD r0 = r4.A04
            java.lang.String r1 = "pullToRefresh"
            if (r0 == 0) goto L_0x014b
            r0.setIsLoading(r2)
            X.3AD r0 = r4.A04
            if (r0 == 0) goto L_0x014b
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x009b
            X.UdV r1 = r4.A01
            if (r1 != 0) goto L_0x008f
            java.lang.String r0 = "promoteAdToolsAdapter"
            goto L_0x006e
        L_0x008f:
            java.util.List r0 = r4.A0A
            r1.A01(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A05
            if (r0 == 0) goto L_0x009b
            X.JTO.A1X(r0)
        L_0x009b:
            r0 = -940760602(0xffffffffc7ed21e6, float:-121411.8)
            goto L_0x0189
        L_0x00a0:
            r0 = -1671561229(0xffffffff9c5dfff3, float:-7.3453573E-22)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            X.Uac r0 = (X.C15328Uac) r0
            X.C15328Uac.A05(r0)
            r0 = 661191896(0x2768fcd8, float:3.2333535E-15)
            goto L_0x0189
        L_0x00b3:
            r0 = 1946366105(0x74033099, float:4.157572E31)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C15621Ufn.super.onFinish()
            java.lang.Object r0 = r8.A01
            X.UZg r0 = (X.C15278UZg) r0
            X.Vvl r0 = r0.A04
            if (r0 == 0) goto L_0x0104
            r1 = 0
            X.2da r0 = r0.A01
            r0.setIsLoading(r1)
            r0 = -1625717304(0xffffffff9f1985c8, float:-3.250967E-20)
            goto L_0x0189
        L_0x00d0:
            r0 = -1078378236(0xffffffffbfb94104, float:-1.4472966)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C15621Ufn.super.onFinish()
            java.lang.Object r2 = r8.A01
            X.UaU r2 = (X.C15322UaU) r2
            X.Vvl r0 = r2.A04
            if (r0 == 0) goto L_0x0104
            r1 = 0
            X.2da r0 = r0.A01
            r0.setIsLoading(r1)
            X.0eM r0 = r2.A0M
            java.lang.Object r6 = r0.getValue()
            X.WT6 r6 = (X.WT6) r6
            long r4 = r6.A00
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ff
            X.1QP r1 = r6.A01
            java.lang.String r0 = "promote_audience_hec_appeal_rendered"
            r1.flowMarkPoint(r4, r0)
        L_0x00ff:
            r0 = 497158692(0x1da20a24, float:4.289153E-21)
            goto L_0x0189
        L_0x0104:
            java.lang.String r1 = "actionBarButtonController"
            goto L_0x014b
        L_0x0107:
            r0 = -1912780442(0xffffffff8dfd4966, float:-1.5609999E-30)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            X.UZX r0 = (X.UZX) r0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r0.A01
            if (r0 == 0) goto L_0x0149
            X.JTO.A1X(r0)
            r0 = 493529488(0x1d6aa990, float:3.1057304E-21)
            goto L_0x0189
        L_0x011d:
            r0 = -688829320(0xffffffffd6f14c78, float:-1.32655367E14)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            X.UZX r0 = (X.UZX) r0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r0.A01
            if (r0 == 0) goto L_0x0149
            X.JTO.A1X(r0)
            r0 = 2003314079(0x7768259f, float:4.7084997E33)
            goto L_0x0189
        L_0x0133:
            r0 = 186436521(0xb1ccba9, float:3.0197724E-32)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            X.UZX r0 = (X.UZX) r0
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r0.A01
            if (r0 == 0) goto L_0x0149
            X.JTO.A1X(r0)
            r0 = -2071539960(0xffffffff8486cf08, float:-3.1693377E-36)
            goto L_0x0189
        L_0x0149:
            java.lang.String r1 = "loadingSpinner"
        L_0x014b:
            X.0qQ.A0F(r1)
        L_0x014e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0153:
            r0 = 435279281(0x19f1d5b1, float:2.5005125E-23)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            X.Vhn r0 = (X.C17896Vhn) r0
            java.util.Set r0 = r0.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0164:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x016e
            r1.next()
            goto L_0x0164
        L_0x016e:
            r0 = 1963724113(0x750c0d51, float:1.7753702E32)
            goto L_0x0189
        L_0x0172:
            r0 = 2041700101(0x79b1df05, float:1.1544499E35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r8.A01
            X.Wfz r0 = (X.C19818Wfz) r0
            X.1WW r2 = r0.A03
            X.V43 r1 = r0.A02
            java.lang.String r0 = "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93"
            r2.A06(r0, r1)
            r0 = 1824785794(0x6cc40582, float:1.8958038E27)
        L_0x0189:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15621Ufn.onFinish():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e6, code lost:
        r1 = "actionBarButtonController";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0149, code lost:
        r1 = "loadingSpinner";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014b, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0152, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017c, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onStart() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 1: goto L_0x0009;
                case 2: goto L_0x0023;
                case 6: goto L_0x002f;
                case 8: goto L_0x0070;
                case 9: goto L_0x0083;
                case 10: goto L_0x0096;
                case 11: goto L_0x00ac;
                case 13: goto L_0x00c9;
                case 14: goto L_0x00e9;
                case 15: goto L_0x010a;
                case 16: goto L_0x0128;
                case 28: goto L_0x0153;
                case 37: goto L_0x0172;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C15621Ufn.super.onStart()
            return
        L_0x0009:
            r0 = 1543434216(0x5bfeefe8, float:1.43516848E17)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r5.A01
            com.instagram.archive.fragment.ArchiveReelPeopleFragment r3 = (com.instagram.archive.fragment.ArchiveReelPeopleFragment) r3
            r1 = 1
            boolean r0 = r3.A01
            if (r0 == r1) goto L_0x001e
            r3.A01 = r1
            com.instagram.archive.fragment.ArchiveReelPeopleFragment.A00(r3)
        L_0x001e:
            r0 = -419368657(0xffffffffe700f12f, float:-6.0891196E23)
            goto L_0x017c
        L_0x0023:
            r0 = -1872373836(0xffffffff9065d7b4, float:-4.5328458E-29)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 2053190460(0x7a61333c, float:2.9232649E35)
            goto L_0x017c
        L_0x002f:
            r0 = 92303399(0x5807027, float:1.207826E-35)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r5.A01
            X.UZU r4 = (X.UZU) r4
            X.3As r0 = r4.A03
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "recyclerViewProxy"
        L_0x0040:
            X.0qQ.A0F(r0)
            goto L_0x014e
        L_0x0045:
            r3 = 1
            r0.EaP(r3)
            X.3AD r0 = r4.A04
            java.lang.String r1 = "pullToRefresh"
            if (r0 == 0) goto L_0x014b
            r0.setIsLoading(r3)
            X.3AD r0 = r4.A04
            if (r0 == 0) goto L_0x014b
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x006b
            X.UdV r0 = r4.A01
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "promoteAdToolsAdapter"
            goto L_0x0040
        L_0x0061:
            X.C15480UdV.A00(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r4.A05
            if (r0 == 0) goto L_0x006b
            X.DbS.A1T(r0)
        L_0x006b:
            r0 = -332393585(0xffffffffec30138f, float:-8.514532E26)
            goto L_0x017c
        L_0x0070:
            r0 = 303014324(0x120fa1b4, float:4.532216E-28)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.Uac r0 = (X.C15328Uac) r0
            X.C15328Uac.A06(r0)
            r0 = 1982021556(0x76233fb4, float:8.2777E32)
            goto L_0x017c
        L_0x0083:
            r0 = -497545006(0xffffffffe25810d2, float:-9.964272E20)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.Uac r0 = (X.C15328Uac) r0
            X.C15328Uac.A06(r0)
            r0 = -1621977622(0xffffffff9f5295ea, float:-4.4593236E-20)
            goto L_0x017c
        L_0x0096:
            r0 = -865189123(0xffffffffcc6e42fd, float:-6.2458868E7)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C15621Ufn.super.onStart()
            java.lang.Object r0 = r5.A01
            X.Uac r0 = (X.C15328Uac) r0
            X.C15328Uac.A06(r0)
            r0 = 812538530(0x306e5aa2, float:8.671269E-10)
            goto L_0x017c
        L_0x00ac:
            r0 = 56477904(0x35dc8d0, float:6.5176584E-37)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C15621Ufn.super.onStart()
            java.lang.Object r0 = r5.A01
            X.UZg r0 = (X.C15278UZg) r0
            X.Vvl r0 = r0.A04
            if (r0 == 0) goto L_0x00e6
            r1 = 1
            X.2da r0 = r0.A01
            r0.setIsLoading(r1)
            r0 = -498034288(0xffffffffe2509990, float:-9.61997E20)
            goto L_0x017c
        L_0x00c9:
            r0 = 1059442304(0x3f25ce80, float:0.6476822)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C15621Ufn.super.onStart()
            java.lang.Object r0 = r5.A01
            X.UaU r0 = (X.C15322UaU) r0
            X.Vvl r0 = r0.A04
            if (r0 == 0) goto L_0x00e6
            r1 = 1
            X.2da r0 = r0.A01
            r0.setIsLoading(r1)
            r0 = 46644464(0x2c7bcf0, float:2.9348867E-37)
            goto L_0x017c
        L_0x00e6:
            java.lang.String r1 = "actionBarButtonController"
            goto L_0x014b
        L_0x00e9:
            r0 = 2116986142(0x7e2ea51e, float:5.803575E37)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C15621Ufn.super.onStart()
            java.lang.Object r1 = r5.A01
            X.UZX r1 = (X.UZX) r1
            java.util.List r0 = r1.A07
            r0.clear()
            X.UAF.A00(r1, r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r1.A01
            if (r0 == 0) goto L_0x0149
            X.DbS.A1T(r0)
            r0 = -750732443(0xffffffffd340bb65, float:-8.2777768E11)
            goto L_0x017c
        L_0x010a:
            r0 = -564982228(0xffffffffde530e2c, float:-3.80203534E18)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r5.A01
            X.UZX r1 = (X.UZX) r1
            java.util.List r0 = r1.A07
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0124
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r1.A01
            if (r0 == 0) goto L_0x0149
            X.DbS.A1T(r0)
        L_0x0124:
            r0 = 520826202(0x1f0b2d5a, float:2.947191E-20)
            goto L_0x017c
        L_0x0128:
            r0 = 1052260905(0x3eb83a29, float:0.35981873)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C15621Ufn.super.onStart()
            java.lang.Object r1 = r5.A01
            X.UZX r1 = (X.UZX) r1
            java.util.List r0 = r1.A07
            r0.clear()
            X.UAF.A00(r1, r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r1.A01
            if (r0 == 0) goto L_0x0149
            X.DbS.A1T(r0)
            r0 = 678833700(0x28762e24, float:1.3665748E-14)
            goto L_0x017c
        L_0x0149:
            java.lang.String r1 = "loadingSpinner"
        L_0x014b:
            X.0qQ.A0F(r1)
        L_0x014e:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0153:
            r0 = -1609917549(0xffffffffa00a9b93, float:-1.174053E-19)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.Vhn r0 = (X.C17896Vhn) r0
            java.util.Set r0 = r0.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0164:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x016e
            r1.next()
            goto L_0x0164
        L_0x016e:
            r0 = 362426013(0x159a2e9d, float:6.227365E-26)
            goto L_0x017c
        L_0x0172:
            r0 = 525739454(0x1f5625be, float:4.5347482E-20)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 1068563387(0x3fb0fbbb, float:1.3826822)
        L_0x017c:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15621Ufn.onStart():void");
    }

    /* JADX WARNING: type inference failed for: r2v22, types: [X.WBH] */
    /* JADX WARNING: type inference failed for: r2v24, types: [X.WB5] */
    /* JADX WARNING: type inference failed for: r2v25, types: [X.WB5] */
    /* JADX WARNING: type inference failed for: r3v13, types: [X.V42, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v152, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v165, types: [com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v219, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x030c, code lost:
        if (r1 == com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum.A04) goto L_0x030e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0466, code lost:
        if (r2 != null) goto L_0x0468;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05b2, code lost:
        if (r2 != null) goto L_0x05b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x093e, code lost:
        if (r4.length() == 0) goto L_0x0940;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0a94, code lost:
        if (r1 != com.instagram.api.schemas.InstagramMediaProductType.A0k) goto L_0x0a96;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0cff, code lost:
        X.AnonymousClass0fD.A0A(r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0d02, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0d61, code lost:
        X.AnonymousClass0fD.A0A(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x0d64, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x12b3, code lost:
        X.0qQ.A0F(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x12ba, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x12e2, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x12e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:706:0x140a, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:717:0x144b, code lost:
        if (r0.A01 == true) goto L_0x144d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:732:0x1478, code lost:
        if (r1 != null) goto L_0x144d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:774:0x1561, code lost:
        if (r0.A01 == true) goto L_0x1563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:789:0x158e, code lost:
        if (r1 != null) goto L_0x1563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:832:0x165a, code lost:
        X.AnonymousClass0fD.A0A(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:833:0x165d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:843:0x16cc, code lost:
        X.AnonymousClass0fD.A0A(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:844:0x16cf, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x0ebe  */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x0ee6  */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x0eee  */
    /* JADX WARNING: Removed duplicated region for block: B:514:0x0ef5  */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x0efd  */
    /* JADX WARNING: Removed duplicated region for block: B:516:0x0f04  */
    /* JADX WARNING: Removed duplicated region for block: B:517:0x0f0b  */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x0f0d  */
    /* JADX WARNING: Removed duplicated region for block: B:527:0x0f39  */
    /* JADX WARNING: Removed duplicated region for block: B:568:0x1000  */
    /* JADX WARNING: Removed duplicated region for block: B:571:0x100d  */
    /* JADX WARNING: Removed duplicated region for block: B:763:0x151f A[LOOP:10: B:761:0x1519->B:763:0x151f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:830:0x1647 A[LOOP:14: B:828:0x1641->B:830:0x1647, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:866:0x0ee0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r33) {
        /*
            r32 = this;
            r0 = r32
            r4 = r33
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x16a1;
                case 1: goto L_0x165e;
                case 2: goto L_0x0009;
                case 3: goto L_0x1534;
                case 4: goto L_0x141e;
                case 5: goto L_0x12fb;
                case 6: goto L_0x1299;
                case 7: goto L_0x11a7;
                case 8: goto L_0x1123;
                case 9: goto L_0x10f2;
                case 10: goto L_0x0dff;
                case 11: goto L_0x0d65;
                case 12: goto L_0x0d1f;
                case 13: goto L_0x0cb4;
                case 14: goto L_0x0c5e;
                case 15: goto L_0x0a15;
                case 16: goto L_0x09bf;
                case 17: goto L_0x098e;
                case 18: goto L_0x095d;
                case 19: goto L_0x088b;
                case 20: goto L_0x0815;
                case 21: goto L_0x0009;
                case 22: goto L_0x0009;
                case 23: goto L_0x07ec;
                case 24: goto L_0x07bf;
                case 25: goto L_0x0798;
                case 26: goto L_0x06dc;
                case 27: goto L_0x06b9;
                case 28: goto L_0x065f;
                case 29: goto L_0x0606;
                case 30: goto L_0x05e5;
                case 31: goto L_0x058b;
                case 32: goto L_0x0502;
                case 33: goto L_0x0488;
                case 34: goto L_0x044e;
                case 35: goto L_0x0427;
                case 36: goto L_0x0155;
                case 37: goto L_0x0130;
                case 38: goto L_0x00f5;
                case 39: goto L_0x00d2;
                case 40: goto L_0x00ab;
                case 41: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.C15621Ufn.super.onSuccess(r4)
            return
        L_0x000d:
            r1 = 836531384(0x31dc74b8, float:6.416112E-9)
            int r8 = X.AnonymousClass0fD.A03(r1)
            X.3JC r4 = (X.AnonymousClass3JC) r4
            r1 = -170618687(0xfffffffff5d490c1, float:-5.3891743E32)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r6 = 0
            X.0qQ.A0B(r4, r6)
            java.lang.Object r5 = r4.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x008d
            java.lang.Class<X.UQv> r4 = X.C15132UQv.class
            java.lang.String r2 = "ig_turn_discovery(request:$request)"
            r1 = -299042020(0xffffffffee2cfb1c, float:-1.3383749E28)
            X.3lr r1 = r5.getOptionalTreeField(r6, r2, r4, r1)
            if (r1 == 0) goto L_0x008d
            java.lang.Object r5 = r0.A01
            X.Vul r5 = (X.C18594Vul) r5
            java.lang.String r0 = "ip"
            java.lang.String r9 = r1.getOptionalStringField(r6, r0)
            java.lang.String r0 = "ip_6"
            java.lang.String r7 = r1.A08(r0)
            java.lang.String r0 = "ssl_tcp_port"
            java.lang.String r6 = r1.A09(r0)
            java.lang.String r0 = "tcp_port"
            java.lang.String r4 = r1.A0A(r0)
            java.lang.String r0 = "udp_port"
            java.lang.String r2 = r1.A0B(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009c }
            r1.<init>()     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = "<voicechat_discoverturn_response xmlns=\"http://api.facebook.com/1.0/\"  xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  xsi:schemaLocation=\"    http://api.facebook.com/1.0/ http://api.facebook.com/1.0/facebook.xsd\"><ip>"
            r1.append(r0)     // Catch:{ Exception -> 0x009c }
            r1.append(r9)     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = "</ip><ip_6>"
            r1.append(r0)     // Catch:{ Exception -> 0x009c }
            r1.append(r7)     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = "</ip_6><udp_port>"
            r1.append(r0)     // Catch:{ Exception -> 0x009c }
            r1.append(r2)     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = "</udp_port><tcp_port>"
            r1.append(r0)     // Catch:{ Exception -> 0x009c }
            r1.append(r4)     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = "</tcp_port><ssl_tcp_port>"
            r1.append(r0)     // Catch:{ Exception -> 0x009c }
            r1.append(r6)     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = "</ssl_tcp_port></voicechat_discoverturn_response>"
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)     // Catch:{ Exception -> 0x009c }
            X.C18594Vul.A02(r5, r0)     // Catch:{ Exception -> 0x009c }
            goto L_0x00a0
        L_0x008d:
            java.lang.String r2 = "turn discovery came back empty."
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r2)
            java.lang.Object r0 = r0.A01
            X.Vul r0 = (X.C18594Vul) r0
            X.C18594Vul.A01(r0, r1)
            goto L_0x00a0
        L_0x009c:
            r0 = move-exception
            X.C18594Vul.A01(r5, r0)
        L_0x00a0:
            r0 = 1149950174(0x448ad8de, float:1110.7771)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -658109059(0xffffffffd8c60d7d, float:-1.74208987E15)
            goto L_0x16cc
        L_0x00ab:
            r1 = -1107070824(0xffffffffbe037098, float:-0.1283592)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r1 = 1057066170(0x3f018cba, float:0.50605357)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r0 = r0.A01
            X.WPg r0 = (X.C19200WPg) r0
            android.content.Context r2 = r0.A02
            java.lang.String r1 = "story_bulk_like_failed"
            r0 = 2131974362(0x7f1358da, float:1.9585786E38)
            X.C59689JTv.A0F(r2, r1, r0)
            r0 = -687123989(0xffffffffd70b51eb, float:-1.53183951E14)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1482764344(0xffffffffa79ecfc8, float:-4.4079086E-15)
            goto L_0x165a
        L_0x00d2:
            r1 = 1981817375(0x7620221f, float:8.119722E32)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r1 = 1915338826(0x7229c04a, float:3.3622675E30)
            int r2 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131974362(0x7f1358da, float:1.9585786E38)
            X.C59689JTv.A07(r1, r0)
            r0 = -171225055(0xfffffffff5cb5021, float:-5.154597E32)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1065829924(0xffffffffc078b9dc, float:-3.886344)
            goto L_0x165a
        L_0x00f5:
            r1 = 2049651101(0x7a2b319d, float:2.2222226E35)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r1 = 1568141968(0x5d77f290, float:1.11665631E18)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r3 = r0.A01
            X.TrG r3 = (X.C14177TrG) r3
            X.1Ng r2 = r3.A09
            X.VgE r1 = r3.A01
            if (r1 == 0) goto L_0x0125
            X.WQF r0 = new X.WQF
            r0.<init>(r1)
            r2.A00(r0)
            X.7Pu r0 = r3.A00
            X.DbW.A1K(r0)
            r0 = -242844099(0xfffffffff1867e3d, float:-1.3319553E30)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -22542689(0xfffffffffea8069f, float:-1.1167234E38)
            goto L_0x12e2
        L_0x0125:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1945845040(0x73fb3d30, float:3.981041E31)
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x0130:
            r1 = -963378082(0xffffffffc694045e, float:-18946.184)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.DvS r4 = (X.DvS) r4
            r1 = -1908125289(0xffffffff8e445197, float:-2.419815E-30)
            int r2 = X.AnonymousClass0fD.A03(r1)
            X.F1D r1 = r4.A00
            java.lang.Object r0 = r0.A01
            X.Wfz r0 = (X.C19818Wfz) r0
            X.V43 r0 = r0.A02
            r0.A01 = r1
            r0 = -1434918117(0xffffffffaa78e31b, float:-2.2105618E-13)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -950209734(0xffffffffc75cf33a, float:-56563.227)
            goto L_0x165a
        L_0x0155:
            r1 = 1647775296(0x62370e40, float:8.4419525E20)
            int r11 = X.AnonymousClass0fD.A03(r1)
            X.UXf r4 = (X.C15245UXf) r4
            r1 = -2087464997(0xffffffff8393cfdb, float:-8.687605E-37)
            int r10 = X.AnonymousClass0fD.A03(r1)
            r9 = 0
            X.0qQ.A0B(r4, r9)
            java.lang.Object r0 = r0.A01
            X.Vgl r0 = (X.C17832Vgl) r0
            X.Ubh r12 = r0.A00
            com.instagram.ui.widget.refresh.RefreshableListView r0 = r12.A0D
            if (r0 == 0) goto L_0x0176
            r0.setIsLoading(r9)
        L_0x0176:
            X.VYF r1 = r4.A01
            if (r1 == 0) goto L_0x0f2c
            r12.A0A = r1
            java.lang.String r6 = "delegate"
            r19 = r6
            X.WWr r0 = r12.A0B
            if (r0 == 0) goto L_0x03fd
            r0.A04 = r1
            X.1Xl r0 = r12.A06
            if (r0 != 0) goto L_0x0190
            X.1Xj r0 = r4.A00
            if (r0 == 0) goto L_0x03e6
            r12.A06 = r0
        L_0x0190:
            X.1Xj r8 = r0.BPf()
            if (r8 == 0) goto L_0x0330
            X.WWr r0 = r12.A0B
            if (r0 == 0) goto L_0x03fd
            r0.A01 = r8
            X.UdH r0 = r12.A08
            java.lang.String r6 = "adapter"
            if (r0 == 0) goto L_0x03fd
            r0.A00 = r8
            X.2da r0 = r12.A05
            if (r0 == 0) goto L_0x01ab
            X.C15383Ubh.A02(r12)
        L_0x01ab:
            boolean r0 = r12.A0J
            r5 = 0
            if (r0 != 0) goto L_0x01c1
            android.os.Bundle r2 = r12.mArguments
            r1 = 1
            if (r2 == 0) goto L_0x03b3
            r0 = 2398(0x95e, float:3.36E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r9)
            if (r0 != r1) goto L_0x03b3
        L_0x01c1:
            X.UdH r3 = r12.A08
            if (r3 == 0) goto L_0x03fd
            X.VcT r0 = r4.A02
            if (r0 == 0) goto L_0x0423
            r3.A01 = r0
            X.1Xj r1 = r3.A00
            if (r1 != 0) goto L_0x01d2
            r3.A00 = r8
            r1 = r8
        L_0x01d2:
            com.instagram.common.session.UserSession r0 = r3.A05
            com.instagram.user.model.User r2 = r1.A2A(r0)
            if (r2 == 0) goto L_0x041e
            X.VcT r1 = r3.A01
            if (r1 == 0) goto L_0x01e4
            boolean r0 = r2.A1h()
            r1.A0A = r0
        L_0x01e4:
            X.VcT r1 = r3.A01
            if (r1 == 0) goto L_0x01f0
            X.4Cl r0 = r2.A03
            java.lang.String r0 = r0.C9e()
            r1.A07 = r0
        L_0x01f0:
            r3.A03 = r5
            X.C15466UdH.A00(r3)
            if (r5 == 0) goto L_0x0273
            android.content.Context r0 = r12.requireContext()
            X.6zK r13 = X.C324456zJ.A00(r0)
            r12.A07 = r13
            android.view.ViewGroup r7 = r12.A03
            if (r7 == 0) goto L_0x0273
            android.content.Context r1 = r12.requireContext()
            X.0eM r14 = r12.A0N
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r14)
            X.4DU r6 = r12.A0M
            X.GTF r5 = new X.GTF
            r5.<init>(r1, r0, r6)
            android.content.Context r15 = r12.requireContext()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r14)
            r3 = 1
            X.0qQ.A0B(r4, r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330020255318434(0x8111f6000041a2, double:3.038589326488398E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x03a0
            r1 = 2131627086(0x7f0e0c4e, float:1.8881426E38)
        L_0x0232:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r15)
            android.view.View r0 = X.DbU.A0A(r0, r7, r1, r9)
            X.GTD r4 = new X.GTD
            r4.<init>(r0)
            r0.setTag(r4)
            android.view.View r2 = r4.A01
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r14)
            X.WWr r0 = r12.A0B
            if (r0 == 0) goto L_0x0f2e
            X.GTH r14 = new X.GTH
            r14.<init>(r1, r6, r0)
            int r6 = r12.A01
            int r0 = r12.A00
            X.GTG r1 = new X.GTG
            r1.<init>(r6, r0)
            X.1Xl r0 = r12.A06
            if (r0 == 0) goto L_0x0273
            X.Jw9 r0 = r14.A00(r0, r1)
            r5.A00(r0, r4)
            r7.addView(r2)
            r7.invalidate()
            r13.A02(r2)
            r12.registerLifecycleListener(r13)
            r12.A0J = r3
        L_0x0273:
            X.0eM r3 = r12.A0N
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            com.instagram.user.model.User r5 = r8.A2A(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.6yW r0 = X.C324046yW.A00(r0)
            if (r5 == 0) goto L_0x02b3
            X.0xa r1 = r0.A00
            java.lang.String r0 = r5.getId()
            boolean r0 = r1.getBoolean(r0, r9)
            if (r0 == 0) goto L_0x02b3
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.6yW r0 = X.C324046yW.A00(r0)
            r4 = -1
            X.0xa r2 = r0.A00
            java.lang.String r1 = r5.getId()
            r0 = 1423(0x58f, float:1.994E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = X.002.A0R(r1, r0)
            int r0 = r2.getInt(r0, r4)
            X.C15383Ubh.A03(r12, r0)
        L_0x02b3:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            X.0Tu r5 = X.0Tu.A06
            r0 = 36318849045436926(0x8107cd000119fe, double:3.031524608376481E-306)
            boolean r0 = X.182.A06(r5, r2, r0)
            if (r0 == 0) goto L_0x0330
            X.1Xl r0 = r12.A06
            if (r0 == 0) goto L_0x0330
            boolean r0 = X.1sx.A0P(r0)
            if (r0 == 0) goto L_0x0330
            boolean r0 = r12.A0I
            if (r0 != 0) goto L_0x0330
            X.1Xl r6 = r12.A06
            int r2 = r12.A00
            android.content.Context r1 = r12.requireContext()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            r4 = 0
            com.instagram.model.androidlink.AndroidLink r13 = X.AnonymousClass47K.A02(r1, r0, r6, r2, r9)
            if (r13 == 0) goto L_0x0330
            X.1Xl r0 = r12.A06
            if (r0 == 0) goto L_0x039d
            X.1Xj r0 = r0.BPf()
            if (r0 == 0) goto L_0x039d
            X.1Xy r0 = r0.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x039d
            X.3xw r2 = r0.BFX()
        L_0x02fb:
            X.47L r1 = X.C271714jT.A01(r13)
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_WEB
            if (r1 != r0) goto L_0x030e
            if (r2 == 0) goto L_0x039a
            com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum r1 = r2.BFY()
        L_0x0309:
            com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum r0 = com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum.DEFAULT
            r8 = 1
            if (r1 != r0) goto L_0x030f
        L_0x030e:
            r8 = 0
        L_0x030f:
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r3)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36318849045830145(0x8107cd00071a01, double:3.031524608625154E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x033b
            android.os.Bundle r1 = r12.mArguments
            if (r1 == 0) goto L_0x0330
            r0 = 2397(0x95d, float:3.359E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r9)
            if (r0 != 0) goto L_0x035c
        L_0x0330:
            r0 = 1747692938(0x682bad8a, float:3.2429036E24)
            X.AnonymousClass0fD.A0A(r0, r10)
            r0 = 1928870429(0x72f83a1d, float:9.833285E30)
            goto L_0x0cff
        L_0x033b:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r3)
            r0 = 36318849045764608(0x8107cd00061a00, double:3.0315246085837083E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0397
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.3GX r0 = X.AnonymousClass3GX.A00(r0)
            X.57d r0 = r0.A00
            if (r0 == 0) goto L_0x0330
            X.4Lh r0 = r0.A01
            java.lang.String r0 = r0.A04
            if (r0 == 0) goto L_0x0330
        L_0x035c:
            X.1Xl r0 = r12.A06
            if (r0 == 0) goto L_0x0395
            X.1Xj r7 = r0.BPf()
        L_0x0364:
            java.lang.String r6 = r13.CGH()
            if (r7 == 0) goto L_0x0388
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r3)
            r0 = 36318849045961218(0x8107cd00091a02, double:3.031524608708045E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 != 0) goto L_0x0388
            X.WWr r1 = r12.A0B
            if (r1 == 0) goto L_0x0f2e
            X.2EG r0 = X.2EG.A2o
            X.Q03 r1 = r1.A00(r4, r7, r0)
            java.lang.String r0 = "webclick"
            X.SUD.A06(r7, r1, r0, r6)
        L_0x0388:
            X.SbN r1 = new X.SbN
            r1.<init>(r2, r7, r12, r6)
            com.instagram.ui.widget.refresh.RefreshableListView r0 = r12.A0D
            if (r0 == 0) goto L_0x0330
            r0.addOnLayoutChangeListener(r1)
            goto L_0x0330
        L_0x0395:
            r7 = r4
            goto L_0x0364
        L_0x0397:
            if (r8 != 0) goto L_0x035c
            goto L_0x0330
        L_0x039a:
            r1 = r4
            goto L_0x0309
        L_0x039d:
            r2 = r4
            goto L_0x02fb
        L_0x03a0:
            r0 = 36329749672378686(0x8111b70000413e, double:3.0384182087477515E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r1 = 2131626608(0x7f0e0a70, float:1.8880457E38)
            if (r0 == 0) goto L_0x0232
            r1 = 2131626609(0x7f0e0a71, float:1.888046E38)
            goto L_0x0232
        L_0x03b3:
            X.1Xl r1 = r12.A06
            if (r1 == 0) goto L_0x01c1
            boolean r0 = X.1sx.A0P(r1)
            if (r0 == 0) goto L_0x01c1
            X.1Xj r0 = r1.BPf()
            boolean r0 = r0.A5v()
            if (r0 == 0) goto L_0x03d1
            X.1Xj r0 = r1.BPf()
            boolean r5 = r0.A4v()
            goto L_0x01c1
        L_0x03d1:
            X.1Xj r0 = r1.BPf()
            boolean r0 = r0.A63()
            if (r0 != 0) goto L_0x01c1
            int r0 = r12.A00
            boolean r0 = X.1sx.A0Q(r1, r0)
            if (r0 == 0) goto L_0x01c1
            r5 = 1
            goto L_0x01c1
        L_0x03e6:
            X.0wj r2 = X.0wj.A01
            r1 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r0 = "PBIAProxyProfileFragment#media is null from response in onDataFetchSuccess"
            X.0f9 r4 = r2.AEf(r0, r1)
            java.lang.String r3 = "Media Id: "
            java.lang.String r2 = r12.A0G
            java.lang.String r1 = ", Ad Id: "
            java.lang.String r0 = r12.A0F
            if (r0 != 0) goto L_0x0402
            java.lang.String r6 = "adId"
        L_0x03fd:
            X.0qQ.A0F(r6)
            goto L_0x1406
        L_0x0402:
            java.lang.String r1 = X.002.A0u(r3, r2, r1, r0)
            java.lang.String r0 = "message"
            r4.ABQ(r0, r1)
            r4.report()
            com.instagram.ui.widget.refresh.RefreshableListView r0 = r12.A0D
            if (r0 == 0) goto L_0x0415
            r0.setIsLoading(r9)
        L_0x0415:
            com.instagram.ui.emptystaterow.EmptyStateView r0 = r12.A0C
            if (r0 == 0) goto L_0x0330
            r0.A0J()
            goto L_0x0330
        L_0x041e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0423:
            java.lang.String r19 = "pageInfo"
            goto L_0x0f2e
        L_0x0427:
            r1 = 1381510738(0x52582e52, float:2.32122515E11)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.UXv r4 = (X.C15260UXv) r4
            r1 = 627816299(0x256bb76b, float:2.0445145E-16)
            int r2 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r0.A01
            X.X6j r1 = (X.C20956X6j) r1
            java.lang.String r0 = r4.A08
            if (r0 != 0) goto L_0x0440
            r4 = 0
        L_0x0440:
            r1.DKU(r4)
            r0 = 2015887760(0x78280190, float:1.3630274E34)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 81267868(0x4d80c9c, float:5.0792936E-36)
            goto L_0x165a
        L_0x044e:
            r1 = -1352448563(0xffffffffaf6345cd, float:-2.0670328E-10)
            int r8 = X.AnonymousClass0fD.A03(r1)
            X.UXK r4 = (X.UXK) r4
            r1 = 1847551323(0x6e1f655b, float:1.2332662E28)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.util.List r1 = r4.A00
            if (r1 == 0) goto L_0x0482
            java.util.List r2 = X.C18214Vne.A01(r1)
            if (r2 == 0) goto L_0x0477
        L_0x0468:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0477
            java.lang.Object r0 = r0.A01
            X.Ubk r0 = (X.C15385Ubk) r0
            X.E90 r0 = r0.A01
            r0.A0C(r2)
        L_0x0477:
            r0 = 1495115992(0x591da8d8, float:2.77357606E15)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1338675299(0x4fca9063, float:6.7969203E9)
            goto L_0x16cc
        L_0x0482:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x0468
        L_0x0488:
            r1 = -122594990(0xfffffffff8b15952, float:-2.8776505E34)
            int r8 = X.AnonymousClass0fD.A03(r1)
            X.UXr r4 = (X.C15257UXr) r4
            r1 = 1535404827(0x5b846b1b, float:7.4544921E16)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r6 = 0
            X.0qQ.A0B(r4, r6)
            java.lang.Object r5 = r0.A01
            com.instagram.genericsurvey.fragment.GenericSurveyFragment r5 = (com.instagram.genericsurvey.fragment.GenericSurveyFragment) r5
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r5.loadingSpinner
            X.AnonymousClass7TH.A0R(r0)
            r5.A08 = r4
            r1 = 1
            r5.A0C = r1
            java.util.List r3 = r4.A06
            if (r3 == 0) goto L_0x04ec
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            if (r0 == 0) goto L_0x04ca
            r5.A00 = r6
            java.util.List r0 = r5.A0N
            r0.addAll(r3)
            com.instagram.genericsurvey.fragment.GenericSurveyFragment.A03(r5)
            X.UdD r1 = r5.A05
            if (r1 != 0) goto L_0x04d3
            X.DbS.A13()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x04ca:
            r5.A0B = r1
            com.instagram.genericsurvey.fragment.GenericSurveyFragment.A03(r5)
            com.instagram.genericsurvey.fragment.GenericSurveyFragment.A02(r5)
            goto L_0x04ec
        L_0x04d3:
            int r0 = r5.A00
            java.lang.Object r0 = r3.get(r0)
            X.VSy r0 = (X.C17371VSy) r0
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x04f7
            r1.A0C(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r5.A02 = r0
            r0 = 0
            r5.A03 = r0
        L_0x04ec:
            r0 = 803884970(0x2fea4faa, float:4.2620957E-10)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 2020355703(0x786c2e77, float:1.916132E34)
            goto L_0x16cc
        L_0x04f7:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1925056658(0xffffffff8d41f76e, float:-5.977055E-31)
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        L_0x0502:
            r1 = -1948081728(0xffffffff8be2a1c0, float:-8.729541E-32)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.UoB r4 = (X.C16084UoB) r4
            r1 = -334955567(0xffffffffec08fbd1, float:-6.624123E26)
            int r2 = X.AnonymousClass7TG.A0D(r4, r1)
            java.lang.Object r8 = r0.A01
            com.instagram.genericsurvey.fragment.AdBakeOffFragment r8 = (com.instagram.genericsurvey.fragment.AdBakeOffFragment) r8
            java.lang.String r0 = r4.A04
            r8.A04 = r0
            java.util.List r0 = r4.A06
            java.lang.String r7 = "Required value was null."
            if (r0 == 0) goto L_0x0576
            java.util.Iterator r6 = r0.iterator()
        L_0x0524:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x054c
            java.lang.Object r5 = r6.next()
            X.VSy r5 = (X.C17371VSy) r5
            java.util.List r1 = r8.A09
            java.util.List r0 = r5.A01
            if (r0 == 0) goto L_0x057f
            r1.add(r0)
            java.util.List r1 = r8.A08
            java.lang.String r0 = r5.A00
            if (r0 == 0) goto L_0x0543
            r1.add(r0)
            goto L_0x0524
        L_0x0543:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r7)
            r0 = 520652525(0x1f0886ed, float:2.8910728E-20)
            goto L_0x0587
        L_0x054c:
            r8.A03 = r4
            com.instagram.genericsurvey.fragment.AdBakeOffFragment.A03(r8)
            com.instagram.genericsurvey.fragment.AdBakeOffFragment.A02(r8)
            java.lang.String r9 = r8.A07
            X.UoB r1 = r8.A03
            int r0 = r8.A00
            java.lang.String r10 = X.VCA.A00(r1, r0)
            int r12 = r8.A00
            X.0eM r0 = r8.A0B
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r11 = "which_is_better"
            X.VC8.A00(r7, r8, r9, r10, r11, r12)
            r0 = -1998908074(0xffffffff88db1556, float:-1.3185599E-33)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 420256174(0x190c99ae, float:7.268866E-24)
            goto L_0x165a
        L_0x0576:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r7)
            r0 = -539802009(0xffffffffdfd34667, float:-3.0447938E19)
            goto L_0x0587
        L_0x057f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r7)
            r0 = 162471993(0x9af2039, float:4.216002E-33)
        L_0x0587:
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        L_0x058b:
            r1 = -616763041(0xffffffffdb3cf15f, float:-5.3182686E16)
            int r11 = X.AnonymousClass0fD.A03(r1)
            X.1XR r4 = (X.1XR) r4
            r1 = 223575477(0xd537db5, float:6.517071E-31)
            int r6 = X.AnonymousClass0fD.A03(r1)
            r1 = 0
            X.0qQ.A0B(r4, r1)
            java.lang.Object r5 = r0.A01
            X.VjY r5 = (X.C17996VjY) r5
            X.VOC r3 = r5.A04
            X.UXK r4 = (X.UXK) r4
            X.0qQ.A0B(r4, r1)
            java.util.List r0 = r4.A00
            if (r0 == 0) goto L_0x05df
            java.util.List r2 = X.C18214Vne.A01(r0)
            if (r2 == 0) goto L_0x05dc
        L_0x05b4:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x05dc
            X.ToV r0 = r5.A03
            java.util.List r1 = r0.A00
            r1.clear()
            java.util.List r0 = X.00k.A0X(r2)
            r1.addAll(r0)
            X.6vv r0 = X.C322496vv.Open
        L_0x05ca:
            r5.A00 = r0
            X.Ube r0 = r3.A00
            X.C15381Ube.A03(r0)
            r0 = 144447135(0x89c169f, float:9.394227E-34)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1673185652(0x63bac974, float:6.891221E21)
            goto L_0x0cff
        L_0x05dc:
            X.6vv r0 = X.C322496vv.Closed
            goto L_0x05ca
        L_0x05df:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x05b4
        L_0x05e5:
            r1 = 724906524(0x2b35321c, float:6.437366E-13)
            int r5 = X.AnonymousClass0fD.A03(r1)
            X.UXW r4 = (X.UXW) r4
            r1 = -803706365(0xffffffffd0186a03, float:-1.02283377E10)
            int r1 = X.AnonymousClass7TG.A0D(r4, r1)
            java.lang.Object r0 = r0.A01
            X.TpQ r0 = (X.C14076TpQ) r0
            r0.A0A = r4
            r0 = 854419724(0x32ed690c, float:2.7638201E-8)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -968070966(0xffffffffc64c68ca, float:-13082.197)
            goto L_0x12e2
        L_0x0606:
            r1 = -1054785979(0xffffffffc1213e45, float:-10.0777025)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.6zY r4 = (X.C324576zY) r4
            r1 = -706743702(0xffffffffd5dff26a, float:-3.07790317E13)
            int r5 = X.AnonymousClass0fD.A03(r1)
            X.3HX r6 = r4.A00()
            if (r6 != 0) goto L_0x0627
            r0 = 972539123(0x39f7c4f3, float:4.725825E-4)
        L_0x061f:
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -636594261(0xffffffffda0e57ab, float:-1.00164597E16)
            goto L_0x165a
        L_0x0627:
            java.lang.Object r4 = r0.A01
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r4 = (com.instagram.discovery.mediamap.fragment.LocationDetailFragment) r4
            r0 = 1
            r4.A04 = r0
            X.0eM r1 = r4.A00
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.reels.store.ReelStore r2 = X.1OP.A05(r0)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r0)
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r6.A1U
            boolean r0 = X.2PP.A00(r1, r0)
            r2.A0I(r6, r0)
            X.Ugy r0 = r4.A01
            X.TsA r0 = r0.A03
            X.C14227TsA.A00(r0)
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x065b
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment.A02(r4)
        L_0x065b:
            r0 = -1583033454(0xffffffffa1a4d392, float:-1.1169074E-18)
            goto L_0x061f
        L_0x065f:
            r1 = -1677497044(0xffffffff9c036d2c, float:-4.3485365E-22)
            int r11 = X.AnonymousClass0fD.A03(r1)
            X.UXG r4 = (X.UXG) r4
            r1 = -1194134563(0xffffffffb8d2f3dd, float:-1.00590034E-4)
            int r5 = X.AnonymousClass7TG.A0D(r4, r1)
            java.util.List r1 = r4.A00
            java.util.Iterator r4 = r1.iterator()
            r2 = 0
        L_0x0676:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0692
            java.lang.Object r1 = r4.next()
            X.VS3 r1 = (X.VS3) r1
            java.lang.Object r3 = r0.A01
            X.Vhn r3 = (X.C17896Vhn) r3
            java.lang.String r2 = r1.A01
            X.0qQ.A07(r2)
            X.3HX r1 = r1.A00
            r3.A00(r1, r2)
            r2 = 1
            goto L_0x0676
        L_0x0692:
            if (r2 == 0) goto L_0x06ae
            java.lang.Object r2 = r0.A01
            X.Vhn r2 = (X.C17896Vhn) r2
            java.util.Set r0 = r2.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x069e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06ae
            java.lang.Object r0 = r1.next()
            X.X3t r0 = (X.C20902X3t) r0
            r0.DOp(r2)
            goto L_0x069e
        L_0x06ae:
            r0 = -656992373(0xffffffffd8d7178b, float:-1.89196893E15)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1383356475(0xffffffffad8ba7c5, float:-1.5876975E-11)
            goto L_0x0cff
        L_0x06b9:
            r1 = -1725433082(0xffffffff9927fb06, float:-8.6843914E-24)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r1 = -542164658(0xffffffffdfaf394e, float:-2.5252418E19)
            int r1 = X.AnonymousClass0fD.A03(r1)
            X.C15621Ufn.super.onSuccess(r4)
            java.lang.Object r0 = r0.A01
            X.W1j r0 = (X.C18783W1j) r0
            X.C18783W1j.A01(r0)
            r0 = 1198186512(0x476ae010, float:60128.062)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 1704762035(0x659c9ab3, float:9.244286E22)
            goto L_0x12e2
        L_0x06dc:
            r1 = 1074964618(0x4012a88a, float:2.2915368)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.7ax r4 = (X.C334247ax) r4
            r1 = -685876536(0xffffffffd71e5ac8, float:-1.7411274E14)
            int r6 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r7 = r0.A01
            X.Ugw r7 = (X.C15691Ugw) r7
            java.util.List r0 = r4.getItems()
            boolean r1 = r0.isEmpty()
            r7.A05 = r1
            X.VMh r0 = r7.A08
            X.UaY r5 = r0.A00
            r5.A05 = r1
            X.Uh4 r0 = r5.A02
            if (r0 != 0) goto L_0x0708
            java.lang.String r15 = "searchController"
            goto L_0x12b3
        L_0x0708:
            r0.A00 = r1
            if (r1 == 0) goto L_0x074d
            android.view.View r1 = r5.mView
            if (r1 == 0) goto L_0x074d
            r0 = 2131432000(0x7f0b1240, float:1.8485745E38)
            android.view.View r2 = r1.findViewById(r0)
            com.instagram.igds.components.button.IgdsButton r2 = (com.instagram.igds.components.button.IgdsButton) r2
            r5.A03 = r2
            if (r2 == 0) goto L_0x072b
            android.content.res.Resources r1 = X.DbV.A05(r5)
            r0 = 2131956485(0x7f131305, float:1.9549527E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setText((java.lang.String) r0)
        L_0x072b:
            android.content.Context r1 = r5.getContext()
            r0 = 2130968588(0x7f04000c, float:1.7545834E38)
            int r2 = X.2Yu.A0G(r1, r0)
            android.view.View r1 = r5.requireView()
            r0 = 2131439764(0x7f0b3094, float:1.8501492E38)
            android.view.View r0 = X.AnonymousClass7TE.A0b(r1, r0)
            X.0nA.A0X(r0, r2)
            com.instagram.igds.components.button.IgdsButton r1 = r5.A03
            if (r1 == 0) goto L_0x074d
            r0 = 19
            X.WB8.A00(r1, r0, r5)
        L_0x074d:
            X.C15325UaY.A00(r5)
            r2 = 0
            r7.A04 = r2
            java.lang.ref.WeakReference r0 = r7.A0B
            java.lang.Object r8 = r0.get()
            android.content.Context r8 = (android.content.Context) r8
            if (r8 == 0) goto L_0x078d
            r0 = 1
            r7.A04 = r0
            X.07i r5 = r7.A06
            com.instagram.common.session.UserSession r0 = r7.A0A
            boolean r1 = r7.A05
            X.0qQ.A0B(r0, r2)
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "friendships/feed_favorites_suggestions/"
            r2.A0A(r0)
            java.lang.String r0 = "feed_favorites_suggestions"
            r2.A0A = r0
            r2.A03()
            java.lang.String r0 = "should_pre_select"
            r2.A0H(r0, r1)
            java.lang.Class<X.E8Y> r1 = X.E8Y.class
            java.lang.Class<X.F5H> r0 = X.F5H.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r0 = 5
            X.C15619Ufl.A00(r1, r7, r4, r0)
            X.1ES.A00(r8, r5, r1)
        L_0x078d:
            r0 = 1713608732(0x6623981c, float:1.9313791E23)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1633604517(0x615ed3a5, float:2.5690174E20)
            goto L_0x165a
        L_0x0798:
            r1 = 371734021(0x16283605, float:1.3587977E-25)
            int r5 = X.AnonymousClass0fD.A03(r1)
            X.UX2 r4 = (X.UX2) r4
            r1 = 632377315(0x25b14fe3, float:3.075874E-16)
            int r2 = X.AnonymousClass7TG.A0D(r4, r1)
            X.C15621Ufn.super.onSuccess(r4)
            java.lang.Object r1 = r0.A01
            X.X6U r1 = (X.X6U) r1
            boolean r0 = r4.A00
            r1.Dol(r0)
            r0 = -1878008940(0xffffffff900fdb94, float:-2.8370934E-29)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -398943621(0xffffffffe8389a7b, float:-3.4870604E24)
            goto L_0x12e2
        L_0x07bf:
            r1 = 1393596363(0x531097cb, float:6.2102195E11)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.UX1 r4 = (X.UX1) r4
            r1 = -955140650(0xffffffffc711b5d6, float:-37301.836)
            int r2 = X.AnonymousClass7TG.A0D(r4, r1)
            X.C15621Ufn.super.onSuccess(r4)
            java.lang.String r1 = r4.A00
            java.lang.Object r0 = r0.A01
            X.X6S r0 = (X.X6S) r0
            if (r1 == 0) goto L_0x07e8
            r0.E4Q(r1)
        L_0x07dd:
            r0 = -832458584(0xffffffffce61b0a8, float:-9.4661274E8)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1160400840(0xffffffffbad5b038, float:-0.0016303128)
            goto L_0x165a
        L_0x07e8:
            r0.Dv1()
            goto L_0x07dd
        L_0x07ec:
            r1 = 1533664951(0x5b69deb7, float:6.5828547E16)
            int r5 = X.AnonymousClass0fD.A03(r1)
            X.UXR r4 = (X.UXR) r4
            r1 = 2125283194(0x7ead3f7a, float:1.1514302E38)
            int r3 = X.AnonymousClass7TG.A0D(r4, r1)
            X.C15621Ufn.super.onSuccess(r4)
            java.lang.Object r2 = r0.A01
            X.X6T r2 = (X.X6T) r2
            boolean r1 = r4.A00
            boolean r0 = r4.A01
            r2.Don(r1, r0)
            r0 = 160932428(0x997a24c, float:3.650455E-33)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -448455116(0xffffffffe5451e34, float:-5.817896E22)
            goto L_0x12e2
        L_0x0815:
            r1 = -103400139(0xfffffffff9d63d35, float:-1.3904912E35)
            int r5 = X.AnonymousClass0fD.A03(r1)
            X.UXA r4 = (X.UXA) r4
            r1 = -1670186916(0xffffffff9c72f85c, float:-8.039208E-22)
            int r7 = X.AnonymousClass0fD.A03(r1)
            r6 = 0
            X.0qQ.A0B(r4, r6)
            java.lang.Object r8 = r0.A01
            X.UaR r8 = (X.C15319UaR) r8
            X.0eM r2 = r8.A05
            X.WGU r1 = X.C13990Tnq.A0M(r2)
            X.UzE r3 = X.C16678UzE.NON_DISCRIMINATION
            java.lang.String r0 = "submit_non_discrimination"
            r1.A0D(r3, r0)
            X.UKM r0 = r4.A00
            if (r0 == 0) goto L_0x086e
            android.content.Context r1 = r8.requireContext()
            r0 = 2131970584(0x7f134a18, float:1.9578123E38)
            X.DbZ.A0w(r1, r8, r0)
            X.Vw9 r0 = r8.A00
            if (r0 != 0) goto L_0x0850
            java.lang.String r15 = "acceptButtonHolder"
            goto L_0x12b3
        L_0x0850:
            r0.A05(r6)
            X.WGU r6 = X.C13990Tnq.A0M(r2)
            java.lang.String r3 = r3.toString()
            X.UKM r2 = r4.A00
            r0 = 983(0x3d7, float:1.377E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            if (r2 == 0) goto L_0x0869
            java.lang.String r0 = r2.A02
            if (r0 != 0) goto L_0x086a
        L_0x0869:
            r0 = r1
        L_0x086a:
            r6.A0U(r3, r1, r0)
            goto L_0x0880
        L_0x086e:
            X.WGU r2 = X.C13990Tnq.A0M(r2)
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "ACCEPTED_NON_DISCRIMINATION"
            r2.A0R(r1, r0)
            r8.A02 = r6
            X.DbT.A1J(r8)
        L_0x0880:
            r0 = 1916282545(0x723826b1, float:3.647489E30)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -538910083(0xffffffffdfe0e27d, float:-3.2409304E19)
            goto L_0x12e2
        L_0x088b:
            r1 = 868192172(0x33bf8fac, float:8.920264E-8)
            int r5 = X.AnonymousClass0fD.A03(r1)
            X.Xzo r4 = (X.C22339Xzo) r4
            r1 = -239843593(0xfffffffff1b446f7, float:-1.785379E30)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r15 = 0
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0q(r4, r15)
            java.util.List r1 = r4.Ao4()
            java.util.Iterator r9 = r1.iterator()
        L_0x08a8:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0933
            java.lang.Object r1 = r9.next()
            X.4bN r1 = (X.C267324bN) r1
            X.1Xj r7 = r1.A02
            if (r7 == 0) goto L_0x08a8
            boolean r1 = r7.A5G()
            r8 = 1
            if (r1 == 0) goto L_0x08a8
            X.1Xy r1 = r7.A0C
            java.lang.String r1 = r1.getBoostUnavailableReason()
            if (r1 == 0) goto L_0x08cd
            int r1 = r1.length()
            if (r1 != 0) goto L_0x08a8
        L_0x08cd:
            X.1Xy r1 = r7.A0C
            java.lang.String r1 = r1.getBoostUnavailableIdentifier()
            if (r1 == 0) goto L_0x08db
            int r1 = r1.length()
            if (r1 != 0) goto L_0x08a8
        L_0x08db:
            X.UyC r1 = r7.A1Z()
            int r2 = r1.ordinal()
            if (r2 == r8) goto L_0x08a8
            r1 = 2
            if (r2 == r1) goto L_0x08a8
            r1 = 4
            if (r2 == r1) goto L_0x08a8
            r1 = 6
            if (r2 == r1) goto L_0x08a8
            r1 = 11
            if (r2 == r1) goto L_0x08a8
            java.lang.String r1 = r7.getId()
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x091e
            java.lang.String r14 = r7.getId()
            if (r14 == 0) goto L_0x0915
            com.instagram.common.typedurl.ImageUrl r12 = r7.A1Q()
            if (r12 == 0) goto L_0x0927
            X.UwY r11 = X.C16528UwY.VIDEO
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r15)
            X.L8o r10 = new X.L8o
            r10.<init>(r11, r12, r13, r14, r15)
            r6.add(r10)
            goto L_0x08a8
        L_0x0915:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r2)
            r0 = -963792754(0xffffffffc68db08e, float:-18136.277)
            goto L_0x092f
        L_0x091e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r2)
            r0 = 1522273097(0x5abc0b49, float:2.64648519E16)
            goto L_0x092f
        L_0x0927:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r2)
            r0 = 525756356(0x1f5667c4, float:4.5402096E-20)
        L_0x092f:
            X.AnonymousClass0fD.A0A(r0, r3)
            throw r1
        L_0x0933:
            java.lang.String r4 = r4.getNextMaxId()
            if (r4 == 0) goto L_0x0940
            int r2 = r4.length()
            r1 = 0
            if (r2 != 0) goto L_0x0941
        L_0x0940:
            r1 = 1
        L_0x0941:
            r2 = r1 ^ 1
            X.LD0 r1 = new X.LD0
            r1.<init>(r4, r6, r2)
            java.lang.Object r0 = r0.A01
            X.DQt r0 = (X.C46215DQt) r0
            X.C45891D9u.A01(r0, r1)
            X.C45891D9u.A00(r0)
            r0 = -60637541(0xfffffffffc62be9b, float:-4.7093E36)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -542044340(0xffffffffdfb10f4c, float:-2.5517E19)
            goto L_0x12e2
        L_0x095d:
            r1 = -963155752(0xffffffffc69768d8, float:-19380.422)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r1 = 1372935372(0x51d554cc, float:1.14531336E11)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r3 = r0.A01
            X.UZd r3 = (X.C15275UZd) r3
            X.0eM r0 = r3.A0G
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r0 = X.C16678UzE.ERROR
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "page_created"
            r2.A0R(r1, r0)
            X.C15275UZd.A06(r3)
            r0 = 126831510(0x78f4b96, float:2.1560674E-34)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -519305529(0xffffffffe10c06c7, float:-1.6143953E20)
            goto L_0x12e2
        L_0x098e:
            r1 = -428664602(0xffffffffe67318e6, float:-2.8699859E23)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r1 = 1812442010(0x6c07ab9a, float:6.560614E26)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r3 = r0.A01
            X.UZd r3 = (X.C15275UZd) r3
            X.0eM r0 = r3.A0G
            X.WGU r2 = X.C13990Tnq.A0M(r0)
            X.UzE r0 = X.C16678UzE.ERROR
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "claim"
            r2.A0R(r1, r0)
            X.C15275UZd.A06(r3)
            r0 = -499476582(0xffffffffe23a979a, float:-8.605046E20)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1840185378(0x6daf0022, float:6.7700047E27)
            goto L_0x12e2
        L_0x09bf:
            r1 = -1543104142(0xffffffffa4061972, float:-2.907817E-17)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r1 = 409142190(0x186303ae, float:2.934092E-24)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r4 = r0.A01
            X.UZX r4 = (X.UZX) r4
            X.0eM r0 = r4.A0C
            X.1Ng r1 = X.DbX.A0R(r0)
            X.WQ1 r0 = new X.WQ1
            r0.<init>()
            r1.A00(r0)
            android.content.Context r0 = r4.requireContext()
            X.C13991Tnr.A0r(r0)
            X.VRP r0 = r4.A00
            if (r0 == 0) goto L_0x09f5
            X.4uI r2 = r0.A01
            if (r2 == 0) goto L_0x09f5
            X.6Rx r1 = r0.A00
            X.6Tm r0 = X.AnonymousClass6Tm.A01
            X.C299275ur.A00(r1, r0, r2)
        L_0x09f5:
            android.content.Context r0 = r4.requireContext()
            X.07t r2 = X.AnonymousClass07t.A00(r0)
            java.lang.String r1 = "IGBoostPostRefreshPromotionInsights"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r2.A02(r0)
            X.DbT.A1I(r4)
            r0 = 1703658644(0x658bc494, float:8.25044E22)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1431742441(0xffffffffaaa95817, float:-3.0081555E-13)
            goto L_0x12e2
        L_0x0a15:
            r1 = 784330501(0x2ebfef05, float:8.728133E-11)
            int r5 = X.AnonymousClass0fD.A03(r1)
            X.UWx r4 = (X.C15237UWx) r4
            r1 = -2045767608(0xffffffff86101048, float:-2.709535E-35)
            int r3 = X.AnonymousClass0fD.A03(r1)
            r7 = 0
            X.0qQ.A0B(r4, r7)
            X.C15621Ufn.super.onSuccess(r4)
            X.UL2 r11 = r4.A04
            if (r11 != 0) goto L_0x0a34
            java.lang.String r15 = "response"
            goto L_0x12b3
        L_0x0a34:
            X.UKM r8 = r11.A04
            java.lang.String r15 = "mediaId"
            java.lang.Object r4 = r0.A01
            X.UZX r4 = (X.UZX) r4
            if (r8 == 0) goto L_0x0a76
            X.0eM r0 = r4.A09
            java.lang.Object r7 = r0.getValue()
            X.VwK r7 = (X.C18662VwK) r7
            java.lang.String r6 = r4.A04
            if (r6 == 0) goto L_0x12b3
            java.lang.String r2 = r8.A03
            java.lang.String r1 = "campaign_controls"
            java.lang.String r0 = "ads_manager"
            r7.A09(r1, r0, r6, r2)
            java.lang.String r2 = r8.A02
            android.content.Context r1 = r4.requireContext()
            if (r2 == 0) goto L_0x0a61
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0a68
        L_0x0a61:
            r0 = 2131961756(0x7f13279c, float:1.9560218E38)
            java.lang.String r2 = r4.getString(r0)
        L_0x0a68:
            X.C59689JTv.A09(r1, r2)
        L_0x0a6b:
            r0 = -435106874(0xffffffffe610cbc6, float:-1.7094493E23)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1790308718(0xffffffff954a0e92, float:-4.080507E-26)
            goto L_0x12e2
        L_0x0a76:
            X.VMI r9 = new X.VMI
            r9.<init>(r11)
            X.UL2 r8 = r9.A00
            java.lang.String r0 = r8.A0I
            if (r0 != 0) goto L_0x0a83
            java.lang.String r0 = ""
        L_0x0a83:
            com.instagram.common.typedurl.SimpleImageUrl r6 = new com.instagram.common.typedurl.SimpleImageUrl
            r6.<init>(r0)
            java.util.List r2 = r4.A07
            r2.clear()
            com.instagram.api.schemas.InstagramMediaProductType r1 = r8.A03
            if (r1 == 0) goto L_0x0a96
            com.instagram.api.schemas.InstagramMediaProductType r0 = com.instagram.api.schemas.InstagramMediaProductType.STORY
            r10 = 1
            if (r1 == r0) goto L_0x0a97
        L_0x0a96:
            r10 = 0
        L_0x0a97:
            r0 = 8
            X.WB4 r1 = new X.WB4
            r1.<init>(r0, r9, r11, r4)
            X.VVR r0 = new X.VVR
            r0.<init>(r1, r6, r10)
            r2.add(r0)
            r0 = 2131970277(0x7f1348e5, float:1.95775E38)
            java.lang.String r1 = X.DbU.A0m(r4, r0)
            com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel r0 = new com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel
            r0.<init>()
            r0.A00 = r1
            r2.add(r0)
            r0 = 2131970440(0x7f134988, float:1.9577831E38)
            java.lang.String r1 = X.DbU.A0m(r4, r0)
            X.0eM r0 = r4.A0D
            java.lang.Object r0 = r0.getValue()
            X.U8N r0 = (X.U8N) r0
            java.lang.String r13 = r0.A00
            java.lang.String r12 = r8.A0J
            java.lang.String r10 = r8.A0E
            com.instagram.api.schemas.AdproObjectiveTypesEnum r11 = r8.A00
            if (r11 == 0) goto L_0x0bd3
            com.instagram.api.schemas.AdproObjectiveTypesEnum r0 = com.instagram.api.schemas.AdproObjectiveTypesEnum.LEAD_GENERATION
            if (r11 != r0) goto L_0x0bd3
            java.lang.String r0 = "More leads | "
            java.lang.String r11 = X.002.A0R(r0, r12)
        L_0x0ada:
            r13 = 1
            X.0qQ.A0B(r11, r13)
            X.WAr r10 = X.C18879WAr.A00
            X.VXl r0 = new X.VXl
            r0.<init>(r10, r1, r11, r7)
            r2.add(r0)
            r0 = 2131970201(0x7f134899, float:1.9577346E38)
            java.lang.String r11 = X.DbU.A0m(r4, r0)
            java.lang.String r1 = r8.A0F
            if (r1 != 0) goto L_0x0af5
            java.lang.String r1 = ""
        L_0x0af5:
            X.0qQ.A0B(r1, r13)
            X.VXl r0 = new X.VXl
            r0.<init>(r10, r11, r1, r7)
            r2.add(r0)
            boolean r1 = r8.A0L
            r0 = 2131970242(0x7f1348c2, float:1.957743E38)
            java.lang.String r12 = X.DbU.A0m(r4, r0)
            java.lang.String r11 = r8.A0G
            if (r11 != 0) goto L_0x0b0f
            java.lang.String r11 = ""
        L_0x0b0f:
            if (r1 == 0) goto L_0x0bc2
            X.0qQ.A0B(r11, r13)
            X.VXl r1 = new X.VXl
            r1.<init>(r10, r12, r11, r7)
        L_0x0b19:
            r2.add(r1)
            com.instagram.api.schemas.BoostedActionStatus r11 = r8.A01
            com.instagram.api.schemas.BoostedActionStatus r0 = com.instagram.api.schemas.BoostedActionStatus.SCHEDULED
            if (r11 != r0) goto L_0x0b51
            java.lang.Long r0 = r8.A0D
            long r0 = X.DbY.A04(r0)
            java.util.Date r8 = X.C13989Tnp.A0t(r0)
            java.lang.String r0 = "EEE, MMM dd 'at' hh:mm a z"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            r1.setTimeZone(r0)
            java.lang.String r8 = r1.format(r8)
            if (r8 != 0) goto L_0x0b42
            java.lang.String r8 = ""
        L_0x0b42:
            r0 = 2131970734(0x7f134aae, float:1.9578427E38)
            java.lang.String r1 = X.DbU.A0m(r4, r0)
            X.VXl r0 = new X.VXl
            r0.<init>(r10, r1, r8, r7)
            r2.add(r0)
        L_0x0b51:
            java.lang.String r0 = "divider"
            r2.add(r0)
            com.instagram.api.schemas.BoostedActionStatus r0 = com.instagram.api.schemas.BoostedActionStatus.ACTIVE
            if (r11 != r0) goto L_0x0bb0
            r0 = 2131970274(0x7f1348e2, float:1.9577494E38)
            java.lang.String r8 = X.DbU.A0m(r4, r0)
            android.content.Context r0 = r4.getContext()
            int r7 = X.2Yu.A0D(r0)
            r0 = 9
            X.WB4 r1 = new X.WB4
            r1.<init>(r0, r9, r6, r4)
        L_0x0b70:
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            X.VVQ r0 = new X.VVQ
            r0.<init>(r1, r8, r7)
            r2.add(r0)
            r0 = 2131970270(0x7f1348de, float:1.9577486E38)
            java.lang.String r8 = X.DbU.A0m(r4, r0)
            android.content.Context r0 = r4.getContext()
            int r7 = X.2Yu.A03(r0)
            r0 = 10
            X.WB4 r1 = new X.WB4
            r1.<init>(r0, r9, r6, r4)
            X.VVQ r0 = new X.VVQ
            r0.<init>(r1, r8, r7)
            r2.add(r0)
            X.UAF.A00(r4, r2)
            X.0eM r0 = r4.A09
            java.lang.Object r6 = r0.getValue()
            X.VwK r6 = (X.C18662VwK) r6
            java.lang.String r2 = r4.A04
            if (r2 == 0) goto L_0x12b3
            java.lang.String r1 = "campaign_controls"
            java.lang.String r0 = "campaign_controls_fetch"
            r6.A04(r1, r0, r2)
            goto L_0x0a6b
        L_0x0bb0:
            r0 = 2131970276(0x7f1348e4, float:1.9577499E38)
            java.lang.String r8 = X.DbU.A0m(r4, r0)
            android.content.Context r0 = r4.getContext()
            int r7 = X.2Yu.A0D(r0)
            X.WAe r1 = X.C18866WAe.A00
            goto L_0x0b70
        L_0x0bc2:
            r1 = 55
            X.WBH r0 = new X.WBH
            r0.<init>((int) r1, (java.lang.Object) r9, (java.lang.Object) r4)
            X.0qQ.A0B(r11, r13)
            X.VXl r1 = new X.VXl
            r1.<init>(r0, r12, r11, r13)
            goto L_0x0b19
        L_0x0bd3:
            com.instagram.api.schemas.CallToActionType r0 = r8.A02
            if (r0 != 0) goto L_0x0beb
            r0 = -1
        L_0x0bd8:
            java.lang.String r11 = "More messages | "
            switch(r0) {
                case 10: goto L_0x0c34;
                case 27: goto L_0x0c42;
                case 53: goto L_0x0bf8;
                case 61: goto L_0x0c0a;
                case 109: goto L_0x0c18;
                case 110: goto L_0x0c50;
                case 126: goto L_0x0bf0;
                case 134: goto L_0x0c26;
                case 138: goto L_0x0bfe;
                default: goto L_0x0bdd;
            }
        L_0x0bdd:
            if (r10 == 0) goto L_0x0be7
            java.lang.String r0 = "Visit website | "
            java.lang.String r11 = X.002.A0R(r0, r10)
            if (r11 != 0) goto L_0x0ada
        L_0x0be7:
            java.lang.String r11 = "Visit website"
            goto L_0x0ada
        L_0x0beb:
            int r0 = r0.ordinal()
            goto L_0x0bd8
        L_0x0bf0:
            java.lang.String r0 = "Visit instagram profile | "
            java.lang.String r11 = X.002.A0R(r0, r12)
            goto L_0x0ada
        L_0x0bf8:
            java.lang.String r11 = X.002.A0R(r11, r12)
            goto L_0x0ada
        L_0x0bfe:
            if (r13 == 0) goto L_0x0c06
            java.lang.String r11 = X.002.A0R(r11, r13)
            if (r11 != 0) goto L_0x0ada
        L_0x0c06:
            java.lang.String r11 = "More messages"
            goto L_0x0ada
        L_0x0c0a:
            if (r10 == 0) goto L_0x0c14
            java.lang.String r0 = "Learn more | "
            java.lang.String r11 = X.002.A0R(r0, r10)
            if (r11 != 0) goto L_0x0ada
        L_0x0c14:
            java.lang.String r11 = "Learn more"
            goto L_0x0ada
        L_0x0c18:
            if (r10 == 0) goto L_0x0c22
            java.lang.String r0 = "Shop now | "
            java.lang.String r11 = X.002.A0R(r0, r10)
            if (r11 != 0) goto L_0x0ada
        L_0x0c22:
            java.lang.String r11 = "Shop now"
            goto L_0x0ada
        L_0x0c26:
            if (r10 == 0) goto L_0x0c30
            java.lang.String r0 = "Watch more | "
            java.lang.String r11 = X.002.A0R(r0, r10)
            if (r11 != 0) goto L_0x0ada
        L_0x0c30:
            java.lang.String r11 = "Watch more"
            goto L_0x0ada
        L_0x0c34:
            if (r10 == 0) goto L_0x0c3e
            java.lang.String r0 = "Book now | "
            java.lang.String r11 = X.002.A0R(r0, r10)
            if (r11 != 0) goto L_0x0ada
        L_0x0c3e:
            java.lang.String r11 = "Book now"
            goto L_0x0ada
        L_0x0c42:
            if (r10 == 0) goto L_0x0c4c
            java.lang.String r0 = "Contact us | "
            java.lang.String r11 = X.002.A0R(r0, r10)
            if (r11 != 0) goto L_0x0ada
        L_0x0c4c:
            java.lang.String r11 = "Contact us"
            goto L_0x0ada
        L_0x0c50:
            if (r10 == 0) goto L_0x0c5a
            java.lang.String r0 = "Sign Up | "
            java.lang.String r11 = X.002.A0R(r0, r10)
            if (r11 != 0) goto L_0x0ada
        L_0x0c5a:
            java.lang.String r11 = "Sign up"
            goto L_0x0ada
        L_0x0c5e:
            r1 = 1213188770(0x484fcaa2, float:212778.53)
            int r6 = X.AnonymousClass0fD.A03(r1)
            r1 = 309844607(0x1277da7f, float:7.8208775E-28)
            int r3 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r4 = r0.A01
            X.UZX r4 = (X.UZX) r4
            X.0eM r0 = r4.A0C
            X.1Ng r1 = X.DbX.A0R(r0)
            X.WQ1 r0 = new X.WQ1
            r0.<init>()
            r1.A00(r0)
            android.content.Context r0 = r4.requireContext()
            X.C13991Tnr.A0r(r0)
            X.VRP r0 = r4.A00
            if (r0 == 0) goto L_0x0c94
            X.4uI r2 = r0.A01
            if (r2 == 0) goto L_0x0c94
            X.6Rx r1 = r0.A00
            X.6Tm r0 = X.AnonymousClass6Tm.A01
            X.C299275ur.A00(r1, r0, r2)
        L_0x0c94:
            android.content.Context r0 = r4.requireContext()
            X.07t r2 = X.AnonymousClass07t.A00(r0)
            java.lang.String r1 = "IGBoostPostRefreshPromotionInsights"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r2.A02(r0)
            X.DbT.A1I(r4)
            r0 = -1358197471(0xffffffffaf0b8d21, float:-1.2692115E-10)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 411057665(0x18803e01, float:3.3149832E-24)
            goto L_0x0d61
        L_0x0cb4:
            r1 = -1036011579(0xffffffffc23fb7c5, float:-47.929462)
            int r11 = X.AnonymousClass0fD.A03(r1)
            X.UX7 r4 = (X.UX7) r4
            r1 = 309347791(0x127045cf, float:7.5816693E-28)
            int r5 = X.AnonymousClass7TG.A0D(r4, r1)
            X.C15621Ufn.super.onSuccess(r4)
            boolean r1 = r4.A00
            java.lang.String r3 = "hec_appeal"
            java.lang.Object r4 = r0.A01
            X.UaU r4 = (X.C15322UaU) r4
            if (r1 == 0) goto L_0x0d03
            X.WGU r1 = r4.A03
            if (r1 == 0) goto L_0x0cde
            X.UzE r0 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r0 = r0.toString()
            r1.A0R(r0, r3)
        L_0x0cde:
            X.DbT.A1K(r4)
            r0 = 2131970555(0x7f1349fb, float:1.9578064E38)
            java.lang.String r0 = X.DbU.A0m(r4, r0)
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.M5x r2 = new X.M5x
            r2.<init>(r4, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
        L_0x0cf6:
            r0 = 1628115980(0x610b140c, float:1.6034637E20)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -959359215(0xffffffffc6d15711, float:-26795.533)
        L_0x0cff:
            X.AnonymousClass0fD.A0A(r0, r11)
            return
        L_0x0d03:
            X.WGU r2 = r4.A03
            if (r2 == 0) goto L_0x0d12
            X.UzE r0 = X.C16678UzE.AUDIENCE_SELECTION
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = ""
            r2.A0U(r1, r3, r0)
        L_0x0d12:
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x0cf6
            r0 = 2131961756(0x7f13279c, float:1.9560218E38)
            X.DbZ.A0w(r1, r4, r0)
            goto L_0x0cf6
        L_0x0d1f:
            r1 = -1737508971(0xffffffff986fb795, float:-3.0982711E-24)
            int r6 = X.AnonymousClass0fD.A03(r1)
            com.instagram.business.promote.model.PromoteEnrollCouponInfo r4 = (com.instagram.business.promote.model.PromoteEnrollCouponInfo) r4
            r1 = -2139559809(0xffffffff8078e87f, float:-1.1103663E-38)
            int r5 = X.AnonymousClass7TG.A0D(r4, r1)
            java.lang.Object r3 = r0.A01
            X.UbW r3 = (X.C15378UbW) r3
            X.WGU r2 = r3.A00
            if (r2 != 0) goto L_0x0d3b
            java.lang.String r15 = "promoteLogger"
            goto L_0x12b3
        L_0x0d3b:
            X.UzE r0 = X.C16678UzE.OBJECTIVE
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "enroll_coupon"
            r2.A0R(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A05 = r0
            com.instagram.business.promote.model.PromoteData r1 = r3.A03
            java.lang.String r15 = "promoteData"
            if (r1 == 0) goto L_0x12b3
            r1.A0t = r4
            r0 = 1
            r1.A2D = r0
            X.C13992Tns.A0e(r3)
            r0 = 175219578(0xa71a37a, float:1.16344744E-32)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -328530808(0xffffffffec6b0488, float:-1.1364759E27)
        L_0x0d61:
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x0d65:
            r1 = -771199456(0xffffffffd2086e20, float:-1.46490786E11)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.UXD r4 = (X.UXD) r4
            r1 = -485564825(0xffffffffe30ede67, float:-2.6354634E21)
            int r2 = X.AnonymousClass0fD.A03(r1)
            r6 = 0
            X.0qQ.A0B(r4, r6)
            X.C15621Ufn.super.onSuccess(r4)
            X.UKM r4 = r4.A00
            java.lang.String r10 = "delete_auto_audience_location"
            java.lang.String r7 = "edit_auto_audience_location"
            java.lang.String r15 = "promoteData"
            java.lang.Object r1 = r0.A01
            X.UZg r1 = (X.C15278UZg) r1
            if (r4 != 0) goto L_0x0dbd
            X.WGU r5 = r1.A02
            if (r5 == 0) goto L_0x0da8
            X.UzE r0 = X.C16678UzE.UPDATE_AUTO_AUDIENCE_LOCATION
            java.lang.String r4 = r0.toString()
            com.instagram.business.promote.model.PromoteData r0 = r1.A05
            if (r0 == 0) goto L_0x12b3
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0p
            java.util.List r0 = r0.A07
            if (r0 == 0) goto L_0x0da5
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0da5
            r10 = r7
        L_0x0da5:
            r5.A0R(r4, r10)
        L_0x0da8:
            X.WGU r5 = r1.A02
            if (r5 == 0) goto L_0x0db5
            com.instagram.business.promote.model.PromoteData r4 = r1.A05
            if (r4 == 0) goto L_0x12b3
            X.UzE r0 = X.C16678UzE.UPDATE_AUTO_AUDIENCE_LOCATION
            r5.A0B(r0, r4)
        L_0x0db5:
            com.instagram.business.promote.model.PromoteState r0 = r1.A06
            if (r0 != 0) goto L_0x0dee
            java.lang.String r15 = "promoteState"
            goto L_0x12b3
        L_0x0dbd:
            X.WGU r8 = r1.A02
            if (r8 == 0) goto L_0x0de4
            X.UzE r0 = X.C16678UzE.UPDATE_AUTO_AUDIENCE_LOCATION
            java.lang.String r9 = r0.toString()
            com.instagram.business.promote.model.PromoteData r0 = r1.A05
            if (r0 == 0) goto L_0x12b3
            com.instagram.business.promote.model.PromoteAudienceInfo r0 = r0.A0p
            java.util.List r0 = r0.A07
            if (r0 == 0) goto L_0x0dd8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0dd8
            r10 = r7
        L_0x0dd8:
            java.lang.String r11 = r4.A03
            com.instagram.api.schemas.ErrorIdentifier r0 = r4.A01
            java.lang.String r12 = r0.toString()
            r13 = 0
            X.WGU.A07(r8, r9, r10, r11, r12, r13)
        L_0x0de4:
            android.content.Context r1 = r1.getContext()
            java.lang.String r0 = r4.A02
            X.C59689JTv.A09(r1, r0)
            goto L_0x0df4
        L_0x0dee:
            r0.A0C(r6)
            X.DbT.A1J(r1)
        L_0x0df4:
            r0 = 657620040(0x27327c48, float:2.4769835E-15)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -1252350726(0xffffffffb55aa4fa, float:-8.14514E-7)
            goto L_0x165a
        L_0x0dff:
            r1 = 1332057221(0x4f659485, float:3.85171584E9)
            int r18 = X.AnonymousClass0fD.A03(r1)
            X.3FZ r4 = (X.AnonymousClass3FZ) r4
            r1 = -1917746507(0xffffffff8db182b5, float:-1.0939934E-30)
            int r15 = X.AnonymousClass0fD.A03(r1)
            r3 = 0
            X.0qQ.A0B(r4, r3)
            java.lang.Object r0 = r0.A01
            X.Uac r0 = (X.C15328Uac) r0
            java.lang.Class<X.UJG> r9 = X.UJG.class
            java.lang.String r8 = "xig_user_by_igid_v2"
            X.3FZ r5 = r4.A00(r9, r8)
            r12 = 0
            if (r5 == 0) goto L_0x0f4c
            java.lang.Class<X.UJF> r2 = X.UJF.class
            java.lang.String r1 = "ig_advertiser"
            X.3FZ r5 = r5.A00(r2, r1)
            if (r5 == 0) goto L_0x0f4c
            java.lang.Class<X.UJE> r2 = X.UJE.class
            java.lang.String r1 = "ig_advertiser_settings"
            X.3FZ r5 = r5.A00(r2, r1)
            if (r5 == 0) goto L_0x0f4c
            java.lang.Class<X.UJD> r2 = X.UJD.class
            java.lang.String r1 = "ig_boost_highlights_hub"
            X.3FZ r5 = r5.A00(r2, r1)
            if (r5 == 0) goto L_0x0f4c
            java.lang.Class<X.UJ9> r2 = X.UJ9.class
            java.lang.String r1 = "available_items"
            com.google.common.collect.ImmutableList r11 = r5.A02(r1, r2)
            if (r11 == 0) goto L_0x0f4c
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x0f4c
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r17 = r11.iterator()
            r10 = 0
            r6 = 0
        L_0x0e5b:
            boolean r1 = r17.hasNext()
            r5 = 2
            if (r1 == 0) goto L_0x0f33
            int r16 = r6 + 1
            java.lang.Object r2 = r17.next()
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            if (r6 == r5) goto L_0x0f33
            java.lang.String r1 = "title"
            java.lang.String r23 = r2.A05(r1)
            java.lang.String r1 = "description"
            java.lang.String r24 = r2.A05(r1)
            X.Uz6 r5 = X.C16670Uz6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "item_action"
            java.lang.Enum r5 = r2.A04(r1, r5)
            java.util.Map r1 = X.W3M.A01
            java.lang.Object r7 = r1.get(r5)
            X.UzG r7 = (X.C16680UzG) r7
            java.lang.String r1 = "thumbnail_url"
            java.lang.String r5 = r2.A05(r1)
            X.UzG r1 = X.C16680UzG.AD_SLIDER
            if (r7 != r1) goto L_0x0f29
            X.1Av r1 = r0.A0I
            java.lang.String r19 = "userPreferences"
            if (r1 == 0) goto L_0x0f2e
            X.0xa r1 = r1.A01
            java.lang.String r13 = "promote_ad_slider_new_tag_impression_count"
            int r6 = r1.getInt(r13, r3)
            r1 = 4
            if (r6 >= r1) goto L_0x0f29
            X.1Av r1 = r0.A0I
            if (r1 == 0) goto L_0x0f2e
            X.0xa r6 = r1.A01
            int r6 = r6.getInt(r13, r3)
            int r6 = r6 + 1
            X.0xa r1 = r1.A01
            X.AnonymousClass7TG.A1M(r1, r13, r6)
            r25 = 1
        L_0x0eb6:
            if (r23 == 0) goto L_0x0f25
            if (r24 == 0) goto L_0x0f25
            if (r7 == 0) goto L_0x0f25
            if (r5 == 0) goto L_0x0f0b
            com.instagram.common.typedurl.SimpleImageUrl r13 = new com.instagram.common.typedurl.SimpleImageUrl
            r13.<init>(r5)
        L_0x0ec3:
            r1 = 1070(0x42e, float:1.5E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r6 = r2.A05(r1)
            java.lang.String r1 = "ad_account_id"
            java.lang.String r5 = r2.A05(r1)
            java.lang.String r1 = "organic_media_ig_id"
            java.lang.String r2 = r2.A05(r1)
            int r1 = r7.ordinal()
            switch(r1) {
                case 0: goto L_0x0f0d;
                case 1: goto L_0x0ee6;
                case 2: goto L_0x0f04;
                case 3: goto L_0x0efd;
                case 4: goto L_0x0ef5;
                case 5: goto L_0x0eee;
                default: goto L_0x0ee0;
            }
        L_0x0ee0:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0ee6:
            r2 = 45
            X.WAz r1 = new X.WAz
            r1.<init>(r0, r2)
            goto L_0x0f15
        L_0x0eee:
            r5 = 6
            X.WB5 r1 = new X.WB5
            r1.<init>((X.C15328Uac) r0, (X.C16680UzG) r7, (java.lang.String) r2, (int) r5)
            goto L_0x0f13
        L_0x0ef5:
            r2 = 32
            X.WBH r1 = new X.WBH
            r1.<init>((int) r2, (java.lang.Object) r7, (java.lang.Object) r0)
            goto L_0x0f13
        L_0x0efd:
            r2 = 5
            X.WB5 r1 = new X.WB5
            r1.<init>((X.C15328Uac) r0, (X.C16680UzG) r7, (java.lang.String) r6, (int) r2)
            goto L_0x0f15
        L_0x0f04:
            r5 = 4
            X.WB5 r1 = new X.WB5
            r1.<init>((X.C15328Uac) r0, (X.C16680UzG) r7, (java.lang.String) r2, (int) r5)
            goto L_0x0f13
        L_0x0f0b:
            r13 = r12
            goto L_0x0ec3
        L_0x0f0d:
            r2 = 3
            X.WB5 r1 = new X.WB5
            r1.<init>((X.C15328Uac) r0, (X.C16680UzG) r7, (java.lang.String) r5, (int) r2)
        L_0x0f13:
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
        L_0x0f15:
            X.WOP r2 = new X.WOP
            r20 = r1
            r21 = r7
            r22 = r13
            r19 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r14.add(r2)
        L_0x0f25:
            r6 = r16
            goto L_0x0e5b
        L_0x0f29:
            r25 = 0
            goto L_0x0eb6
        L_0x0f2c:
            java.lang.String r19 = "learnMoreInfo"
        L_0x0f2e:
            X.0qQ.A0F(r19)
            goto L_0x1406
        L_0x0f33:
            int r1 = r11.size()
            if (r1 <= r5) goto L_0x0f3a
            r10 = 1
        L_0x0f3a:
            java.util.List r6 = X.00k.A0a(r14)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r2 = 33
            X.WBH r1 = new X.WBH
            r1.<init>((int) r2, (java.lang.Object) r11, (java.lang.Object) r0)
            X.Jw9 r12 = new X.Jw9
            r12.<init>((android.view.View.OnClickListener) r1, (java.lang.Integer) r5, (java.util.List) r6, (boolean) r10)
        L_0x0f4c:
            r0.A05 = r12
            boolean r1 = r0.A0X
            if (r1 == 0) goto L_0x10e0
            X.0eM r5 = r0.A0f
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r5)
            X.0qQ.A0B(r7, r3)
            X.0Tu r6 = X.0Tu.A06
            r1 = 36318256339884095(0x8107430000183f, double:3.031149778998237E-306)
            boolean r1 = X.182.A06(r6, r7, r1)
            if (r1 == 0) goto L_0x10e0
            X.3FZ r6 = r4.A00(r9, r8)
            r28 = 0
            if (r6 == 0) goto L_0x10ac
            java.lang.Class<X.UJF> r2 = X.UJF.class
            java.lang.String r1 = "ig_advertiser"
            X.3FZ r6 = r6.A00(r2, r1)
            if (r6 == 0) goto L_0x10ac
            java.lang.Class<X.UJE> r2 = X.UJE.class
            java.lang.String r1 = "ig_advertiser_settings"
            X.3FZ r6 = r6.A00(r2, r1)
            if (r6 == 0) goto L_0x10ac
            java.lang.Class<X.UJD> r2 = X.UJD.class
            java.lang.String r1 = "ig_boost_highlights_hub"
            X.3FZ r6 = r6.A00(r2, r1)
            if (r6 == 0) goto L_0x10ac
            java.lang.Class<X.UJC> r2 = X.UJC.class
            java.lang.String r1 = "inbox_items"
            X.3FZ r6 = r6.A00(r2, r1)
            if (r6 == 0) goto L_0x10ac
            java.lang.Class<X.UJB> r2 = X.UJB.class
            java.lang.String r1 = "items"
            com.google.common.collect.ImmutableList r11 = r6.A02(r1, r2)
        L_0x0fa0:
            X.3FZ r1 = r4.A00(r9, r8)
            if (r1 == 0) goto L_0x10a4
            java.lang.Class<X.UJF> r10 = X.UJF.class
            java.lang.String r7 = "ig_advertiser"
            X.3FZ r1 = r1.A00(r10, r7)
            if (r1 == 0) goto L_0x10a4
            X.3FZ r1 = r4.A00(r9, r8)
            if (r1 == 0) goto L_0x109c
            X.3FZ r1 = r1.A00(r10, r7)
            if (r1 == 0) goto L_0x109c
            java.lang.Class<X.UJE> r6 = X.UJE.class
            java.lang.String r2 = "ig_advertiser_settings"
            X.3FZ r1 = r1.A00(r6, r2)
            if (r1 == 0) goto L_0x109c
            X.3FZ r1 = r4.A00(r9, r8)
            if (r1 == 0) goto L_0x1094
            X.3FZ r1 = r1.A00(r10, r7)
            if (r1 == 0) goto L_0x1094
            X.3FZ r4 = r1.A00(r6, r2)
            if (r4 == 0) goto L_0x1094
            java.lang.Class<X.UJD> r2 = X.UJD.class
            java.lang.String r1 = "ig_boost_highlights_hub"
            X.3FZ r1 = r4.A00(r2, r1)
            if (r1 == 0) goto L_0x1094
            if (r11 == 0) goto L_0x0fea
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x1006
        L_0x0fea:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r4 = "inbox_item_empty"
        L_0x0ff0:
            X.0wc r2 = X.DbT.A0Q(r0, r1, r3)
            java.lang.String r1 = "igd_multi_suggest_posts_empty_issue"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x1006
            X.DbS.A1J(r2, r4)
            r2.Cgf()
        L_0x1006:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r11 == 0) goto L_0x10b3
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r11)
            java.util.Iterator r10 = r11.iterator()
            r23 = 0
        L_0x1017:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x10b0
            java.lang.Object r7 = r10.next()
            int r9 = r23 + 1
            if (r23 >= 0) goto L_0x102a
            X.0sr.A1T()
            goto L_0x1406
        L_0x102a:
            X.3FZ r7 = (X.AnonymousClass3FZ) r7
            java.lang.String r1 = "organic_media_ig_id"
            java.lang.String r22 = r7.A05(r1)
            java.lang.String r8 = ""
            if (r22 != 0) goto L_0x1038
            r22 = r8
        L_0x1038:
            java.lang.String r2 = "thumbnail_url"
            java.lang.String r1 = r7.A05(r2)
            if (r1 == 0) goto L_0x1091
            java.lang.String r1 = r7.A05(r2)
            com.instagram.common.typedurl.SimpleImageUrl r5 = new com.instagram.common.typedurl.SimpleImageUrl
            r5.<init>(r1)
        L_0x1049:
            java.lang.String r1 = "title"
            java.lang.String r27 = r7.A05(r1)
            if (r27 != 0) goto L_0x1053
            r27 = r8
        L_0x1053:
            java.lang.Class<X.UJA> r2 = X.UJA.class
            r1 = 241(0xf1, float:3.38E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.3FZ r1 = r7.A00(r2, r1)
            if (r1 == 0) goto L_0x108f
            java.lang.String r2 = "post_creation_time"
            org.json.JSONObject r1 = r1.A00
            int r1 = r1.optInt(r2)
        L_0x1069:
            java.lang.Integer r21 = X.AnonymousClass05K.A00
            long r1 = (long) r1
            r7 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r7
            java.lang.Long r26 = java.lang.Long.valueOf(r1)
            X.WA2 r19 = new X.WA2
            r20 = r0
            r24 = r3
            r19.<init>(r20, r21, r22, r23, r24)
            X.WOO r1 = new X.WOO
            r22 = r1
            r23 = r19
            r24 = r5
            r25 = r21
            r22.<init>(r23, r24, r25, r26, r27)
            r6.add(r1)
            r23 = r9
            goto L_0x1017
        L_0x108f:
            r1 = 0
            goto L_0x1069
        L_0x1091:
            r5 = r28
            goto L_0x1049
        L_0x1094:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r4 = "highlight_hub_null"
            goto L_0x0ff0
        L_0x109c:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r4 = "ig_advertiser_setting_null"
            goto L_0x0ff0
        L_0x10a4:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r4 = "ig_advertiser_null"
            goto L_0x0ff0
        L_0x10ac:
            r11 = r28
            goto L_0x0fa0
        L_0x10b0:
            r4.addAll(r6)
        L_0x10b3:
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            int r10 = r4.size()
            java.lang.String r9 = ""
            java.lang.Long r30 = X.C51971G9r.A0m()
            X.WA2 r6 = new X.WA2
            r7 = r0
            r8 = r5
            r11 = r3
            r6.<init>(r7, r8, r9, r10, r11)
            X.WOO r1 = new X.WOO
            r26 = r1
            r27 = r6
            r29 = r5
            r31 = r9
            r26.<init>(r27, r28, r29, r30, r31)
            r4.add(r1)
            X.WAX r2 = X.WAX.A00
            X.Jw9 r1 = new X.Jw9
            r1.<init>((android.view.View.OnClickListener) r2, (java.lang.Integer) r5, (java.util.List) r4, (boolean) r3)
            r0.A06 = r1
        L_0x10e0:
            X.C15328Uac.A08(r0)
            r0 = 1642800949(0x61eb2735, float:5.4222625E20)
            X.AnonymousClass0fD.A0A(r0, r15)
            r1 = -1595934056(0xffffffffa0dffa98, float:-3.7943498E-19)
            r0 = r18
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x10f2:
            r1 = 1101208709(0x41a31c85, float:20.388926)
            int r8 = X.AnonymousClass0fD.A03(r1)
            X.UXT r4 = (X.UXT) r4
            r1 = -1622823007(0xffffffff9f45afa1, float:-4.186165E-20)
            int r5 = X.AnonymousClass7TG.A0D(r4, r1)
            java.util.List r3 = r4.A01
            if (r3 == 0) goto L_0x1111
            java.lang.Object r2 = r0.A01
            X.Uac r2 = (X.C15328Uac) r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r2.A0R = r1
        L_0x1111:
            java.lang.Object r0 = r0.A01
            X.Uac r0 = (X.C15328Uac) r0
            X.C15328Uac.A08(r0)
            r0 = 1662769832(0x631bdaa8, float:2.8750012E21)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1388865113(0x52c86659, float:4.30355284E11)
            goto L_0x16cc
        L_0x1123:
            r1 = 1732258371(0x67402a43, float:9.0747396E23)
            int r8 = X.AnonymousClass0fD.A03(r1)
            X.UXQ r4 = (X.UXQ) r4
            r1 = 303396753(0x12157791, float:4.7163487E-28)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r6 = 0
            X.0qQ.A0B(r4, r6)
            java.util.List r1 = r4.A01
            if (r1 == 0) goto L_0x119c
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            if (r1 == 0) goto L_0x119c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x119c
            X.V42 r3 = new X.V42
            r3.<init>()
            java.lang.String r1 = r4.A00
            r3.A02 = r1
            java.util.List r1 = r4.A01
            if (r1 == 0) goto L_0x1182
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            if (r2 == 0) goto L_0x1182
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x1182
            java.lang.Object r2 = r2.get(r6)
            X.VZE r2 = (X.VZE) r2
            java.lang.String r1 = r2.A04
            r3.A05 = r1
            java.lang.String r1 = r2.A03
            r3.A06 = r1
            java.lang.String r1 = r2.A02
            r3.A04 = r1
            com.instagram.common.typedurl.ImageUrl r1 = r2.A01
            r3.A00 = r1
            X.VRX r2 = r2.A00
            if (r2 == 0) goto L_0x1182
            java.lang.String r1 = r2.A00
            r3.A01 = r1
            java.lang.String r1 = r2.A01
            r3.A03 = r1
        L_0x1182:
            java.lang.String r2 = r3.A05
            if (r2 == 0) goto L_0x119c
            java.lang.Object r1 = r0.A01
            X.Uac r1 = (X.C15328Uac) r1
            X.WSw r0 = r1.A0F
            if (r0 != 0) goto L_0x1192
            java.lang.String r15 = "aymtCache"
            goto L_0x12b3
        L_0x1192:
            java.util.Set r0 = r0.A00
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x119c
            r1.A0A = r3
        L_0x119c:
            r0 = 410576850(0x1878e7d2, float:3.2170288E-24)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1674801636(0xffffffff9c2c8e1c, float:-5.70937E-22)
            goto L_0x16cc
        L_0x11a7:
            r1 = -72170723(0xfffffffffbb2c31d, float:-1.8563724E36)
            int r8 = X.AnonymousClass0fD.A03(r1)
            X.3FZ r4 = (X.AnonymousClass3FZ) r4
            r1 = -1402926917(0xffffffffac6108bb, float:-3.197927E-12)
            int r7 = X.AnonymousClass0fD.A03(r1)
            r10 = 0
            X.0qQ.A0B(r4, r10)
            java.lang.Class<X.UJR> r6 = X.UJR.class
            java.lang.String r5 = "xfb_shadow_instagram_user"
            X.3FZ r1 = r4.A00(r6, r5)
            java.lang.String r15 = "adsManagerLogger"
            java.lang.Object r9 = r0.A01
            X.Uac r9 = (X.C15328Uac) r9
            X.VwK r2 = r9.A07
            if (r1 == 0) goto L_0x1289
            if (r2 == 0) goto L_0x12b3
            r0 = 386(0x182, float:5.41E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = "two_fac_acct_freeze_fetch"
            java.lang.String r0 = ""
            r2.A04(r3, r1, r0)
        L_0x11dc:
            X.3FZ r1 = r4.A00(r6, r5)
            if (r1 == 0) goto L_0x1278
            java.lang.String r0 = "is_personal_ad_acct_user_2fac_restricted"
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x1278
            androidx.fragment.app.FragmentActivity r14 = r9.requireActivity()
            X.0eM r0 = r9.A0f
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.VwK r3 = r9.A07
            if (r3 == 0) goto L_0x12b3
            java.lang.String r1 = "promote_ads_manager_fragment"
            r2 = 2131970120(0x7f134848, float:1.9577182E38)
            r11 = 1
            r13 = 2131970111(0x7f13483f, float:1.9577164E38)
            java.lang.String r0 = r9.getString(r13)
            java.lang.String r12 = X.C13991Tnr.A0d(r9, r0, r2)
            r0 = 47
            X.Wxa r2 = new X.Wxa
            r2.<init>(r9, r0)
            X.0qQ.A0B(r4, r11)
            X.J7R r6 = new X.J7R
            r6.<init>(r14, r4, r1, r10)
            X.J7z r15 = new X.J7z
            r17 = r14
            r18 = r3
            r19 = r1
            r20 = r10
            r16 = r4
            r15.<init>(r16, r17, r18, r19, r20)
            r1 = 7
            X.JG1 r0 = new X.JG1
            r0.<init>(r1, r2, r3)
            r5 = 8
            X.W5U r4 = new X.W5U
            r4.<init>(r15, r5)
            X.W5U r15 = new X.W5U
            r15.<init>(r0, r5)
            r3 = 2131970121(0x7f134849, float:1.9577184E38)
            r1 = 2131970119(0x7f134847, float:1.957718E38)
            r0 = 2131970122(0x7f13484a, float:1.9577186E38)
            X.8ab r2 = new X.8ab
            r2.<init>((android.content.Context) r14)
            r2.A09(r3)
            r2.A0J(r4, r1)
            r2.A0G(r15, r0)
            r2.A0s(r11)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r14, r13)
            X.W5U r0 = new X.W5U
            r0.<init>(r6, r5)
            r2.A0Z(r0, r12, r1)
            r2.A0s(r10)
            android.app.Dialog r0 = r2.A02()
            X.AnonymousClass0fN.A00(r0)
            r9.A04 = r0
            r9.A0W = r11
        L_0x126d:
            r0 = -1633384180(0xffffffff9ea4890c, float:-1.7420857E-20)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 1163284289(0x45564f41, float:3428.9534)
            goto L_0x16cc
        L_0x1278:
            boolean r0 = r9.A0W
            if (r0 == 0) goto L_0x126d
            r9.A0W = r10
            X.VwK r2 = r9.A07
            if (r2 == 0) goto L_0x12b3
            r1 = 0
            java.lang.String r0 = "two_fac_set_up_success"
            r2.A08(r3, r0, r1, r1)
            goto L_0x126d
        L_0x1289:
            if (r2 == 0) goto L_0x12b3
            r1 = 0
            r0 = 386(0x182, float:5.41E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "ads_manager"
            r2.A09(r3, r0, r1, r1)
            goto L_0x11dc
        L_0x1299:
            r1 = -1330028677(0xffffffffb0b95f7b, float:-1.3487659E-9)
            int r5 = X.AnonymousClass0fD.A03(r1)
            X.UXS r4 = (X.UXS) r4
            r1 = 1037247793(0x3dd32531, float:0.10309828)
            int r6 = X.AnonymousClass7TG.A0D(r4, r1)
            java.lang.Object r7 = r0.A01
            X.UZU r7 = (X.UZU) r7
            X.3AD r0 = r7.A04
            if (r0 != 0) goto L_0x12bb
            java.lang.String r15 = "pullToRefresh"
        L_0x12b3:
            X.0qQ.A0F(r15)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x12bb:
            boolean r0 = r0 instanceof X.C19763Wf4
            if (r0 != 0) goto L_0x12d2
            X.UdV r1 = r7.A01
            if (r1 != 0) goto L_0x12c6
            java.lang.String r15 = "promoteAdToolsAdapter"
            goto L_0x12b3
        L_0x12c6:
            java.util.List r0 = r7.A0A
            r1.A01(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r7.A05
            if (r0 == 0) goto L_0x12d2
            X.JTO.A1X(r0)
        L_0x12d2:
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x12e6
            X.UZU.A02(r7)
        L_0x12d9:
            r0 = 208208328(0xc6901c8, float:1.7950203E-31)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -1676483646(0xffffffff9c12e3c2, float:-4.860172E-22)
        L_0x12e2:
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x12e6:
            X.VwK r4 = r7.A00
            if (r4 != 0) goto L_0x12ed
            java.lang.String r15 = "adsManagerLogger"
            goto L_0x12b3
        L_0x12ed:
            java.lang.String r3 = r7.A07
            r2 = 0
            java.lang.String r1 = "ads_manager_highlights_hub"
            java.lang.String r0 = "active"
            r4.A08(r1, r0, r3, r2)
            X.UZU.A00(r7)
            goto L_0x12d9
        L_0x12fb:
            r1 = 1929195670(0x72fd3096, float:1.0029881E31)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.3FZ r4 = (X.AnonymousClass3FZ) r4
            r1 = 1190595170(0x46f70a62, float:31621.191)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r8 = 0
            X.0qQ.A0B(r4, r8)
            java.lang.Class<X.UJG> r2 = X.UJG.class
            java.lang.String r1 = "xig_user_by_igid_v2"
            X.3FZ r4 = r4.A00(r2, r1)
            r14 = 0
            if (r4 == 0) goto L_0x13f9
            java.lang.Class<X.UJF> r2 = X.UJF.class
            java.lang.String r1 = "ig_advertiser"
            X.3FZ r4 = r4.A00(r2, r1)
            if (r4 == 0) goto L_0x13f9
            java.lang.Class<X.UJE> r2 = X.UJE.class
            java.lang.String r1 = "ig_advertiser_settings"
            X.3FZ r4 = r4.A00(r2, r1)
            if (r4 == 0) goto L_0x13f9
            java.lang.Class<X.UJD> r2 = X.UJD.class
            java.lang.String r1 = "ig_boost_highlights_hub"
            X.3FZ r4 = r4.A00(r2, r1)
            if (r4 == 0) goto L_0x13f9
            java.lang.Class<X.UJ9> r2 = X.UJ9.class
            java.lang.String r1 = "available_items"
            com.google.common.collect.ImmutableList r1 = r4.A02(r1, r2)
            if (r1 == 0) goto L_0x13f9
            java.lang.Object r9 = r0.A01
            X.UZU r9 = (X.UZU) r9
            X.3kO r13 = X.C66580MXl.A0J(r1)
        L_0x134a:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x13f9
            java.lang.Object r2 = r13.next()
            X.3FZ r2 = (X.AnonymousClass3FZ) r2
            java.lang.String r1 = "title"
            java.lang.String r19 = r2.A05(r1)
            java.lang.String r1 = "description"
            java.lang.String r20 = r2.A05(r1)
            X.Uz6 r4 = X.C16670Uz6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "item_action"
            java.lang.Enum r4 = r2.A04(r1, r4)
            java.util.Map r1 = X.W3M.A01
            java.lang.Object r7 = r1.get(r4)
            X.UzG r7 = (X.C16680UzG) r7
            java.lang.String r1 = "thumbnail_url"
            java.lang.String r1 = r2.A05(r1)
            if (r1 == 0) goto L_0x13f7
            com.instagram.common.typedurl.SimpleImageUrl r6 = new com.instagram.common.typedurl.SimpleImageUrl
            r6.<init>(r1)
        L_0x137f:
            if (r19 == 0) goto L_0x134a
            if (r20 == 0) goto L_0x134a
            if (r7 == 0) goto L_0x134a
            java.util.List r4 = r9.A0A
            r1 = 1070(0x42e, float:1.5E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r11 = r2.A05(r1)
            java.lang.String r1 = "ad_account_id"
            java.lang.String r12 = r2.A05(r1)
            java.lang.String r1 = "organic_media_ig_id"
            java.lang.String r10 = r2.A05(r1)
            java.lang.String r1 = "is_story_post"
            boolean r26 = r2.A06(r1)
            int r1 = r7.ordinal()
            switch(r1) {
                case 0: goto L_0x13b0;
                case 1: goto L_0x13de;
                case 2: goto L_0x13b6;
                case 3: goto L_0x13bd;
                case 4: goto L_0x13c4;
                case 5: goto L_0x13cc;
                default: goto L_0x13aa;
            }
        L_0x13aa:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x13b0:
            X.WB5 r2 = new X.WB5
            r2.<init>((java.lang.Object) r7, (java.lang.Object) r9, (java.lang.String) r12, (int) r8)
            goto L_0x13db
        L_0x13b6:
            r1 = 1
            X.WB5 r2 = new X.WB5
            r2.<init>((java.lang.Object) r7, (java.lang.Object) r9, (java.lang.String) r10, (int) r1)
            goto L_0x13db
        L_0x13bd:
            r1 = 2
            X.WB5 r2 = new X.WB5
            r2.<init>((java.lang.Object) r7, (java.lang.Object) r9, (java.lang.String) r11, (int) r1)
            goto L_0x13e5
        L_0x13c4:
            r1 = 31
            X.WBH r2 = new X.WBH
            r2.<init>((int) r1, (java.lang.Object) r7, (java.lang.Object) r9)
            goto L_0x13db
        L_0x13cc:
            r22 = 1
            X.OjA r2 = new X.OjA
            r21 = r2
            r23 = r7
            r24 = r6
            r25 = r9
            r21.<init>(r22, r23, r24, r25, r26)
        L_0x13db:
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            goto L_0x13e5
        L_0x13de:
            r1 = 43
            X.WAz r2 = new X.WAz
            r2.<init>(r9, r1)
        L_0x13e5:
            X.WOP r15 = new X.WOP
            r21 = r8
            r18 = r6
            r17 = r7
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r4.add(r15)
            goto L_0x134a
        L_0x13f7:
            r6 = r14
            goto L_0x137f
        L_0x13f9:
            java.lang.Object r2 = r0.A01
            X.UZU r2 = (X.UZU) r2
            X.UdV r1 = r2.A01
            if (r1 != 0) goto L_0x140b
            java.lang.String r0 = "promoteAdToolsAdapter"
            X.0qQ.A0F(r0)
        L_0x1406:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x140b:
            java.util.List r0 = r2.A0A
            r1.A01(r0)
            X.UZU.A01(r2)
            r0 = 57987084(0x374d00c, float:7.194398E-37)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 690347730(0x2925ded2, float:3.6830626E-14)
            goto L_0x165a
        L_0x141e:
            r1 = 1404842248(0x53bc3108, float:1.61655292E12)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.Ufu r4 = (X.C15628Ufu) r4
            r1 = -521618534(0xffffffffe0e8bb9a, float:-1.3416134E20)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r7 = 0
            X.0qQ.A0B(r4, r7)
            java.lang.Object r6 = r0.A01
            X.Vsg r6 = (X.C18485Vsg) r6
            X.VO3 r1 = r4.A00
            if (r1 == 0) goto L_0x1476
            X.VO2 r0 = r1.A00
            if (r0 == 0) goto L_0x1476
            X.VSL r0 = r0.A00
            if (r0 == 0) goto L_0x1476
            X.VSK r0 = r0.A00
            if (r0 == 0) goto L_0x1476
            java.lang.String r8 = r0.A00
            r4 = 1
            boolean r0 = r0.A01
            if (r0 != r4) goto L_0x1477
        L_0x144d:
            X.VO2 r0 = r1.A00
            if (r0 == 0) goto L_0x150c
            X.VSL r0 = r0.A00
            if (r0 == 0) goto L_0x150c
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x150c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x1462:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x147b
            java.lang.Object r0 = r1.next()
            X.VO1 r0 = (X.VO1) r0
            X.Vcc r0 = r0.A00
            if (r0 == 0) goto L_0x1462
            r2.add(r0)
            goto L_0x1462
        L_0x1476:
            r8 = 0
        L_0x1477:
            r4 = 0
            if (r1 == 0) goto L_0x150c
            goto L_0x144d
        L_0x147b:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r2.iterator()
        L_0x1484:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x14a1
            java.lang.Object r2 = r9.next()
            r1 = r2
            X.Vcc r1 = (X.C17707Vcc) r1
            java.lang.String r0 = r1.A0A
            if (r0 == 0) goto L_0x1484
            java.lang.String r0 = r1.A09
            if (r0 == 0) goto L_0x1484
            java.lang.String r0 = r1.A0B
            if (r0 == 0) goto L_0x1484
            r10.add(r2)
            goto L_0x1484
        L_0x14a1:
            java.util.ArrayList r0 = X.AnonymousClass7TG.A0r(r10)
            java.util.Iterator r12 = r10.iterator()
        L_0x14a9:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x150e
            java.lang.Object r11 = r12.next()
            X.Vcc r11 = (X.C17707Vcc) r11
            X.VNz r1 = r11.A06
            if (r1 == 0) goto L_0x14fe
            X.Vac r10 = r1.A00
        L_0x14bb:
            java.lang.String r2 = r11.A0A
            java.lang.String r1 = "Required value was null."
            if (r2 == 0) goto L_0x1506
            java.lang.String r9 = r11.A0B
            if (r9 == 0) goto L_0x1500
            java.lang.String r1 = r11.A09
            com.instagram.common.typedurl.SimpleImageUrl r15 = new com.instagram.common.typedurl.SimpleImageUrl
            r15.<init>(r1)
            X.UyL r1 = r11.A08
            X.UwY r14 = X.VA6.A00(r1)
            int r2 = r11.A01
            java.lang.String r1 = "CALL"
            X.VA8.A00(r10, r1)
            java.lang.String r1 = "EMAIL"
            X.VA8.A00(r10, r1)
            java.lang.String r1 = "DIRECTION"
            X.VA8.A00(r10, r1)
            java.lang.String r1 = "TEXT"
            X.VA8.A00(r10, r1)
            java.lang.String r1 = "BIO_LINK_CLICKED"
            X.VA8.A00(r10, r1)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r7)
            X.L8o r13 = new X.L8o
            r17 = r9
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r0.add(r13)
            goto L_0x14a9
        L_0x14fe:
            r10 = 0
            goto L_0x14bb
        L_0x1500:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1506:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x150c:
            X.0sn r0 = X.0sn.A00
        L_0x150e:
            X.L5v r2 = new X.L5v
            r2.<init>(r8, r0, r4)
            java.util.List r0 = r6.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x1519:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1529
            java.lang.Object r0 = r1.next()
            X.X6K r0 = (X.X6K) r0
            r0.onSuccess(r2)
            goto L_0x1519
        L_0x1529:
            r0 = -1976844391(0xffffffff8a2bbf99, float:-8.269386E-33)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 447118604(0x1aa67d0c, float:6.8858015E-23)
            goto L_0x165a
        L_0x1534:
            r1 = -379786097(0xffffffffe95cec8f, float:-1.669255E25)
            int r3 = X.AnonymousClass0fD.A03(r1)
            X.Uft r4 = (X.C15627Uft) r4
            r1 = 2067734306(0x7b3f1f22, float:9.9236015E35)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r2 = 0
            X.0qQ.A0B(r4, r2)
            java.lang.Object r7 = r0.A01
            X.Vsg r7 = (X.C18485Vsg) r7
            X.VNp r1 = r4.A00
            if (r1 == 0) goto L_0x158c
            X.VNo r0 = r1.A00
            if (r0 == 0) goto L_0x158c
            X.VSI r0 = r0.A00
            if (r0 == 0) goto L_0x158c
            X.VSH r0 = r0.A00
            if (r0 == 0) goto L_0x158c
            java.lang.String r8 = r0.A00
            r6 = 1
            boolean r0 = r0.A01
            if (r0 != r6) goto L_0x158d
        L_0x1563:
            X.VNo r0 = r1.A00
            if (r0 == 0) goto L_0x1634
            X.VSI r0 = r0.A00
            if (r0 == 0) goto L_0x1634
            java.util.List r0 = r0.A01
            if (r0 == 0) goto L_0x1634
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x1578:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1591
            java.lang.Object r0 = r1.next()
            X.VNn r0 = (X.C17235VNn) r0
            X.Vcg r0 = r0.A00
            if (r0 == 0) goto L_0x1578
            r4.add(r0)
            goto L_0x1578
        L_0x158c:
            r8 = 0
        L_0x158d:
            r6 = 0
            if (r1 == 0) goto L_0x1634
            goto L_0x1563
        L_0x1591:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r4.iterator()
        L_0x159a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x15bb
            java.lang.Object r4 = r9.next()
            r1 = r4
            X.Vcg r1 = (X.C17711Vcg) r1
            java.lang.String r0 = r1.A0B
            if (r0 == 0) goto L_0x159a
            X.VNZ r0 = r1.A07
            if (r0 == 0) goto L_0x159a
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x159a
            java.lang.String r0 = r1.A0C
            if (r0 == 0) goto L_0x159a
            r10.add(r4)
            goto L_0x159a
        L_0x15bb:
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r10)
            java.util.Iterator r12 = r10.iterator()
        L_0x15c3:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x1636
            java.lang.Object r11 = r12.next()
            X.Vcg r11 = (X.C17711Vcg) r11
            X.VNm r0 = r11.A09
            if (r0 == 0) goto L_0x1620
            X.Vab r10 = r0.A00
        L_0x15d5:
            java.lang.String r0 = r11.A0B
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x162e
            java.lang.String r9 = r11.A0C
            if (r9 == 0) goto L_0x1628
            X.VNZ r0 = r11.A07
            if (r0 == 0) goto L_0x1622
            java.lang.String r0 = r0.A00
            com.instagram.common.typedurl.SimpleImageUrl r15 = new com.instagram.common.typedurl.SimpleImageUrl
            r15.<init>(r0)
            X.UyL r0 = r11.A0A
            X.UwY r14 = X.VA6.A00(r0)
            if (r10 == 0) goto L_0x161e
            int r1 = r10.A00
        L_0x15f4:
            java.lang.String r0 = "BIO_LINK_CLICKED"
            X.VA7.A00(r10, r0)
            java.lang.String r0 = "CALL"
            X.VA7.A00(r10, r0)
            java.lang.String r0 = "EMAIL"
            X.VA7.A00(r10, r0)
            java.lang.String r0 = "DIRECTION"
            X.VA7.A00(r10, r0)
            java.lang.String r0 = "TEXT"
            X.VA7.A00(r10, r0)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r2)
            X.L8o r13 = new X.L8o
            r17 = r9
            r18 = r1
            r13.<init>(r14, r15, r16, r17, r18)
            r4.add(r13)
            goto L_0x15c3
        L_0x161e:
            r1 = 0
            goto L_0x15f4
        L_0x1620:
            r10 = 0
            goto L_0x15d5
        L_0x1622:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1628:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x162e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x1634:
            X.0sn r4 = X.0sn.A00
        L_0x1636:
            X.LD0 r2 = new X.LD0
            r2.<init>(r8, r4, r6)
            java.util.List r0 = r7.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x1641:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x1651
            java.lang.Object r0 = r1.next()
            X.X6K r0 = (X.X6K) r0
            r0.onSuccess(r2)
            goto L_0x1641
        L_0x1651:
            r0 = 177922502(0xa9ae1c6, float:1.4914587E-32)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 402042892(0x17f6b00c, float:1.5941818E-24)
        L_0x165a:
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x165e:
            r1 = -1452184397(0xffffffffa9716cb3, float:-5.360703E-14)
            int r8 = X.AnonymousClass0fD.A03(r1)
            X.UX0 r4 = (X.UX0) r4
            r1 = -8881288(0xffffffffff787b78, float:-3.3028963E38)
            int r5 = X.AnonymousClass0fD.A03(r1)
            java.util.List r1 = r4.A00
            if (r1 == 0) goto L_0x1697
            com.instagram.common.recyclerview.ViewModelListUpdate r4 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r4.<init>()
            java.util.Iterator r3 = r1.iterator()
        L_0x167b:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x168e
            com.instagram.user.model.User r2 = X.DbT.A0k(r3)
            X.WRs r1 = new X.WRs
            r1.<init>(r2)
            r4.A00(r1)
            goto L_0x167b
        L_0x168e:
            java.lang.Object r0 = r0.A01
            com.instagram.archive.fragment.ArchiveReelPeopleFragment r0 = (com.instagram.archive.fragment.ArchiveReelPeopleFragment) r0
            X.2t9 r0 = r0.A00
            r0.A05(r4)
        L_0x1697:
            r0 = 47985499(0x2dc335b, float:3.2355571E-37)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -438884696(0xffffffffe5d726a8, float:-1.2700273E23)
            goto L_0x16cc
        L_0x16a1:
            r1 = -994193345(0xffffffffc4bdd03f, float:-1518.5077)
            int r8 = X.AnonymousClass0fD.A03(r1)
            X.UXW r4 = (X.UXW) r4
            r1 = -1807299788(0xffffffff9446cb34, float:-1.003652E-26)
            int r7 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r3 = r0.A01
            com.instagram.archive.fragment.ArchiveReelMapFragment r3 = (com.instagram.archive.fragment.ArchiveReelMapFragment) r3
            double r5 = r4.A00
            double r1 = r4.A01
            com.facebook.android.maps.model.LatLng r0 = new com.facebook.android.maps.model.LatLng
            r0.<init>(r5, r1)
            r3.A00 = r0
            com.instagram.archive.fragment.ArchiveReelMapFragment.A01(r3)
            r0 = -1962436105(0xffffffff8b0799f7, float:-2.6115885E-32)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = 1598609661(0x5f48d8fd, float:1.4472596E19)
        L_0x16cc:
            X.AnonymousClass0fD.A0A(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15621Ufn.onSuccess(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0065, code lost:
        X.DbS.A17();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0094, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0097, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 2: goto L_0x006d;
                case 21: goto L_0x0037;
                case 22: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C15621Ufn.super.onSuccessInBackground(r6)
            return
        L_0x0009:
            r0 = -1495660459(0xffffffffa6da0855, float:-1.5129047E-15)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 941990356(0x3825a1d4, float:3.948978E-5)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.UaS r0 = (X.C15320UaS) r0
            com.instagram.common.session.UserSession r0 = r0.A0H
            if (r0 == 0) goto L_0x0065
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            X.6ur r0 = new X.6ur
            r0.<init>(r1)
            r2.A00(r0)
            r0 = 1685141030(0x64713626, float:1.7798269E22)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -550417738(0xffffffffdf314ab6, float:-1.2775223E19)
            goto L_0x0094
        L_0x0037:
            r0 = 217018337(0xcef6fe1, float:3.6891115E-31)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -1644042935(0xffffffff9e01e549, float:-6.876618E-21)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r5.A01
            X.UaS r0 = (X.C15320UaS) r0
            com.instagram.common.session.UserSession r0 = r0.A0H
            if (r0 == 0) goto L_0x0065
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A1I
            X.6ur r0 = new X.6ur
            r0.<init>(r1)
            r2.A00(r0)
            r0 = 933479065(0x37a3c299, float:1.952173E-5)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 578672950(0x227dd936, float:3.4402884E-18)
            goto L_0x0094
        L_0x0065:
            X.DbS.A17()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006d:
            r0 = 693394347(0x29545bab, float:4.7152966E-14)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.Q4E r6 = (X.Q4E) r6
            r0 = 988641867(0x3aed7a4b, float:0.0018118111)
            int r3 = X.AnonymousClass7TG.A0D(r6, r0)
            java.lang.Object r2 = r5.A01
            X.Q4D r2 = (X.Q4D) r2
            java.util.concurrent.Executor r1 = r2.A02
            X.Q4G r0 = new X.Q4G
            r0.<init>(r6, r2)
            r1.execute(r0)
            r0 = -1012851173(0xffffffffc3a11e1b, float:-322.2352)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -133045799(0xfffffffff811e1d9, float:-1.1835372E34)
        L_0x0094:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15621Ufn.onSuccessInBackground(java.lang.Object):void");
    }
}
