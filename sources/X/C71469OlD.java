package X;

import android.widget.CompoundButton;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.OlD  reason: case insensitive filesystem */
public final class C71469OlD implements CompoundButton.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;

    public C71469OlD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C67721Mta A00(C71469OlD olD) {
        return (C67721Mta) ((NIN) olD.A01).A03.getValue();
    }

    public static void A01(IgdsListCell igdsListCell, Object obj, int i) {
        igdsListCell.A0D(new C71469OlD(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v101, resolved type: X.PLe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v114, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v239, resolved type: X.PLe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v240, resolved type: X.PLe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v241, resolved type: X.PLf} */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0426, code lost:
        r5.A02(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0429, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0452, code lost:
        X.C48837Ekz.A00(r6, r5, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0455, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04b3, code lost:
        r3.invoke(r2, java.lang.Long.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04f3, code lost:
        r0 = java.lang.Boolean.valueOf(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x053b, code lost:
        r1.FIA(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x053e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b1, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b3, code lost:
        r1.setChecked(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        r1.E5T(r0, r10);
        r1.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01e7, code lost:
        r4 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e9, code lost:
        r3 = r4.getValue();
        r0 = (X.C61079JwH) r3;
        r2 = (java.util.List) r0.A00;
        r1 = r0.A02;
        X.AnonymousClass7TG.A1O(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0202, code lost:
        if (r4.AIY(r3, new X.C61079JwH(r5, r1, r2)) == false) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0204, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0243, code lost:
        r3 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0245, code lost:
        r2 = r3.getValue();
        r1 = (java.util.List) ((X.N4R) r2).A00;
        X.0qQ.A0B(r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x025d, code lost:
        if (r3.AIY(r2, new X.N4R(r4, r1)) == false) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x025f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02f9, code lost:
        r1.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02fc, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCheckedChanged(android.widget.CompoundButton r9, boolean r10) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x052d;
                case 1: goto L_0x0260;
                case 2: goto L_0x04f8;
                case 3: goto L_0x04e9;
                case 4: goto L_0x04c2;
                case 5: goto L_0x023b;
                case 6: goto L_0x0232;
                case 7: goto L_0x0229;
                case 8: goto L_0x0220;
                case 9: goto L_0x0217;
                case 10: goto L_0x020e;
                case 11: goto L_0x0205;
                case 12: goto L_0x01d7;
                case 13: goto L_0x01c6;
                case 14: goto L_0x01b5;
                case 15: goto L_0x04bb;
                case 16: goto L_0x04a7;
                case 17: goto L_0x049a;
                case 18: goto L_0x0473;
                case 19: goto L_0x0431;
                case 20: goto L_0x0406;
                case 21: goto L_0x034b;
                case 22: goto L_0x0155;
                case 23: goto L_0x010e;
                case 24: goto L_0x0322;
                case 25: goto L_0x02fd;
                case 26: goto L_0x00b8;
                case 27: goto L_0x0081;
                case 28: goto L_0x0050;
                case 29: goto L_0x02d0;
                case 30: goto L_0x0038;
                case 31: goto L_0x02b2;
                case 32: goto L_0x0288;
                case 33: goto L_0x0026;
                case 34: goto L_0x0025;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A01
            X.4mT r0 = (X.C273374mT) r0
            com.instagram.common.session.UserSession r0 = r0.getSession()
            X.OBq r1 = X.C70089Nx5.A00(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1.A00 = r0
            X.0xa r0 = r1.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "cutover_thread_deduplication"
        L_0x001f:
            r1.E5T(r0, r10)
            r1.apply()
        L_0x0025:
            return
        L_0x0026:
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.Object r0 = r8.A01
            X.PR9 r0 = (X.PR9) r0
            r0.A0D = r10
            android.widget.CompoundButton$OnCheckedChangeListener r0 = r0.A08
            if (r0 == 0) goto L_0x0025
            r0.onCheckedChanged(r9, r10)
            return
        L_0x0038:
            java.lang.Object r0 = r8.A01
            X.PMA r0 = (X.PMA) r0
            X.OA8 r0 = r0.A01
            X.NeX r0 = r0.A00
            com.instagram.common.session.UserSession r1 = r0.A02
            X.7Yq r0 = new X.7Yq
            r0.<init>(r1)
            X.0xa r0 = r0.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "creator_ai_embodiment_captions_enabled"
            goto L_0x001f
        L_0x0050:
            if (r10 == 0) goto L_0x0068
            java.lang.Object r0 = r8.A01
            X.NKA r0 = (X.NKA) r0
            X.0eM r0 = r0.A08
            java.lang.Object r2 = r0.getValue()
            X.NKq r2 = (X.C68497NKq) r2
            X.48q r1 = X.C2611948q.RELEVANT
            X.05G r0 = r2.A00
            r0.Epw(r1)
            X.C68497NKq.A00(r1, r2)
        L_0x0068:
            java.lang.Object r2 = r8.A01
            X.NKA r2 = (X.NKA) r2
            X.0eM r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            X.NKq r0 = (X.C68497NKq) r0
            X.0Ud r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            X.48q r0 = X.C2611948q.RELEVANT
            if (r1 != r0) goto L_0x0025
            com.instagram.igds.components.textcell.IgdsListCell r1 = r2.A05
            goto L_0x00b1
        L_0x0081:
            if (r10 == 0) goto L_0x0099
            java.lang.Object r0 = r8.A01
            X.NKA r0 = (X.NKA) r0
            X.0eM r0 = r0.A08
            java.lang.Object r2 = r0.getValue()
            X.NKq r2 = (X.C68497NKq) r2
            X.48q r1 = X.C2611948q.ALL
            X.05G r0 = r2.A00
            r0.Epw(r1)
            X.C68497NKq.A00(r1, r2)
        L_0x0099:
            java.lang.Object r2 = r8.A01
            X.NKA r2 = (X.NKA) r2
            X.0eM r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            X.NKq r0 = (X.C68497NKq) r0
            X.0Ud r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            X.48q r0 = X.C2611948q.ALL
            if (r1 != r0) goto L_0x0025
            com.instagram.igds.components.textcell.IgdsListCell r1 = r2.A03
        L_0x00b1:
            if (r1 == 0) goto L_0x0025
            r0 = 1
            r1.setChecked(r0)
            return
        L_0x00b8:
            java.lang.Object r2 = r8.A01
            X.OZO r2 = (X.OZO) r2
            X.7Zj r1 = r2.A05
            if (r10 == 0) goto L_0x010b
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x00c2:
            r1.Er5(r0)
            X.0eM r0 = r2.A06
            X.6gx r3 = X.DbZ.A0R(r0)
            X.2Er r0 = r2.A04
            java.lang.String r1 = r0.C6C()
            X.1Ln r2 = X.DbT.A0J(r3)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0025
            X.DbW.A17(r2, r3)
            java.lang.String r0 = "composer_xposting_manual_override_changed"
            r2.A0l(r0)
            java.lang.String r0 = "toggle"
            r2.A0k(r0)
            java.lang.String r0 = "xposting_composer_override_toggle"
            X.C66581MXm.A1J(r2, r0)
            java.lang.String r0 = "broadcast"
            r2.A0o(r0)
            r2.A0s(r1)
            java.lang.String r0 = r3.A01
            r2.A0v(r0)
            java.lang.String r1 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "is_enabled"
            java.util.Map r0 = X.AnonymousClass7TF.A0w(r0, r1)
            r2.A0w(r0)
            r2.Cgf()
            return
        L_0x010b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x00c2
        L_0x010e:
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.Object r2 = r8.A01
            X.P2s r2 = (X.C72353P2s) r2
            X.3sy r1 = r2.A02
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L_0x0025
            java.lang.String r3 = X.C66647MaG.A09(r1)
            if (r3 == 0) goto L_0x0025
            if (r10 != 0) goto L_0x0542
            X.OLT r0 = r2.A03
            if (r0 == 0) goto L_0x0542
            java.util.List r0 = r0.A04
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            if (r0 == 0) goto L_0x0542
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0542
            android.content.Context r0 = r2.A00
            X.8ab r1 = X.DbS.A0Y(r0)
            r0 = 2131958579(0x7f131b33, float:1.9553774E38)
            r1.A09(r0)
            r0 = 2131958578(0x7f131b32, float:1.9553772E38)
            r1.A08(r0)
            X.Ofg r0 = X.C71215Ofg.A00
            r1.A0E(r0)
            r0 = 4
            X.C71250OgH.A00(r1, r9, r0)
            X.DbT.A1V(r1)
            return
        L_0x0155:
            java.lang.Object r3 = r8.A01
            X.P2d r3 = (X.C72338P2d) r3
            X.N4P r2 = r3.A02
            int r1 = r2.A09
            r0 = 29
            if (r1 != r0) goto L_0x019c
            com.instagram.common.session.UserSession r0 = r3.A01
            X.6gx r5 = X.C313746gw.A00(r0)
            java.lang.String r4 = X.N4P.A03(r2)
            java.lang.String r2 = r2.A0Q
            X.1Ln r1 = X.DbT.A0J(r5)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x019c
            X.DbW.A17(r1, r5)
            if (r10 == 0) goto L_0x01b2
            java.lang.String r0 = "mute_reactions_enabled"
        L_0x017e:
            r1.A0l(r0)
            java.lang.String r0 = "toggle"
            r1.A0k(r0)
            java.lang.String r0 = "mute_reactions_toggle"
            r1.A0p(r0)
            java.lang.String r0 = "mute_notifications"
            r1.A0q(r0)
            java.lang.String r0 = "instagram"
            java.lang.Long r0 = X.C66583MXo.A0e(r1, r0, r4, r2)
            r1.A0i(r0)
            r1.Cgf()
        L_0x019c:
            X.3sy r1 = r3.A03
            boolean r0 = X.C66647MaG.A0F(r1)
            if (r0 == 0) goto L_0x0025
            java.lang.String r2 = X.C66647MaG.A09(r1)
            if (r2 == 0) goto L_0x0025
            com.instagram.common.session.UserSession r1 = r3.A01
            X.0iw r0 = r3.A00
            X.C66671Mae.A05(r0, r1, r2, r10)
            return
        L_0x01b2:
            java.lang.String r0 = "mute_reactions_disabled"
            goto L_0x017e
        L_0x01b5:
            if (r10 == 0) goto L_0x0025
            java.lang.Object r0 = r8.A01
            X.NIO r0 = (X.NIO) r0
            X.0eM r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.Mtb r0 = (X.C67722Mtb) r0
            X.NkD r5 = X.C69373NkD.CUSTOM
            goto L_0x01e7
        L_0x01c6:
            if (r10 == 0) goto L_0x0025
            java.lang.Object r0 = r8.A01
            X.NIO r0 = (X.NIO) r0
            X.0eM r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.Mtb r0 = (X.C67722Mtb) r0
            X.NkD r5 = X.C69373NkD.MESSAGE
            goto L_0x01e7
        L_0x01d7:
            if (r10 == 0) goto L_0x0025
            java.lang.Object r0 = r8.A01
            X.NIO r0 = (X.NIO) r0
            X.0eM r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.Mtb r0 = (X.C67722Mtb) r0
            X.NkD r5 = X.C69373NkD.SHOUTOUT
        L_0x01e7:
            X.05G r4 = r0.A00
        L_0x01e9:
            java.lang.Object r3 = r4.getValue()
            r0 = r3
            X.JwH r0 = (X.C61079JwH) r0
            java.lang.Object r2 = r0.A00
            java.util.List r2 = (java.util.List) r2
            java.lang.String r1 = r0.A02
            X.AnonymousClass7TG.A1O(r2, r1)
            X.JwH r0 = new X.JwH
            r0.<init>((X.C69373NkD) r5, (java.lang.String) r1, (java.util.List) r2)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x01e9
            return
        L_0x0205:
            if (r10 == 0) goto L_0x0025
            X.Mta r0 = A00(r8)
            X.Nk9 r4 = X.C69369Nk9.ONE_HOUR
            goto L_0x0243
        L_0x020e:
            if (r10 == 0) goto L_0x0025
            X.Mta r0 = A00(r8)
            X.Nk9 r4 = X.C69369Nk9.FIVE_MIN
            goto L_0x0243
        L_0x0217:
            if (r10 == 0) goto L_0x0025
            X.Mta r0 = A00(r8)
            X.Nk9 r4 = X.C69369Nk9.ONE_MIN
            goto L_0x0243
        L_0x0220:
            if (r10 == 0) goto L_0x0025
            X.Mta r0 = A00(r8)
            X.Nk9 r4 = X.C69369Nk9.SEVEN_DAYS
            goto L_0x0243
        L_0x0229:
            if (r10 == 0) goto L_0x0025
            X.Mta r0 = A00(r8)
            X.Nk9 r4 = X.C69369Nk9.FIVE_DAYS
            goto L_0x0243
        L_0x0232:
            if (r10 == 0) goto L_0x0025
            X.Mta r0 = A00(r8)
            X.Nk9 r4 = X.C69369Nk9.THREE_DAYS
            goto L_0x0243
        L_0x023b:
            if (r10 == 0) goto L_0x0025
            X.Mta r0 = A00(r8)
            X.Nk9 r4 = X.C69369Nk9.ONE_DAY
        L_0x0243:
            X.05G r3 = r0.A00
        L_0x0245:
            java.lang.Object r2 = r3.getValue()
            r0 = r2
            X.N4R r0 = (X.N4R) r0
            java.lang.Object r1 = r0.A00
            java.util.List r1 = (java.util.List) r1
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.N4R r0 = new X.N4R
            r0.<init>((X.C69369Nk9) r4, (java.util.List) r1)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x0245
            return
        L_0x0260:
            java.lang.Object r0 = r8.A01
            X.NgT r0 = (X.C69180NgT) r0
            X.Mu9 r2 = X.C66583MXo.A0S(r0)
            X.05G r1 = r2.A0C
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r1.FIA(r0)
            com.instagram.common.session.UserSession r0 = r2.A05
            X.MoD r1 = new X.MoD
            r1.<init>(r0)
            boolean r0 = X.C67458MoD.A04(r1)
            if (r0 == 0) goto L_0x0025
            X.0xa r0 = r1.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "EB_SHOW_DEBUG_TOASTS"
            goto L_0x001f
        L_0x0288:
            java.lang.Object r0 = r8.A01
            X.PMA r0 = (X.PMA) r0
            X.OA8 r0 = r0.A01
            X.NeX r3 = r0.A00
            X.1Av r0 = r3.A03
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "in_call_settings_noise_suppression"
            r1.E5T(r0, r10)
            r1.apply()
            X.OKY r2 = r3.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.PK8 r0 = new X.PK8
            r0.<init>(r1, r10)
            r2.A00(r0)
            X.Ocu r1 = r3.A05
            X.PLf r0 = new X.PLf
            r0.<init>(r10)
            goto L_0x02f9
        L_0x02b2:
            java.lang.Object r0 = r8.A01
            X.PMA r0 = (X.PMA) r0
            X.OA8 r0 = r0.A01
            X.NeX r2 = r0.A00
            X.1Av r0 = r2.A03
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "in_call_settings_hd_video"
            r1.E5T(r0, r10)
            r1.apply()
            X.Ocu r1 = r2.A05
            X.PLQ r0 = new X.PLQ
            r0.<init>()
            goto L_0x02f9
        L_0x02d0:
            java.lang.Object r0 = r8.A01
            X.PMA r0 = (X.PMA) r0
            X.OA8 r0 = r0.A01
            X.NeX r3 = r0.A00
            X.1Av r0 = r3.A03
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "in_call_settings_audio_touch_up"
            r1.E5T(r0, r10)
            r1.apply()
            X.OKY r2 = r3.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.PK8 r0 = new X.PK8
            r0.<init>(r1, r10)
            r2.A00(r0)
            X.Ocu r1 = r3.A05
            X.PLe r0 = new X.PLe
            r0.<init>(r10)
        L_0x02f9:
            r1.A03(r0)
            return
        L_0x02fd:
            java.lang.Object r3 = r8.A01
            X.P2r r3 = (X.C72352P2r) r3
            X.Pv4 r0 = r3.A01
            X.7ZA r2 = r0.C62()
            X.N4P r0 = r3.A02
            X.3t3 r1 = r0.A0L
            r0 = 0
            r2.FHN(r1, r10, r0, r0)
            X.0wc r1 = r3.A00
            java.lang.String r0 = "direct_shh_mode_toggle_click"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            if (r10 == 0) goto L_0x031f
            java.lang.String r0 = "on"
        L_0x031b:
            X.DbV.A1G(r1, r0)
            return
        L_0x031f:
            java.lang.String r0 = "off"
            goto L_0x031b
        L_0x0322:
            java.lang.Object r0 = r8.A01
            X.P2O r0 = (X.P2O) r0
            com.instagram.common.session.UserSession r5 = r0.A00
            X.N4P r0 = r0.A01
            X.3t3 r0 = r0.A0L
            X.3t0 r1 = X.C300965yF.A01(r0)
            r4 = r10 ^ 1
            r3 = 1
            java.lang.Class<X.1mz> r0 = X.C66431mz.class
            X.MaY r2 = X.C66669Mac.A08(r5, r0)
            java.lang.String r1 = r1.A00
            X.AnonymousClass7TF.A1B(r2, r3, r1)
            X.1mz r0 = new X.1mz
            r0.<init>(r2)
            r0.A00 = r1
            r0.A01 = r4
            X.C66580MXl.A1P(r5, r0)
            return
        L_0x034b:
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.Object r3 = r8.A01
            X.P2n r3 = (X.C72348P2n) r3
            X.N4P r4 = r3.A05
            int r6 = r4.A09
            r0 = 29
            if (r6 == r0) goto L_0x039c
            r0 = 32
            if (r6 == r0) goto L_0x0381
            r0 = 62
            if (r6 == r0) goto L_0x0381
        L_0x0363:
            if (r10 == 0) goto L_0x03f3
            r0 = 29
            if (r6 == r0) goto L_0x03e5
            X.3sy r0 = r4.A08()
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A04(r0)
            if (r0 == 0) goto L_0x03e5
            android.content.Context r6 = r3.A00
            com.instagram.common.session.UserSession r5 = r3.A03
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r1 = 1
            X.P3L r0 = new X.P3L
            r0.<init>(r1, r9, r3)
            goto L_0x0452
        L_0x0381:
            com.instagram.common.session.UserSession r0 = r3.A03
            X.FYv r1 = X.C69866NtU.A00(r0)
            java.lang.String r7 = X.N4P.A03(r4)
            java.lang.String r5 = r4.A0Q
            X.0wc r0 = r1.A02
            X.1Ln r2 = X.1Ln.A0F(r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0363
            long r0 = r1.A01
            goto L_0x03b4
        L_0x039c:
            com.instagram.common.session.UserSession r0 = r3.A03
            X.6gx r1 = X.C313746gw.A00(r0)
            java.lang.String r7 = X.N4P.A03(r4)
            java.lang.String r5 = r4.A0Q
            X.1Ln r2 = X.DbT.A0J(r1)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0363
            long r0 = r1.A02
        L_0x03b4:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0h(r0)
            if (r10 == 0) goto L_0x03de
            java.lang.String r0 = "mute_messages_enabled"
        L_0x03bf:
            r2.A0l(r0)
            java.lang.String r0 = "toggle"
            r2.A0k(r0)
            java.lang.String r0 = "mute_message_toggle"
            r2.A0p(r0)
            java.lang.String r0 = "mute_notifications"
            r2.A0q(r0)
            java.lang.String r0 = "instagram"
            java.lang.Long r0 = X.C66583MXo.A0e(r2, r0, r7, r5)
            r2.A0i(r0)
            r2.Cgf()
            goto L_0x0363
        L_0x03de:
            r0 = 3048(0xbe8, float:4.271E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            goto L_0x03bf
        L_0x03e5:
            X.Pv4 r0 = r3.A04
            X.7ZA r2 = r0.C62()
            X.3t3 r1 = r4.A0L
            X.0iw r0 = r3.A01
            r2.Cp4(r0, r1)
            return
        L_0x03f3:
            X.1a8 r5 = r3.A02
            X.Pv4 r0 = r3.A04
            X.7ZA r2 = r0.C62()
            X.3t3 r1 = r4.A0L
            X.0iw r0 = r3.A01
            X.1aU r1 = r2.FIn(r0, r1)
            X.PTF r0 = X.PTF.A00
            goto L_0x0426
        L_0x0406:
            java.lang.Object r4 = r8.A01
            X.P2m r4 = (X.C72347P2m) r4
            X.1a8 r5 = r4.A01
            X.Pv4 r0 = r4.A02
            X.7ZA r3 = r0.C62()
            X.N4P r0 = r4.A03
            X.3t3 r2 = r0.A0L
            boolean r1 = r0.A0D()
            X.0iw r0 = r4.A00
            if (r10 == 0) goto L_0x042a
            X.1aU r1 = r3.Cow(r0, r2, r1)
            X.PTD r0 = X.PTD.A00
        L_0x0424:
            X.1aV r0 = (X.1aV) r0
        L_0x0426:
            r5.A02(r1, r0)
            return
        L_0x042a:
            X.1aU r1 = r3.FIi(r0, r2, r1)
            X.PTE r0 = X.PTE.A00
            goto L_0x0424
        L_0x0431:
            r1 = 0
            X.0qQ.A0B(r9, r1)
            java.lang.Object r4 = r8.A01
            X.P2l r4 = (X.C72346P2l) r4
            if (r10 == 0) goto L_0x0465
            X.N4P r0 = r4.A04
            X.3sy r0 = r0.A08()
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A04(r0)
            if (r0 == 0) goto L_0x0456
            android.content.Context r6 = r4.A00
            com.instagram.common.session.UserSession r5 = r4.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.P3L r0 = new X.P3L
            r0.<init>(r1, r9, r4)
        L_0x0452:
            X.C48837Ekz.A00(r6, r5, r0, r2)
            return
        L_0x0456:
            X.Pv4 r0 = r4.A03
            X.7ZA r3 = r0.C62()
            X.3sy r2 = r4.A05
            r1 = -1
            X.0iw r0 = r4.A01
            r3.Cou(r0, r2, r1)
            return
        L_0x0465:
            X.Pv4 r0 = r4.A03
            X.7ZA r2 = r0.C62()
            X.3sy r1 = r4.A05
            X.0iw r0 = r4.A01
            r2.FIg(r0, r1)
            return
        L_0x0473:
            java.lang.Object r0 = r8.A01
            X.P2c r0 = (X.C72337P2c) r0
            com.instagram.common.session.UserSession r4 = r0.A00
            X.N4P r0 = r0.A01
            X.3t3 r0 = r0.A0L
            X.3t0 r1 = X.C300965yF.A01(r0)
            r3 = 1
            java.lang.Class<X.1n7> r0 = X.AnonymousClass1n7.class
            X.MaY r2 = X.C66669Mac.A08(r4, r0)
            java.lang.String r1 = r1.A00
            X.AnonymousClass7TF.A1B(r2, r3, r1)
            X.1n7 r0 = new X.1n7
            r0.<init>(r2)
            r0.A01 = r1
            r0.A00 = r10
            X.C66580MXl.A1P(r4, r0)
            return
        L_0x049a:
            java.lang.Object r0 = r8.A01
            X.P2y r0 = (X.C72359P2y) r0
            X.0sL r3 = r0.A0E
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            r0 = 1
            goto L_0x04b3
        L_0x04a7:
            java.lang.Object r0 = r8.A01
            X.P2y r0 = (X.C72359P2y) r0
            X.0sL r3 = r0.A0E
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            long r0 = X.C242373Tu.A07
        L_0x04b3:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.invoke(r2, r0)
            return
        L_0x04bb:
            java.lang.Object r0 = r8.A01
            X.N5m r0 = (X.C68197N5m) r0
            r0.A01 = r10
            return
        L_0x04c2:
            java.lang.Object r0 = r8.A01
            X.Nga r0 = (X.C69184Nga) r0
            X.MuD r2 = X.C69184Nga.A07(r0)
            X.0eM r0 = r2.A0A
            java.lang.Object r1 = r0.getValue()
            X.MoD r1 = (X.C67458MoD) r1
            boolean r0 = X.C67458MoD.A04(r1)
            if (r0 == 0) goto L_0x04e6
            X.0xa r0 = r1.A00
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "EB_SHOULD_OVERRIDE_CUTOVER_TIMESTAMP"
            r1.E5T(r0, r10)
            r1.apply()
        L_0x04e6:
            X.05G r1 = r2.A0N
            goto L_0x04f3
        L_0x04e9:
            java.lang.Object r0 = r8.A01
            X.Nga r0 = (X.C69184Nga) r0
            X.MuD r0 = X.C69184Nga.A07(r0)
            X.05G r1 = r0.A0O
        L_0x04f3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            goto L_0x053b
        L_0x04f8:
            java.lang.Object r0 = r8.A01
            X.Nga r0 = (X.C69184Nga) r0
            X.MuD r5 = X.C69184Nga.A07(r0)
            if (r10 == 0) goto L_0x0511
            X.OHi r3 = r5.A04
            X.1a8 r2 = r5.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            X.P0p r0 = new X.P0p
            r0.<init>(r5)
            X.C69889Ntr.A00(r2, r3, r0, r1)
            return
        L_0x0511:
            X.1a8 r4 = r5.A02
            X.OHi r3 = r5.A04
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.1aU r2 = r3.A02
            r0 = 27
            X.PqZ r1 = new X.PqZ
            r1.<init>(r3, r0)
            r0 = 1
            X.1aU r1 = X.C72168Oxd.A00(r2, r4, r1, r0)
            r0 = 13
            X.PU8.A00(r1, r4, r5, r0)
            return
        L_0x052d:
            java.lang.Object r0 = r8.A01
            X.NgT r0 = (X.C69180NgT) r0
            X.Mu9 r0 = X.C66583MXo.A0S(r0)
            X.05G r1 = r0.A0D
            if (r10 == 0) goto L_0x053f
            X.NiX r0 = X.C69271NiX.BOTTOM_SHEET
        L_0x053b:
            r1.FIA(r0)
            return
        L_0x053f:
            X.NiX r0 = X.C69271NiX.FULLSCREEN_MODAL
            goto L_0x053b
        L_0x0542:
            com.instagram.common.session.UserSession r1 = r2.A01
            X.1Ou r2 = X.1Ou.A01(r1)
            java.lang.Class<X.1hN> r0 = X.C65861hN.class
            X.MaY r1 = X.C66669Mac.A08(r1, r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.1hN r0 = new X.1hN
            r0.<init>(r1)
            r0.A00 = r3
            r0.A01 = r10
            r2.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71469OlD.onCheckedChanged(android.widget.CompoundButton, boolean):void");
    }
}
