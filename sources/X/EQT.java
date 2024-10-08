package X;

import android.content.Context;
import java.util.ArrayList;

public final class EQT extends H4J {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EQT(0hq r1, Object obj, Object obj2, int i) {
        super(r1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onFail(C268654dm r5) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(-1071451717);
                ArrayList A1C = AnonymousClass7TE.A1C();
                EST est = ((C49398Ev0) this.A02).A00;
                FGF.A00(est, A1C, 2131972232);
                est.setItems(A1C);
                est.A01.A03(false);
                i = 898688193;
                break;
            case 1:
                A03 = AnonymousClass0fD.A03(-617542018);
                ESU esu = ((C49681F1p) this.A02).A00;
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                FGF.A00(esu, A1C2, 2131972232);
                esu.setItems(A1C2);
                ((ESU) this.A01).A04.A03(false);
                i = -1162856943;
                break;
            case 2:
                A03 = AnonymousClass7TG.A0D(r5, -1201182727);
                C49952FGh.A02((Context) this.A01, r5);
                i = -795438894;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-12625190);
                String id = ((1Xj) this.A02).getId();
                if (id != null) {
                    0wb.A03("ClipsRemixUtil_configure_audio_for_remix_on_fail", 002.A0R("failure for media id: ", id));
                    DbS.A1U(this.A01);
                    i = 1815160833;
                    break;
                } else {
                    IllegalStateException A0y = AnonymousClass7TE.A0y();
                    AnonymousClass0fD.A0A(1630933416, A03);
                    throw A0y;
                }
        }
        AnonymousClass0fD.A0A(i, A03);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.Oak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: X.Fmc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.EbY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: X.UsO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: X.Oak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: X.Fmc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: X.EbY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v11, resolved type: X.Fmc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: X.EbY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: X.Fmc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: X.UsO} */
    /* JADX WARNING: type inference failed for: r8v5, types: [X.DfA, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0438, code lost:
        r8.add(r4);
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x046c, code lost:
        r8.add(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x047f, code lost:
        r8.add(r2);
        r12.add(r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02b3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r30) {
        /*
            r29 = this;
            r11 = r29
            r3 = r30
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x01fb;
                case 1: goto L_0x009b;
                case 2: goto L_0x0061;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 171691893(0xa3bcf75, float:9.042741E-33)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.CF9 r3 = (X.CF9) r3
            r0 = 534217067(0x1fd7816b, float:9.1270146E-20)
            int r2 = X.AnonymousClass7TG.A0D(r3, r0)
            X.1dl r1 = r3.A00
            if (r1 == 0) goto L_0x0025
            com.instagram.api.schemas.OriginalSoundData r0 = r1.A01
            if (r0 != 0) goto L_0x004c
            com.instagram.api.schemas.MusicInfo r0 = r1.A00
            if (r0 != 0) goto L_0x004c
        L_0x0025:
            java.lang.String r1 = "null music metadata for media id: "
            java.lang.Object r0 = r11.A02
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x0056
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "ClipsRemixUtil_configure_audio_for_remix_null_response"
            X.0wb.A03(r0, r1)
        L_0x003a:
            java.lang.Object r0 = r11.A01
            X.DbS.A1U(r0)
            r0 = -2077181531(0xffffffff8430b9a5, float:-2.0773944E-36)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = -427705552(0xffffffffe681bb30, float:-3.0631914E23)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x004c:
            java.lang.Object r0 = r11.A02
            X.1Xj r0 = (X.1Xj) r0
            X.1Xy r0 = r0.A0C
            r0.Edk(r1)
            goto L_0x003a
        L_0x0056:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1200867596(0xffffffffb86c36f4, float:-5.6317964E-5)
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        L_0x0061:
            r0 = 101188680(0x6080448, float:2.5581902E-35)
            int r10 = X.AnonymousClass0fD.A03(r0)
            X.DwU r3 = (X.DwU) r3
            r0 = -1705805558(0xffffffff9a53790a, float:-4.3731552E-23)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r1 = r11.A01
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            java.lang.Object r0 = r11.A02
            X.0lg r0 = (X.0lg) r0
            X.6Yo r2 = X.DbS.A0M(r1, r0)
            X.FFR.A03()
            android.os.Bundle r1 = r3.A00()
            X.ES6 r0 = new X.ES6
            r0.<init>()
            X.DbW.A0x(r1, r0, r2)
            r0 = 2022139635(0x788766f3, float:2.1970254E34)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -435645381(0xffffffffe608943b, float:-1.6124405E23)
            goto L_0x04a6
        L_0x009b:
            r0 = 1222473816(0x48dd7858, float:453570.75)
            int r10 = X.AnonymousClass0fD.A03(r0)
            X.DwO r3 = (X.DwO) r3
            r0 = 286772993(0x1117cf01, float:1.1975588E-28)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r11.A01
            X.ESU r4 = (X.ESU) r4
            java.lang.Object r6 = r11.A02
            X.F1p r6 = (X.C49681F1p) r6
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.lang.String r1 = r4.A05
            java.lang.String r0 = "supervision"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d6
            r0 = 2131974774(0x7f135a76, float:1.9586622E38)
            X.FGF r1 = new X.FGF
            r1.<init>((int) r0)
            r0 = 2132018624(0x7f1405c0, float:1.967556E38)
            r1.A01 = r0
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            r1.A03 = r0
            r5.add(r1)
        L_0x00d6:
            android.content.Context r14 = r4.getContext()
            java.util.List r0 = r3.A01
            java.util.Iterator r13 = r0.iterator()
        L_0x00e0:
            boolean r0 = r13.hasNext()
            r3 = 1
            r12 = 0
            if (r0 == 0) goto L_0x01a3
            java.lang.Object r9 = r13.next()
            X.DrY r9 = (X.C47157DrY) r9
            java.util.List r7 = r9.A06
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00e0
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00ff
            X.DbV.A1W(r5, r3)
        L_0x00ff:
            r8 = 0
            java.lang.Object r0 = r7.get(r12)
            X.9JM r0 = (X.AnonymousClass9JM) r0
            java.lang.String r1 = r0.A05
            java.lang.String r0 = "toggle"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0187
            java.lang.String r0 = "radio"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0169
            java.lang.String r11 = r9.A05
            java.lang.String r1 = r9.A04
            X.DfA r8 = new X.DfA
            r8.<init>()
            r0 = -1
            r8.A05 = r0
            X.C46448DfA.A01(r8)
            r8.A0E = r11
            r8.A0F = r1
            r8.A0K = r12
            r8.A0M = r3
            r8.A0L = r12
            android.content.res.Resources r1 = X.DbV.A05(r4)
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r8.A06 = r0
            r5.add(r8)
            if (r14 == 0) goto L_0x017d
            boolean r0 = X.0oI.A09(r14)
            if (r0 == 0) goto L_0x017d
            java.lang.String r0 = r9.A01
            X.ESU.A0A(r0, r5)
            java.lang.String r8 = X.ESU.A06(r6, r4, r7, r5)
        L_0x0152:
            java.lang.String r7 = r9.A03
            if (r7 == 0) goto L_0x0169
            java.lang.String r3 = r9.A02
            if (r3 == 0) goto L_0x0169
            r0 = 20
            X.FOr r1 = new X.FOr
            r1.<init>((java.lang.String) r3, (java.lang.Object) r4, (int) r0)
            X.FAc r0 = new X.FAc
            r0.<init>((java.lang.CharSequence) r7, (android.view.View.OnClickListener) r1)
            r5.add(r0)
        L_0x0169:
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x00e0
            java.lang.String r0 = "video_call"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00e0
            int r0 = r5.size()
            r4.A00 = r0
            goto L_0x00e0
        L_0x017d:
            java.lang.String r8 = X.ESU.A06(r6, r4, r7, r5)
            java.lang.String r0 = r9.A01
            X.ESU.A0A(r0, r5)
            goto L_0x0152
        L_0x0187:
            if (r14 == 0) goto L_0x0199
            boolean r0 = X.0oI.A09(r14)
            if (r0 == 0) goto L_0x0199
            java.lang.String r0 = r9.A01
            X.ESU.A0A(r0, r5)
            java.lang.String r8 = X.ESU.A07(r6, r4, r7, r5)
            goto L_0x0169
        L_0x0199:
            java.lang.String r8 = X.ESU.A07(r6, r4, r7, r5)
            java.lang.String r0 = r9.A01
            X.ESU.A0A(r0, r5)
            goto L_0x0169
        L_0x01a3:
            X.DbV.A1W(r5, r3)
            r7 = 2131952465(0x7f130351, float:1.9541374E38)
            r0 = 33
            X.FP9 r1 = new X.FP9
            r1.<init>((java.lang.Object) r4, (int) r0)
            X.FAc r0 = new X.FAc
            r0.<init>((android.view.View.OnClickListener) r1, (int) r7)
            r5.add(r0)
            android.content.Context r0 = X.C60960kU.A00
            java.lang.String r1 = X.0lz.A00(r0)
            java.lang.String r0 = "IG"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01f3
            r0 = 2131952466(0x7f130352, float:1.9541376E38)
            java.lang.String r1 = r4.getString(r0)
        L_0x01cd:
            X.FGF r0 = new X.FGF
            r0.<init>((java.lang.CharSequence) r1)
            r5.add(r0)
            X.ESU r0 = r6.A00
            r0.setItems(r5)
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x01e3
            int r0 = r4.A00
            r4.scrollToPosition(r0)
        L_0x01e3:
            X.FBg r0 = r4.A04
            r0.A03(r3)
            r0 = -1254382009(0xffffffffb53ba647, float:-6.9904894E-7)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 1424455195(0x54e7761b, float:7.9529514E12)
            goto L_0x04a6
        L_0x01f3:
            r0 = 2131952469(0x7f130355, float:1.9541382E38)
            java.lang.String r1 = X.DbV.A0z(r4, r1, r0)
            goto L_0x01cd
        L_0x01fb:
            r0 = 259966524(0xf7ec63c, float:1.25613454E-29)
            int r10 = X.AnonymousClass0fD.A03(r0)
            X.DwO r3 = (X.DwO) r3
            r0 = 1998853310(0x772414be, float:3.3279585E33)
            int r13 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r9 = r11.A01
            X.F3U r9 = (X.F3U) r9
            java.util.List r8 = r9.A07
            r8.clear()
            java.util.Set r12 = r9.A08
            r12.clear()
            android.content.Context r7 = r9.A02
            boolean r0 = X.AnonymousClass0oH.A01(r7)
            if (r0 != 0) goto L_0x0265
            X.FBg r0 = r9.A06
            X.0wc r1 = X.C49882FBg.A00(r0)
            java.lang.String r0 = "ig_push_notification_settings_banner"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x023d
            java.lang.String r1 = "impression"
            java.lang.String r0 = "event_type"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x023d:
            r0 = 2131974917(0x7f135b05, float:1.9586912E38)
            java.lang.String r1 = r7.getString(r0)
            r0 = 2131237869(0x7f081bed, float:1.8092E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.Jvv r2 = new X.Jvv
            r2.<init>(r1, r0)
            r0 = 2131974916(0x7f135b04, float:1.958691E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            r1 = 11
            X.FcG r0 = new X.FcG
            r0.<init>(r9, r1)
            r2.A01 = r0
            r8.add(r2)
        L_0x0265:
            java.util.List r0 = r3.A01
            java.util.Iterator r17 = r0.iterator()
            r28 = 0
        L_0x026d:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0487
            java.lang.Object r2 = r17.next()
            X.DrY r2 = (X.C47157DrY) r2
            java.lang.String r1 = r2.A00
            boolean r0 = r9.A09
            if (r0 == 0) goto L_0x0290
            java.lang.String r0 = "push_notifications"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "text_post_app_push_notifications"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0290
            goto L_0x026d
        L_0x0290:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x029f
            r1 = 1
            X.OSr r0 = new X.OSr
            r0.<init>(r1)
            r8.add(r0)
        L_0x029f:
            java.lang.String r1 = r2.A05
            if (r1 != 0) goto L_0x02a5
            java.lang.String r1 = ""
        L_0x02a5:
            X.DfA r0 = new X.DfA
            r0.<init>((java.lang.CharSequence) r1)
            r8.add(r0)
            java.util.List r0 = r2.A06
            java.util.Iterator r16 = r0.iterator()
        L_0x02b3:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x026d
            java.lang.Object r2 = r16.next()
            X.9JM r2 = (X.AnonymousClass9JM) r2
            java.lang.String r1 = r2.A05
            int r0 = r1.hashCode()
            switch(r0) {
                case -868304044: goto L_0x02c9;
                case 1134485835: goto L_0x03b1;
                case 1862666772: goto L_0x044a;
                default: goto L_0x02c8;
            }
        L_0x02c8:
            goto L_0x02b3
        L_0x02c9:
            java.lang.String r0 = "toggle"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r6 = r2.A01
            java.lang.String r0 = "mute_all"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0314
            java.lang.String r0 = "mute_all_but_dms"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0314
            java.lang.String r0 = "message_only_meta_toggle"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r2.A00
            boolean r28 = r1.equals(r0)
            com.instagram.common.session.UserSession r5 = r9.A05
            androidx.fragment.app.Fragment r4 = r9.A04
            X.FBg r3 = r9.A06
            java.lang.String r1 = r2.A04
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r9.A03
            X.UsO r2 = new X.UsO
            r22 = r0
            r23 = r4
            r24 = r5
            r25 = r3
            r26 = r1
            r27 = r6
            r20 = r2
            r21 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x047f
        L_0x0314:
            com.instagram.common.session.UserSession r6 = r9.A05
            androidx.fragment.app.Fragment r5 = r9.A04
            X.FBg r15 = r9.A06
            java.lang.Object r3 = r2.A00
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            if (r3 == 0) goto L_0x02b3
            X.3FW r4 = new X.3FW
            r4.<init>(r6)
            long r0 = X.AnonymousClass7TG.A0I()
            java.lang.String r14 = r2.A04
            boolean r27 = r3.booleanValue()
            java.lang.String r3 = r2.A01
            X.1Av r23 = X.1Au.A00(r6)
            X.0nE r22 = X.C61410nE.A00
            X.ESY r2 = new X.ESY
            r20 = r5
            r21 = r6
            r24 = r15
            r25 = r14
            r26 = r3
            r18 = r2
            r19 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r8.add(r2)
            boolean r15 = X.2Au.A01(r6)
            X.0Tu r14 = X.0Tu.A05
            r2 = 36316001482051424(0x81053600000f60, double:3.029723797825272E-306)
            boolean r2 = X.182.A06(r14, r6, r2)
            if (r2 != 0) goto L_0x0366
            com.instagram.user.model.User r2 = r4.A01
            boolean r2 = r2.A1Z()
            if (r2 == 0) goto L_0x02b3
        L_0x0366:
            boolean r1 = r4.A07(r0)
            if (r15 == 0) goto L_0x03a8
            r0 = 2131973953(0x7f135741, float:1.9584956E38)
            if (r1 == 0) goto L_0x0374
            r0 = 2131973954(0x7f135742, float:1.9584958E38)
        L_0x0374:
            java.lang.String r0 = r5.getString(r0)
            X.FGF r2 = new X.FGF
            r2.<init>((java.lang.CharSequence) r0)
            r0 = 2131971204(0x7f134c84, float:1.957938E38)
            if (r15 == 0) goto L_0x0385
            r0 = 2131973952(0x7f135740, float:1.9584954E38)
        L_0x0385:
            java.lang.String r0 = r5.getString(r0)
            X.FGF r14 = new X.FGF
            r14.<init>((java.lang.CharSequence) r0)
            r3 = 2131971223(0x7f134c97, float:1.957942E38)
            r1 = 62
            X.FPG r0 = new X.FPG
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r6)
            X.Fmc r4 = X.C50989Fmc.A00(r7, r0, r3)
            X.FPG r0 = new X.FPG
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r6)
            r14.A04 = r0
            r8.add(r2)
            goto L_0x0438
        L_0x03a8:
            r0 = 2131971205(0x7f134c85, float:1.9579383E38)
            if (r1 == 0) goto L_0x0374
            r0 = 2131971206(0x7f134c86, float:1.9579385E38)
            goto L_0x0374
        L_0x03b1:
            java.lang.String r0 = "time_range"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            com.instagram.common.session.UserSession r0 = r9.A05
            r18 = r0
            androidx.fragment.app.Fragment r15 = r9.A04
            X.FBg r6 = r9.A06
            X.Euz r5 = new X.Euz
            r5.<init>(r9)
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x043c
            java.lang.String r0 = "-"
            java.lang.String[] r1 = r1.split(r0)
            int r3 = r1.length
            r0 = 3
            if (r3 < r0) goto L_0x043c
            r0 = 1
            r4 = r1[r0]
            r0 = 2
            r1 = r1[r0]
            X.EbY r3 = new X.EbY
            r3.<init>()
            X.SGw r0 = X.C11236SGw.A00(r4)
        L_0x03e3:
            r3.A00 = r0
            X.SGw r0 = X.C11236SGw.A00(r1)
            r3.A01 = r0
            r1 = 2131975386(0x7f135cda, float:1.9587863E38)
            X.SGw r0 = r3.A00
            java.lang.String r0 = X.C11236SGw.A01(r0)
            java.lang.String r0 = X.DbW.A0h(r7, r0, r1)
            r1 = 0
            X.Fmc r4 = new X.Fmc
            r4.<init>((android.content.Context) r7, (android.view.View.OnClickListener) r1, (java.lang.CharSequence) r0)
            r14 = 2131975389(0x7f135cdd, float:1.9587869E38)
            X.SGw r0 = r3.A01
            java.lang.String r0 = X.C11236SGw.A01(r0)
            java.lang.String r0 = X.DbW.A0h(r7, r0, r14)
            X.Fmc r14 = new X.Fmc
            r14.<init>((android.content.Context) r7, (android.view.View.OnClickListener) r1, (java.lang.CharSequence) r0)
            X.ESZ r0 = new X.ESZ
            r20 = r15
            r21 = r2
            r22 = r18
            r23 = r5
            r24 = r6
            r25 = r3
            r26 = r4
            r27 = r14
            r18 = r0
            r19 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r8.add(r0)
            java.lang.String r1 = r2.A03
            if (r1 == 0) goto L_0x02b3
            java.lang.String r0 = "1"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x02b3
        L_0x0438:
            r8.add(r4)
            goto L_0x046c
        L_0x043c:
            java.lang.String r0 = "21:00"
            java.lang.String r1 = "07:00"
            X.EbY r3 = new X.EbY
            r3.<init>()
            X.SGw r0 = X.C11236SGw.A00(r0)
            goto L_0x03e3
        L_0x044a:
            java.lang.String r0 = "navigation"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02b3
            java.lang.String r1 = r2.A01
            java.lang.String r0 = "email_and_sms"
            boolean r0 = r1.equals(r0)
            java.lang.String r4 = r2.A04
            if (r0 == 0) goto L_0x0471
            r0 = 31
            X.FP9 r2 = new X.FP9
            r2.<init>((java.lang.Object) r9, (int) r0)
            r1 = 0
            r0 = 0
            X.Oak r14 = new X.Oak
            r14.<init>((android.view.View.OnClickListener) r2, (java.lang.CharSequence) r4, (java.lang.String) r0, (boolean) r1)
        L_0x046c:
            r8.add(r14)
            goto L_0x02b3
        L_0x0471:
            r0 = 63
            X.FPG r3 = new X.FPG
            r3.<init>((int) r0, (java.lang.Object) r9, (java.lang.Object) r2)
            r1 = 0
            r0 = 0
            X.Oak r2 = new X.Oak
            r2.<init>((android.view.View.OnClickListener) r3, (java.lang.CharSequence) r4, (java.lang.String) r0, (boolean) r1)
        L_0x047f:
            r8.add(r2)
            r12.add(r2)
            goto L_0x02b3
        L_0x0487:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r28)
            r9.A01(r0)
            java.lang.Object r0 = r11.A02
            X.Ev0 r0 = (X.C49398Ev0) r0
            X.EST r0 = r0.A00
            r0.setItems(r8)
            X.FBg r1 = r0.A01
            r0 = 1
            r1.A03(r0)
            r0 = 1637770249(0x619e6409, float:3.6522423E20)
            X.AnonymousClass0fD.A0A(r0, r13)
            r0 = 374266568(0x164edac8, float:1.6709583E-25)
        L_0x04a6:
            X.AnonymousClass0fD.A0A(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EQT.onSuccess(java.lang.Object):void");
    }
}
