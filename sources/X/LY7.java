package X;

import android.view.View;
import com.instagram.igds.components.button.IgdsButton;

public final class LY7 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LY7(IgdsButton igdsButton, C62041KXd kXd, int i) {
        this.A00 = i;
        if (33 - i != 0) {
            this.A01 = igdsButton;
            this.A02 = kXd;
        } else {
            this.A02 = kXd;
            this.A01 = igdsButton;
        }
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new LY7(i, obj, obj2), view);
    }

    /* JADX WARNING: type inference failed for: r5v17, types: [X.07Z, java.lang.Object, X.KXd] */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0832, code lost:
        if (r12 == com.instagram.api.schemas.MediaPromptPrefType.A04) goto L_0x0834;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x083c, code lost:
        if (r10 == com.instagram.api.schemas.MediaPromptPrefType.A04) goto L_0x083e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x086c, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbT.A0X(r7.A0H), 36319939967524664L) != false) goto L_0x086e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x09ff, code lost:
        if (X.0qQ.A0K(r7.A08, r10) != false) goto L_0x0a01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0a29, code lost:
        if (r1.A01.isEmpty() == false) goto L_0x0a2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0a40, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0a43, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0ce2, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0ce9, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0d5d, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0d60, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x104d, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x1050, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            r3 = r19
            switch(r0) {
                case 0: goto L_0x1032;
                case 1: goto L_0x1020;
                case 2: goto L_0x0fd9;
                case 3: goto L_0x0fc0;
                case 4: goto L_0x0fa9;
                case 5: goto L_0x0f90;
                case 6: goto L_0x0f77;
                case 7: goto L_0x0f5c;
                case 8: goto L_0x0f28;
                case 9: goto L_0x0f07;
                case 10: goto L_0x0ed8;
                case 11: goto L_0x0ea7;
                case 12: goto L_0x0e76;
                case 13: goto L_0x04a8;
                case 14: goto L_0x0c68;
                case 15: goto L_0x046d;
                case 16: goto L_0x0cc7;
                case 17: goto L_0x0bca;
                case 18: goto L_0x0452;
                case 19: goto L_0x0b8d;
                case 20: goto L_0x0aff;
                case 21: goto L_0x0435;
                case 22: goto L_0x0418;
                case 23: goto L_0x03f9;
                case 24: goto L_0x03da;
                case 25: goto L_0x03b8;
                case 26: goto L_0x0398;
                case 27: goto L_0x037d;
                case 28: goto L_0x0362;
                case 29: goto L_0x0347;
                case 30: goto L_0x032c;
                case 31: goto L_0x0ac5;
                case 32: goto L_0x0312;
                case 33: goto L_0x0a84;
                case 34: goto L_0x09c9;
                case 35: goto L_0x098c;
                case 36: goto L_0x0933;
                case 37: goto L_0x0907;
                case 38: goto L_0x02ee;
                case 39: goto L_0x02a8;
                case 40: goto L_0x028f;
                case 41: goto L_0x080d;
                case 42: goto L_0x0276;
                case 43: goto L_0x07e5;
                case 44: goto L_0x025e;
                case 45: goto L_0x07be;
                case 46: goto L_0x0797;
                case 47: goto L_0x075c;
                case 48: goto L_0x0240;
                case 49: goto L_0x021e;
                case 50: goto L_0x01fc;
                case 51: goto L_0x01e5;
                case 52: goto L_0x01cb;
                case 53: goto L_0x0734;
                case 54: goto L_0x01b4;
                case 55: goto L_0x0176;
                case 56: goto L_0x06e7;
                case 57: goto L_0x0154;
                case 58: goto L_0x0137;
                case 59: goto L_0x0120;
                case 60: goto L_0x067d;
                case 61: goto L_0x0630;
                case 62: goto L_0x0534;
                case 63: goto L_0x00e4;
                case 64: goto L_0x00bf;
                case 65: goto L_0x0098;
                case 66: goto L_0x0082;
                case 67: goto L_0x04c3;
                case 68: goto L_0x005b;
                case 69: goto L_0x0032;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 981821784(0x3a856958, float:0.001017849)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.Jip r4 = X.C64083LMb.A00(r0)
            java.lang.Object r0 = r1.A01
            X.Ko3 r0 = (X.C62889Ko3) r0
            X.Kdy r0 = (X.C62326Kdy) r0
            boolean r3 = r0.A04
            X.6oS r2 = X.C318116oQ.A00(r4)
            r1 = 0
            X.JTY r0 = new X.JTY
            r0.<init>(r4, r1, r3)
            X.AnonymousClass7TE.A1Z(r0, r2)
            r0 = -954468915(0xffffffffc71bf5cd, float:-39925.8)
        L_0x002e:
            X.AnonymousClass0fD.A0C(r0, r5)
        L_0x0031:
            return
        L_0x0032:
            r0 = -522361248(0xffffffffe0dd6660, float:-1.2762835E20)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.Jip r6 = X.C64083LMb.A00(r0)
            java.lang.Object r0 = r1.A01
            X.Ko3 r0 = (X.C62889Ko3) r0
            X.Kdy r0 = (X.C62326Kdy) r0
            boolean r0 = r0.A08
            r4 = r0 ^ 1
            X.6oS r3 = X.C318116oQ.A00(r6)
            r2 = 0
            r1 = 7
            X.MGK r0 = new X.MGK
            r0.<init>(r6, r2, r1, r4)
            X.AnonymousClass7TE.A1Z(r0, r3)
            r0 = 99884860(0x5f41f3c, float:2.2957123E-35)
            goto L_0x002e
        L_0x005b:
            r0 = 114634693(0x6d52fc5, float:8.0191886E-35)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.Jip r6 = X.C64083LMb.A00(r0)
            java.lang.Object r0 = r1.A01
            X.Ko3 r0 = (X.C62889Ko3) r0
            X.Kdy r0 = (X.C62326Kdy) r0
            boolean r4 = r0.A06
            X.6oS r3 = X.C318116oQ.A00(r6)
            r2 = 0
            r1 = 6
            X.MGK r0 = new X.MGK
            r0.<init>(r6, r2, r1, r4)
            X.AnonymousClass7TE.A1Z(r0, r3)
            r0 = -509386370(0xffffffffe1a3617e, float:-3.7673054E20)
            goto L_0x002e
        L_0x0082:
            r0 = -664591189(0xffffffffd86324ab, float:-9.9898651E14)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.MVX r2 = (X.MVX) r2
            java.lang.Object r0 = r1.A01
            X.M0V r0 = (X.M0V) r0
            r2.DXE(r0)
            r0 = 1134080060(0x4398b03c, float:305.37683)
            goto L_0x002e
        L_0x0098:
            r0 = -2090002821(0xffffffff836d167b, float:-6.9673847E-37)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.L2v r2 = (X.C63685L2v) r2
            java.lang.Object r0 = r1.A02
            X.Lhm r0 = (X.C64770Lhm) r0
            com.instagram.user.model.UpcomingEvent r3 = r0.A00
            X.K43 r0 = r2.A00
            X.0eM r0 = r0.A02
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 35
            X.C66169MGg.A01(r3, r2, r1, r0)
            r0 = 470399397(0x1c09b9a5, float:4.556944E-22)
            goto L_0x002e
        L_0x00bf:
            r0 = 1497657324(0x59446fec, float:3.45575968E15)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.L2v r4 = (X.C63685L2v) r4
            java.lang.Object r0 = r1.A02
            X.Lhm r0 = (X.C64770Lhm) r0
            com.instagram.user.model.UpcomingEvent r3 = r0.A00
            r2 = 0
            X.K43 r0 = r4.A00
            X.0eM r0 = r0.A01
            java.lang.Object r1 = r0.getValue()
            X.LDK r1 = (X.LDK) r1
            r0 = 1
            r1.A00(r3, r0, r2)
            r0 = -1528629897(0xffffffffa4e2f577, float:-9.842771E-17)
            goto L_0x002e
        L_0x00e4:
            r0 = -1892515577(0xffffffff8f328107, float:-8.800927E-30)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            java.lang.Object r0 = r1.A02
            X.WSh r0 = (X.C19274WSh) r0
            long r3 = r0.A02
            android.content.Context r1 = r6.requireContext()
            r0 = 1
            X.LUJ r2 = new X.LUJ
            r2.<init>(r6, r3, r0)
            X.8ab r1 = X.DbS.A0Y(r1)
            r0 = 2131965297(0x7f133571, float:1.95674E38)
            r1.A09(r0)
            r0 = 2131965296(0x7f133570, float:1.9567398E38)
            r1.A08(r0)
            r0 = 2131965295(0x7f13356f, float:1.9567396E38)
            r1.A0I(r2, r0)
            r1.A05()
            X.DbT.A1V(r1)
            r0 = -1691339756(0xffffffff9b303414, float:-1.4575206E-22)
            goto L_0x002e
        L_0x0120:
            r0 = -464970472(0xffffffffe4491d18, float:-1.4839568E22)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.LQf r2 = (X.C64143LQf) r2
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.UpcomingEvent r0 = (com.instagram.user.model.UpcomingEvent) r0
            X.C64143LQf.A00(r2, r0)
            r0 = -968128576(0xffffffffc64b87c0, float:-13025.9375)
            goto L_0x002e
        L_0x0137:
            r0 = -220829443(0xfffffffff2d668fd, float:-8.4936595E30)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.LQf r2 = (X.C64143LQf) r2
            java.lang.Object r1 = r1.A01
            com.instagram.user.model.UpcomingEvent r1 = (com.instagram.user.model.UpcomingEvent) r1
            X.MVf r0 = r2.A04
            r0.DvG()
            r0 = 0
            X.C64143LQf.A01(r2, r1, r0)
            r0 = -171814687(0xfffffffff5c250e1, float:-4.926494E32)
            goto L_0x002e
        L_0x0154:
            r0 = -1505674907(0xffffffffa6413965, float:-6.703811E-16)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.LQf r3 = (X.C64143LQf) r3
            com.instagram.common.session.UserSession r0 = r3.A03
            X.27r r2 = X.27p.A01(r0)
            X.80P r0 = X.AnonymousClass80P.ADD_UPCOMING_EVENT
            r2.A1X(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.UpcomingEvent r0 = (com.instagram.user.model.UpcomingEvent) r0
            X.C64143LQf.A00(r3, r0)
            r0 = -163376769(0xfffffffff643117f, float:-9.89114E32)
            goto L_0x002e
        L_0x0176:
            r0 = 244717932(0xe96196c, float:3.7002335E-30)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r2 = r0.getContext()
            X.8ab r4 = X.DbS.A0Y(r2)
            r0 = 2131957595(0x7f13175b, float:1.9551778E38)
            r4.A09(r0)
            r0 = 2131957594(0x7f13175a, float:1.9551776E38)
            r4.A08(r0)
            r0 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r2, r0)
            java.lang.Object r1 = r1.A02
            r0 = 45
            X.LV2 r2 = X.LV2.A00(r1, r0)
            X.8ae r1 = X.C358278ae.RED_BOLD
            r0 = 1
            r4.A0Y(r2, r1, r3, r0)
            X.LUx r0 = X.C64233LUx.A00
            X.DbX.A16(r0, r4)
            r0 = -1736190815(0xffffffff9883d4a1, float:-3.4077407E-24)
            goto L_0x002e
        L_0x01b4:
            r0 = -750008162(0xffffffffd34bc89e, float:-8.7524416E11)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.Jlf r2 = (X.C60447Jlf) r2
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.UpcomingEvent r0 = (com.instagram.user.model.UpcomingEvent) r0
            X.C60447Jlf.A00(r2, r2, r0)
            r0 = -1630158101(0xffffffff9ed5c2eb, float:-2.2632868E-20)
            goto L_0x002e
        L_0x01cb:
            r0 = 1385752418(0x5298e762, float:3.28358494E11)
            int r5 = X.DbX.A03(r3, r0)
            java.lang.Object r0 = r1.A02
            X.LGD r0 = (X.LGD) r0
            r0.A00()
            java.lang.Object r0 = r1.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r3)
            r0 = 1715110873(0x663a83d9, float:2.2019808E23)
            goto L_0x002e
        L_0x01e5:
            r0 = 292448867(0x116e6a63, float:1.8807672E-28)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.MSw r2 = (X.C66468MSw) r2
            java.lang.Object r0 = r1.A02
            com.instagram.user.model.ProductCollection r0 = (com.instagram.user.model.ProductCollection) r0
            r2.D88(r0)
            r0 = -1739229763(0xffffffff985575bd, float:-2.7589047E-24)
            goto L_0x002e
        L_0x01fc:
            r0 = -1090816803(0xffffffffbefb74dd, float:-0.49112597)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.Mty r0 = (X.C67745Mty) r0
            X.L5C r0 = r0.A03
            java.lang.Object r3 = r1.A01
            X.3uh r3 = (X.C255773uh) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.0V2 r1 = r0.A00
            X.Jzg r0 = new X.Jzg
            r0.<init>(r3, r2)
            r1.FIA(r0)
            r0 = -1924734130(0xffffffff8d46e34e, float:-6.128707E-31)
            goto L_0x002e
        L_0x021e:
            r0 = -2024423397(0xffffffff8755c01b, float:-1.6080794E-34)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.Mty r0 = (X.C67745Mty) r0
            X.L5C r0 = r0.A03
            java.lang.Object r3 = r1.A01
            X.3uh r3 = (X.C255773uh) r3
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.0V2 r1 = r0.A00
            X.Jzh r0 = new X.Jzh
            r0.<init>(r3, r2)
            r1.FIA(r0)
            r0 = -1324719430(0xffffffffb10a62ba, float:-2.0137763E-9)
            goto L_0x002e
        L_0x0240:
            r0 = -253662049(0xfffffffff0e16c9f, float:-5.5812354E29)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.LDY r0 = (X.LDY) r0
            X.Vj5 r0 = r0.A00
            r0.A00()
            java.lang.Object r0 = r1.A01
            X.L76 r0 = (X.L76) r0
            X.0sa r0 = r0.A00
            r0.invoke()
            r0 = -1143668889(0xffffffffbbd4ff67, float:-0.006500173)
            goto L_0x002e
        L_0x025e:
            r0 = 651776942(0x26d953ae, float:1.5080081E-15)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.Lwp r0 = (X.C65614Lwp) r0
            r0.A00()
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = -1209371470(0xffffffffb7ea74b2, float:-2.7949314E-5)
            goto L_0x002e
        L_0x0276:
            r0 = -1573999907(0xffffffffa22eaadd, float:-2.3671852E-18)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.6ms r2 = (X.C317196ms) r2
            java.lang.Object r0 = r1.A02
            X.3mM r0 = (X.C250973mM) r0
            com.instagram.model.reels.Reel r0 = r0.A0H
            r2.DzL(r0)
            r0 = 984693395(0x3ab13a93, float:0.0013521485)
            goto L_0x002e
        L_0x028f:
            r0 = -2074700040(0xffffffff845696f8, float:-2.52249E-36)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.MU7 r2 = (X.MU7) r2
            java.lang.Object r0 = r1.A02
            java.lang.String r0 = X.DbS.A0q(r0)
            r2.DDf(r0)
            r0 = 1520708918(0x5aa42d36, float:2.31058031E16)
            goto L_0x002e
        L_0x02a8:
            r0 = 1422971301(0x54d0d1a5, float:7.1749636E12)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.L2G r4 = (X.L2G) r4
            java.lang.Object r0 = r1.A02
            X.MWQ r0 = (X.MWQ) r0
            X.JxV r0 = (X.C61119JxV) r0
            com.instagram.api.schemas.TrackData r1 = r0.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.clips.model.metadata.AudioPageMetadata r3 = X.LT9.A03(r1, r0)
            X.8ZN r2 = X.AnonymousClass8ZN.MUSIC_PICK_STICKER_AGGREGATION_ITEM
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            r0 = 0
            android.os.Bundle r6 = X.C250563lf.A02(r0, r2, r3, r1)
            X.K7b r4 = r4.A00
            X.0eM r0 = r4.A0G
            X.0lg r3 = X.DbT.A0X(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            java.lang.String r0 = "audio_page"
            X.6W8 r2 = X.Dba.A0K(r1, r6, r3, r2, r0)
            androidx.fragment.app.Fragment r1 = r4.mParentFragment
            r0 = 9688(0x25d8, float:1.3576E-41)
            r2.A0D(r1, r0)
            r0 = -346382310(0xffffffffeb5aa01a, float:-2.6430189E26)
            goto L_0x002e
        L_0x02ee:
            java.lang.Object r2 = r1.A01
            X.TzX r2 = (X.C14625TzX) r2
            java.lang.Object r1 = r1.A02
            X.3uh r1 = (X.C255773uh) r1
            X.4DH r0 = r2.A05
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            X.1Xj r3 = r1.A0b
            if (r3 == 0) goto L_0x0031
            X.1q7 r0 = X.C318996ps.A00()
            r0.A01()
            com.instagram.common.session.UserSession r2 = r2.A07
            r1 = 0
            r0 = 1
            X.0qQ.A0B(r2, r0)
            X.C49050EoU.A00(r4, r1, r2, r3)
            return
        L_0x0312:
            r0 = 1235490619(0x49a4173b, float:1344231.4)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r2 = r1.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.Ki3 r1 = X.Ki3.SELF_PROFILE
            r0 = 1
            X.JZV.A07(r3, r1, r2, r0)
            r0 = -1849337059(0xffffffff91c55b1d, float:-3.1137273E-28)
            goto L_0x002e
        L_0x032c:
            r0 = -688200147(0xffffffffd6fae62d, float:-1.37933252E14)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.KVF r2 = (X.KVF) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.MSe r2 = r2.A00
            java.lang.Object r0 = r1.A01
            com.instagram.music.common.model.MusicSearchPlaylist r0 = (com.instagram.music.common.model.MusicSearchPlaylist) r0
            r2.DXt(r0)
            r0 = 329060316(0x139d0fdc, float:3.964801E-27)
            goto L_0x002e
        L_0x0347:
            r0 = -1863313237(0xffffffff90f018ab, float:-9.4701316E-29)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.KVC r2 = (X.KVC) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.MSe r2 = r2.A03
            java.lang.Object r0 = r1.A01
            com.instagram.music.common.model.MusicSearchPlaylist r0 = (com.instagram.music.common.model.MusicSearchPlaylist) r0
            r2.DXt(r0)
            r0 = -1605144293(0xffffffffa053711b, float:-1.7909819E-19)
            goto L_0x002e
        L_0x0362:
            r0 = 1350676896(0x5081b1a0, float:1.74072136E10)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.KVE r2 = (X.KVE) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.MSd r2 = r2.A00
            java.lang.Object r0 = r1.A01
            X.JV7 r0 = (X.JV7) r0
            r2.DSI(r0)
            r0 = 401111369(0x17e87949, float:1.5023265E-24)
            goto L_0x002e
        L_0x037d:
            r0 = 1192944695(0x471ae437, float:39652.215)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.KVD r2 = (X.KVD) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.MSc r2 = r2.A00
            java.lang.Object r0 = r1.A01
            X.JV7 r0 = (X.JV7) r0
            r2.DHj(r0)
            r0 = -203595536(0xfffffffff3dd60f0, float:-3.507885E31)
            goto L_0x002e
        L_0x0398:
            r0 = 1751998996(0x686d6214, float:4.4840403E24)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.KUU r0 = (X.KUU) r0
            X.LrS r0 = r0.A01
            java.lang.Object r2 = r1.A01
            X.1Xj r2 = (X.1Xj) r2
            X.JjW r1 = r0.A02
            X.Ltq r0 = new X.Ltq
            r0.<init>(r2)
            X.C60327JjW.A02(r0, r1)
            r0 = 934390479(0x37b1aacf, float:2.1179583E-5)
            goto L_0x002e
        L_0x03b8:
            r0 = -1709519640(0xffffffff9a1acce8, float:-3.2011976E-23)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.K6i r0 = (X.C61411K6i) r0
            X.0eM r0 = r0.A0E
            X.JjW r2 = X.JTT.A0a(r0)
            java.lang.Object r1 = r1.A01
            X.1Xj r1 = (X.1Xj) r1
            X.Ltq r0 = new X.Ltq
            r0.<init>(r1)
            X.C60327JjW.A02(r0, r2)
            r0 = 1946114648(0x73ff5a58, float:4.0462283E31)
            goto L_0x002e
        L_0x03da:
            r0 = -947409560(0xffffffffc787ad68, float:-69466.81)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.JoU r2 = (X.C60621JoU) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.K5B r2 = r2.A02
            java.lang.Object r0 = r1.A01
            X.HBz r0 = (X.C54408HBz) r0
            X.LtQ r0 = r0.A00
            java.lang.String r0 = r0.A01
            r2.A01(r0)
            r0 = 926092397(0x37330c6d, float:1.06721245E-5)
            goto L_0x002e
        L_0x03f9:
            r0 = 1207648440(0x47fb40b8, float:128641.44)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.JoU r2 = (X.C60621JoU) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.K5B r2 = r2.A02
            java.lang.Object r0 = r1.A01
            X.HBz r0 = (X.C54408HBz) r0
            X.LtQ r0 = r0.A00
            java.lang.String r0 = r0.A01
            r2.A01(r0)
            r0 = -2072709507(0xffffffff8474f67d, float:-2.8795244E-36)
            goto L_0x002e
        L_0x0418:
            r0 = -851591574(0xffffffffcd3dbe6a, float:-1.989608E8)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.Jop r2 = (X.C60642Jop) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.K5B r2 = r2.A03
            java.lang.Object r0 = r1.A01
            X.LtR r0 = (X.C65443LtR) r0
            java.lang.String r0 = r0.A01
            r2.A01(r0)
            r0 = 269928867(0x1016c9a3, float:2.973762E-29)
            goto L_0x002e
        L_0x0435:
            r0 = 367411606(0x15e64196, float:9.2999737E-26)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.Jop r2 = (X.C60642Jop) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.K5B r2 = r2.A03
            java.lang.Object r0 = r1.A01
            X.LtR r0 = (X.C65443LtR) r0
            java.lang.String r0 = r0.A01
            r2.A01(r0)
            r0 = -206797435(0xfffffffff3ac8585, float:-2.7337132E31)
            goto L_0x002e
        L_0x0452:
            r0 = 870541797(0x33e369e5, float:1.0589773E-7)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.K6r r3 = (X.C61420K6r) r3
            X.0eM r0 = r3.A09
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r2 = X.JTO.A0k(r0)
            java.lang.Object r0 = r1.A01
            r2.A04(r3, r0)
            r0 = 541361015(0x20448377, float:1.6645344E-19)
            goto L_0x002e
        L_0x046d:
            r0 = -1919812248(0xffffffff8d91fd68, float:-8.99732E-31)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            X.8ab r3 = X.DbW.A0U(r4)
            r0 = 2131964056(0x7f133098, float:1.9564883E38)
            r3.A09(r0)
            r0 = 2131964055(0x7f133097, float:1.956488E38)
            r3.A08(r0)
            r2 = 2131964058(0x7f13309a, float:1.9564887E38)
            java.lang.Object r1 = r1.A01
            r0 = 44
            X.LV0 r0 = X.LV0.A00(r1, r4, r0)
            r3.A0K(r0, r2)
            r1 = 2131964054(0x7f133096, float:1.9564879E38)
            r0 = 0
            r3.A0H(r0, r1)
            r3.A04()
            X.DbT.A1V(r3)
            r0 = 1586966131(0x5e972e73, float:5.4468855E18)
            goto L_0x002e
        L_0x04a8:
            r0 = 1047677372(0x3e7249bc, float:0.2366094)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.MSU r2 = (X.MSU) r2
            java.lang.Object r0 = r1.A02
            X.Jml r0 = (X.C60514Jml) r0
            X.N49 r0 = r0.A01
            if (r0 == 0) goto L_0x1051
            r2.DgK(r0)
            r0 = -1197845111(0xffffffffb89a5589, float:-7.3592244E-5)
            goto L_0x002e
        L_0x04c3:
            r0 = -984937072(0xffffffffc54b0d90, float:-3248.8477)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            X.JpF r5 = (X.C60668JpF) r5
            java.lang.Object r7 = r1.A01
            X.0iw r7 = (X.AnonymousClass0iw) r7
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            java.lang.String r6 = r5.A00
            if (r6 == 0) goto L_0x04ed
            X.K7F r4 = r5.A01
            java.lang.String r3 = r4.A03
            if (r3 == 0) goto L_0x04ed
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.0eM r0 = r4.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1OC r0 = X.LTC.A04(r0, r1, r3, r6)
            r4.schedule(r0)
        L_0x04ed:
            X.0eM r0 = r5.A03
            android.view.View r3 = X.JTR.A0W(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            X.7fS r1 = X.C317486nL.A04
            java.lang.String r0 = "👋"
            com.instagram.common.typedurl.SimpleImageUrl r0 = r1.A04(r0)
            r3.setUrl(r0, r7)
            r1 = 26
            X.Lye r0 = new X.Lye
            r0.<init>((java.lang.Object) r3, (int) r1)
            X.C64179LSh.A02(r3, r0)
            X.0eM r0 = r5.A06
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.5nL r1 = X.JTP.A0c(r1, r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            X.5nL r0 = r1.A0B(r0)
            X.5nL r3 = r0.A0A()
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            r3.A0M(r1, r0)
            r0 = 8
            r3.A03 = r0
            r3.A0H()
            r0 = -189445426(0xfffffffff4b54ace, float:-1.1490759E32)
            goto L_0x104d
        L_0x0534:
            r0 = -1402143266(0xffffffffac6cfdde, float:-3.3678542E-12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.L2q r3 = (X.C63680L2q) r3
            if (r3 == 0) goto L_0x062b
            java.lang.Object r0 = r1.A02
            X.JyM r0 = (X.C61170JyM) r0
            X.4gL r5 = r0.A04
            int r0 = r0.A00
            r16 = r0
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.M0a r1 = r3.A00
            X.Kcv r0 = r1.A0A
            java.util.List r4 = r1.A0C
            r6 = 1
            X.0qQ.A0B(r4, r6)
            X.0eM r0 = r0.A07
            java.lang.Object r3 = r0.getValue()
            X.Jhe r3 = (X.C60221Jhe) r3
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = r3.A09
            X.JvD r1 = X.JTQ.A0Q(r0)
            if (r1 == 0) goto L_0x0616
            java.lang.String r8 = r3.A00
            if (r8 == 0) goto L_0x0616
            X.L5O r0 = r3.A07
            java.lang.String r14 = X.C61013JvD.A00(r1)
            java.lang.String r13 = r1.A08
            java.lang.String r10 = r1.A09
            int r15 = r4.size()
            java.lang.String r7 = "post_live"
            X.AnonymousClass7TF.A1B(r13, r6, r10)
            com.instagram.common.session.UserSession r9 = r0.A01
            X.0iw r11 = r0.A00
            X.0wc r1 = X.AnonymousClass0kN.A01(r11, r9)
            java.lang.String r0 = "ig_live_suggested_live_click"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = X.JTP.A0q(r5)
            r12 = 10
            long r0 = X.DbZ.A07(r0)
            X.JTQ.A0z(r6, r0)
            java.lang.String r0 = r5.A0e
            r0.getClass()
            X.C51965G9l.A1I(r6, r0)
            java.lang.String r0 = X.JTP.A0q(r5)
            java.lang.Long r1 = X.00y.A0n(r12, r0)
            java.lang.String r0 = "suggested_a_pk"
            r6.A9F(r0, r1)
            java.lang.String r1 = r5.A0e
            r1.getClass()
            java.lang.String r0 = "suggested_m_pk"
            r6.AAJ(r0, r1)
            X.C51969G9p.A1A(r6, r11)
            java.lang.Long r11 = X.DbS.A0j(r16)
            java.lang.String r0 = "live_position"
            java.lang.Long r1 = X.JTT.A0l(r6, r11, r0, r15)
            java.lang.String r0 = "suggested_live_count"
            r6.A9F(r0, r1)
            java.lang.String r0 = r5.A0X
            r0.getClass()
            java.lang.Long r15 = X.00y.A0n(r12, r0)
            java.lang.String r0 = "b_pk"
            r6.A9F(r0, r15)
            java.lang.String r0 = "suggested_count"
            r6.A9F(r0, r1)
            java.lang.Long r1 = X.00y.A0n(r12, r14)
            java.lang.String r0 = "parent_a_pk"
            r6.A9F(r0, r1)
            java.lang.Long r1 = X.00y.A0n(r12, r13)
            java.lang.String r0 = "parent_b_pk"
            r6.A9F(r0, r1)
            java.lang.String r0 = "parent_m_pk"
            r6.AAJ(r0, r10)
            java.lang.String r0 = "suggested_live_position"
            r6.A9F(r0, r11)
            X.2f1 r1 = X.AnonymousClass2f1.A00(r9)
            com.instagram.user.model.User r0 = r5.A03()
            com.instagram.user.model.FollowStatus r0 = r1.A0N(r0)
            java.lang.String r1 = X.1aC.A06(r0)
            java.lang.String r0 = "suggested_live_follow_status"
            r6.AAJ(r0, r1)
            X.C51965G9l.A1O(r6, r8)
            X.DbV.A1J(r6, r7)
        L_0x0616:
            X.6oS r1 = X.C318116oQ.A00(r3)
            r8 = 0
            r10 = 9
            X.JUE r0 = new X.JUE
            r9 = r16
            r6 = r5
            r7 = r4
            r4 = r0
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.AnonymousClass7TE.A1Z(r0, r1)
        L_0x062b:
            r0 = 2002560629(0x775ca675, float:4.4753182E33)
            goto L_0x104d
        L_0x0630:
            r0 = -1460379451(0xffffffffa8f460c5, float:-2.7131409E-14)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.L2s r0 = (X.C63682L2s) r0
            java.lang.Object r6 = r1.A02
            com.instagram.user.model.UpcomingEvent r6 = (com.instagram.user.model.UpcomingEvent) r6
            X.L2r r0 = r0.A00
            X.M0a r0 = r0.A00
            X.Kcv r0 = r0.A0A
            X.0eM r0 = r0.A07
            java.lang.Object r5 = r0.getValue()
            X.Jhe r5 = (X.C60221Jhe) r5
            com.instagram.common.session.UserSession r3 = r5.A05
            X.0iw r1 = r5.A03
            java.lang.String r0 = ""
            X.6am r4 = new X.6am
            r4.<init>(r1, r3, r0)
            java.lang.String r3 = X.C18810W3l.A04(r6)
            boolean r0 = r6.getReminderEnabled()
            if (r0 == 0) goto L_0x067a
            r0 = 1007(0x3ef, float:1.411E-42)
        L_0x0664:
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = "live_explore"
            r4.A04(r6, r3, r1, r0)
            X.6oS r1 = X.C318116oQ.A00(r5)
            r0 = 2
            X.C66169MGg.A01(r6, r5, r1, r0)
            r0 = 1063299915(0x3f60ab4b, float:0.8776137)
            goto L_0x104d
        L_0x067a:
            r0 = 1008(0x3f0, float:1.413E-42)
            goto L_0x0664
        L_0x067d:
            r0 = 1733021894(0x674bd0c6, float:9.624916E23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.KFg r0 = (X.C61630KFg) r0
            X.L2p r0 = r0.A00
            if (r0 == 0) goto L_0x06d3
            java.lang.Object r4 = r1.A01
            X.LiB r4 = (X.C64791LiB) r4
            X.M0a r3 = r0.A00
            java.lang.String r1 = r4.A01
            java.lang.String r0 = "KEY_LIVE_NOW_SECTION_HEADER"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x06d8
            X.Kcv r6 = r3.A0A
            java.lang.String r3 = r4.A00
            X.Ki6 r0 = X.C62573Ki6.LIVE
        L_0x06a2:
            java.lang.String r1 = r0.A00
            r0 = 1
            android.os.Bundle r5 = X.DbV.A0B(r1, r0)
            java.lang.String r0 = "igtv_channel_title_arg"
            r5.putString(r0, r3)
            java.lang.String r0 = "igtv_topic_channel_id"
            r5.putString(r0, r1)
            X.0eM r1 = r6.A08
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            X.DbU.A1D(r5, r0)
            X.0lg r4 = X.DbT.A0X(r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            r0 = 2858(0xb2a, float:4.005E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.DbV.A0Y(r1, r5, r4, r3, r0)
            X.DbU.A1K(r6, r0)
        L_0x06d3:
            r0 = -1547981607(0xffffffffa3bbacd9, float:-2.0347784E-17)
            goto L_0x104d
        L_0x06d8:
            java.lang.String r0 = "KEY_POST_LIVE_SECTION_HEADER"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x06d3
            X.Kcv r6 = r3.A0A
            java.lang.String r3 = r4.A00
            X.Ki6 r0 = X.C62573Ki6.POST_LIVE
            goto L_0x06a2
        L_0x06e7:
            r0 = 351333059(0x14f0eac3, float:2.4326404E-26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.LO9 r3 = (X.LO9) r3
            X.LBP r0 = r3.A03
            android.view.View r0 = r0.A03
            X.0nA.A0N(r0)
            X.K6D r3 = r3.A02
            X.JuA r0 = r3.A03
            if (r0 != 0) goto L_0x0703
            java.lang.String r1 = "viewState"
            goto L_0x0ce2
        L_0x0703:
            java.lang.String r7 = ""
            com.instagram.user.model.UpcomingEvent r6 = r0.A01
            X.Khz r5 = r0.A00
            java.util.Date r8 = r0.A04
            java.util.Date r9 = r0.A03
            boolean r10 = r0.A05
            boolean r11 = r0.A06
            X.AnonymousClass7TG.A1O(r5, r7)
            X.JuA r4 = new X.JuA
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.A03 = r4
            X.LBP r0 = r3.A02
            if (r0 != 0) goto L_0x0723
            java.lang.String r1 = "viewHolder"
            goto L_0x0ce2
        L_0x0723:
            com.instagram.actionbar.ActionButton r0 = r0.A0D
            X.K6D.A00(r0, r3)
            java.lang.Object r0 = r1.A01
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r7)
            r0 = 887395509(0x34e494b5, float:4.2576508E-7)
            goto L_0x104d
        L_0x0734:
            r0 = -2032060865(0xffffffff86e1363f, float:-8.47153E-35)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.Jlf r3 = (X.C60447Jlf) r3
            java.lang.Object r0 = r1.A01
            com.instagram.user.model.UpcomingEvent r0 = (com.instagram.user.model.UpcomingEvent) r0
            r3.DD1(r0)
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x0754
            com.instagram.common.session.UserSession r0 = r3.A01
            X.C59888JbD.A00(r0)
        L_0x074f:
            r0 = -1557083342(0xffffffffa330cb32, float:-9.584007E-18)
            goto L_0x104d
        L_0x0754:
            X.L2g r0 = r3.A02
            X.K4S r0 = r0.A00
            X.K4S.A00(r0)
            goto L_0x074f
        L_0x075c:
            r0 = -58359070(0xfffffffffc8582e2, float:-5.545841E36)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A02
            X.K4e r4 = (X.C61362K4e) r4
            boolean r0 = r4.A04
            r0 = r0 ^ 1
            r4.A04 = r0
            X.C61362K4e.A02(r4)
            X.L3t r0 = r4.A02
            if (r0 == 0) goto L_0x077f
            boolean r3 = r4.A04
            X.8Wk r0 = r0.A00
            X.8BA r0 = r0.A0A
            X.8it r0 = r0.A1q
            r0.A04(r3)
        L_0x077f:
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            X.C61362K4e.A00(r0, r4)
            boolean r1 = r4.A04
            if (r1 == 0) goto L_0x0794
            X.JZY r0 = X.JZY.ONE_TIME_ON
        L_0x078c:
            X.C61362K4e.A01(r0, r4, r1)
            r0 = -2044251305(0xffffffff86273357, float:-3.1446928E-35)
            goto L_0x104d
        L_0x0794:
            X.JZY r0 = X.JZY.ONE_TIME_OFF
            goto L_0x078c
        L_0x0797:
            r0 = 259408695(0xf764337, float:1.21416815E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.JaK r3 = (X.C59844JaK) r3
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r2 = X.C59844JaK.A00(r3)
            java.lang.Object r1 = r1.A01
            X.JwL r1 = (X.C61083JwL) r1
            java.lang.Object r1 = r1.A00
            X.L2R r1 = (X.L2R) r1
            r2.A06(r1)
            X.7Pu r1 = r3.A00
            X.DbW.A1K(r1)
            r1 = 0
            r3.A00 = r1
            r1 = 639875780(0x2623bac4, float:5.68051E-16)
            goto L_0x0d5d
        L_0x07be:
            r0 = 621094727(0x25052747, float:1.1549219E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.JaK r3 = (X.C59844JaK) r3
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r2 = X.C59844JaK.A00(r3)
            java.lang.Object r1 = r1.A01
            X.JwL r1 = (X.C61083JwL) r1
            java.lang.Object r1 = r1.A00
            X.L2R r1 = (X.L2R) r1
            r2.A06(r1)
            X.7Pu r1 = r3.A00
            X.DbW.A1K(r1)
            r1 = 0
            r3.A00 = r1
            r1 = -728240772(0xffffffffd497ed7c, float:-5.2201951E12)
            goto L_0x0d5d
        L_0x07e5:
            r0 = -2100471040(0xffffffff82cd5b00, float:-3.0174274E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.MWx r2 = (X.C66569MWx) r2
            com.instagram.music.common.model.MusicAssetModel r4 = com.instagram.music.common.model.MusicAssetModel.A02(r2)
            r3 = 0
            r7 = 0
            r9 = 1
            com.instagram.music.common.config.MusicAttributionConfig r2 = new com.instagram.music.common.config.MusicAttributionConfig
            r5 = r3
            r6 = r3
            r8 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r1.A01
            X.MVe r1 = (X.C66526MVe) r1
            if (r1 == 0) goto L_0x0808
            r1.D01(r2)
        L_0x0808:
            r1 = 1762397645(0x690c0dcd, float:1.0582174E25)
            goto L_0x0d5d
        L_0x080d:
            r0 = 568162721(0x21dd79a1, float:1.5007737E-18)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A02
            X.K7c r7 = (X.C61427K7c) r7
            java.lang.Object r9 = r1.A01
            X.JzN r9 = (X.C61229JzN) r9
            X.8ab r5 = X.DbW.A0U(r7)
            r8 = 1
            r5.A0s(r8)
            java.util.LinkedHashMap r4 = X.AnonymousClass7TE.A1H()
            com.instagram.api.schemas.MediaPromptPrefType r12 = r9.A02
            com.instagram.api.schemas.MediaPromptPrefType r1 = com.instagram.api.schemas.MediaPromptPrefType.UNRECOGNIZED
            r6 = 0
            if (r12 == r1) goto L_0x0834
            com.instagram.api.schemas.MediaPromptPrefType r0 = com.instagram.api.schemas.MediaPromptPrefType.NOT_APPLICABLE
            r14 = 1
            if (r12 != r0) goto L_0x0835
        L_0x0834:
            r14 = 0
        L_0x0835:
            com.instagram.api.schemas.MediaPromptPrefType r10 = r9.A01
            if (r10 == r1) goto L_0x083e
            com.instagram.api.schemas.MediaPromptPrefType r0 = com.instagram.api.schemas.MediaPromptPrefType.NOT_APPLICABLE
            r13 = 1
            if (r10 != r0) goto L_0x083f
        L_0x083e:
            r13 = 0
        L_0x083f:
            X.0eM r1 = r7.A0E
            com.instagram.reels.prompt.model.PromptStickerModel r0 = X.JTT.A0g(r1)
            boolean r0 = r0.A0M()
            if (r0 == 0) goto L_0x0904
            com.instagram.reels.prompt.model.PromptStickerModel r0 = X.JTT.A0g(r1)
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r0.A00
            java.lang.Boolean r0 = r0.Cej()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r8)
            if (r0 == 0) goto L_0x0904
            X.0eM r0 = r7.A0H
            X.0lg r11 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319939967524664(0x8108cb00071f38, double:3.032214511897557E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x0904
        L_0x086e:
            if (r14 == 0) goto L_0x088d
            com.instagram.api.schemas.MediaPromptPrefType r0 = com.instagram.api.schemas.MediaPromptPrefType.ON
            android.content.Context r1 = r7.getContext()
            if (r12 != r0) goto L_0x08fd
            if (r1 == 0) goto L_0x088d
            r0 = 2131970891(0x7f134b4b, float:1.9578746E38)
        L_0x087d:
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto L_0x088d
            r1 = 26
            X.MJ8 r0 = new X.MJ8
            r0.<init>(r1, r9, r7)
            r4.put(r2, r0)
        L_0x088d:
            if (r13 == 0) goto L_0x08ac
            com.instagram.api.schemas.MediaPromptPrefType r0 = com.instagram.api.schemas.MediaPromptPrefType.ON
            android.content.Context r1 = r7.getContext()
            if (r10 != r0) goto L_0x08f7
            if (r1 == 0) goto L_0x08ac
            r0 = 2131970889(0x7f134b49, float:1.9578742E38)
        L_0x089c:
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto L_0x08ac
            r1 = 27
            X.MJ8 r0 = new X.MJ8
            r0.<init>(r1, r9, r7)
            r4.put(r2, r0)
        L_0x08ac:
            if (r8 == 0) goto L_0x08c3
            android.content.Context r1 = r7.requireContext()
            r0 = 2131974324(0x7f1358b4, float:1.9585709E38)
            java.lang.String r2 = r1.getString(r0)
            r1 = 32
            X.MMd r0 = new X.MMd
            r0.<init>(r7, r1)
            r4.put(r2, r0)
        L_0x08c3:
            android.content.Context r1 = r7.getContext()
            if (r1 == 0) goto L_0x08d7
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x08d7
            X.MLQ r0 = X.MLQ.A00
            r4.put(r1, r0)
        L_0x08d7:
            java.util.Set r1 = r4.keySet()
            X.0qQ.A07(r1)
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r2 = r1.toArray(r0)
            java.lang.CharSequence[] r2 = (java.lang.CharSequence[]) r2
            r1 = 2
            X.Oey r0 = new X.Oey
            r0.<init>(r4, r1)
            r5.A0e(r0, r2)
            X.DbT.A1V(r5)
            r0 = -1007483627(0xffffffffc3f30515, float:-486.0397)
            goto L_0x0a40
        L_0x08f7:
            if (r1 == 0) goto L_0x08ac
            r0 = 2131970890(0x7f134b4a, float:1.9578744E38)
            goto L_0x089c
        L_0x08fd:
            if (r1 == 0) goto L_0x088d
            r0 = 2131970892(0x7f134b4c, float:1.9578748E38)
            goto L_0x087d
        L_0x0904:
            r8 = 0
            goto L_0x086e
        L_0x0907:
            java.lang.Object r4 = r1.A01
            X.TzX r4 = (X.C14625TzX) r4
            java.lang.Object r3 = r1.A02
            X.3uh r3 = (X.C255773uh) r3
            X.4DH r7 = r4.A05
            androidx.fragment.app.FragmentActivity r2 = r7.requireActivity()
            com.instagram.common.session.UserSession r1 = r4.A07
            X.30l r0 = new X.30l
            r0.<init>(r2, r1)
            X.LFp r5 = new X.LFp
            r5.<init>(r2, r0, r1)
            X.Ldw r9 = new X.Ldw
            r9.<init>(r3)
            X.Le0 r10 = new X.Le0
            r10.<init>(r4)
            X.Ki7 r8 = X.C62574Ki7.SELF_REEL_DASHBOARD
            r6 = 0
            r11 = r7
            r5.A02(r6, r7, r8, r9, r10, r11)
            return
        L_0x0933:
            java.lang.Object r6 = r1.A01
            X.TzX r6 = (X.C14625TzX) r6
            java.lang.Object r3 = r1.A02
            java.util.List r3 = (java.util.List) r3
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            X.KhK r1 = X.C62528KhK.SET_TITLE_SHARED_TO
            r0 = 0
            r5.put(r1, r0)
            X.KhK r1 = X.C62528KhK.LOGGING_ENTRY_POINT
            X.KkX r0 = X.C62671KkX.VIEWER_LIST
            r5.put(r1, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r3.iterator()
        L_0x0954:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0968
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.AudienceListIntf r0 = (com.instagram.api.schemas.AudienceListIntf) r0
            java.lang.String r0 = r0.BN7()
            r2.add(r0)
            goto L_0x0954
        L_0x0968:
            X.KhK r0 = X.C62528KhK.FILTER_AUDIENCE_LISTS
            r5.put(r0, r2)
            com.instagram.common.session.UserSession r4 = r6.A07
            X.4DH r0 = r6.A05
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r2 = 0
            X.K8H r1 = X.C63110Krd.A00(r2, r4, r5)
            X.7Pr r0 = X.DbS.A0W(r4)
            r0.A0U = r1
            r0.A0T = r1
            r0.A0X = r2
            X.DbU.A0y(r3, r1, r0)
            return
        L_0x098c:
            java.lang.Object r0 = r1.A01
            X.TzX r0 = (X.C14625TzX) r0
            java.lang.Object r7 = r1.A02
            java.util.List r7 = (java.util.List) r7
            X.4DH r6 = r0.A05
            r6.requireActivity()
            com.instagram.common.session.UserSession r5 = r0.A07
            X.0iw r0 = r0.A06
            X.LFo r4 = new X.LFo
            r4.<init>(r0, r5)
            X.KkX r3 = X.C62671KkX.VIEWER_LIST
            r2 = 0
            java.lang.Object r0 = r7.get(r2)
            com.instagram.api.schemas.AudienceListIntf r0 = (com.instagram.api.schemas.AudienceListIntf) r0
            java.lang.String r1 = r0.BN7()
            java.lang.Object r0 = r7.get(r2)
            com.instagram.api.schemas.AudienceListIntf r0 = (com.instagram.api.schemas.AudienceListIntf) r0
            java.lang.String r0 = r0.getName()
            r4.A02(r3, r1, r0)
            java.lang.Object r1 = r7.get(r2)
            com.instagram.api.schemas.AudienceListIntf r1 = (com.instagram.api.schemas.AudienceListIntf) r1
            r0 = 95848312(0x5b68778, float:1.7164961E-35)
            X.LPM.A02(r1, r6, r5, r0, r2)
            return
        L_0x09c9:
            r0 = -637682570(0xffffffffd9fdbc76, float:-8.927548E15)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.igds.components.button.IgdsButton r2 = (com.instagram.igds.components.button.IgdsButton) r2
            r0 = 1
            r2.setLoading(r0)
            java.lang.Object r7 = r1.A02
            X.KXd r7 = (X.C62041KXd) r7
            com.instagram.common.ui.base.IgEditText r0 = r7.A02
            r8 = 0
            if (r0 == 0) goto L_0x0a81
            android.text.Editable r0 = r0.getText()
        L_0x09e5:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r10 = X.DbV.A12(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0a01
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0a01
            java.lang.String r0 = r7.A08
            boolean r0 = X.0qQ.A0K(r0, r10)
            r4 = 1
            if (r0 == 0) goto L_0x0a02
        L_0x0a01:
            r4 = 0
        L_0x0a02:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.A00
            if (r0 == 0) goto L_0x0a7f
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0a7f
            java.lang.String r1 = r7.A06
            java.lang.String r0 = r7.A09
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0a7f
        L_0x0a16:
            X.LRl r2 = r7.A03
            X.L55 r1 = r2.A02
            java.util.Set r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0a2b
            java.util.Set r0 = r1.A01
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 != 0) goto L_0x0a2c
        L_0x0a2b:
            r0 = 1
        L_0x0a2c:
            if (r4 != 0) goto L_0x0a44
            if (r0 != 0) goto L_0x0a44
            if (r5 != 0) goto L_0x0a44
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            r0 = -1
            r1.setResult(r0)
            r1.finish()
        L_0x0a3d:
            r0 = 342316493(0x146755cd, float:1.1679441E-26)
        L_0x0a40:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0a44:
            X.0rm r6 = X.C51965G9l.A11()
            if (r0 == 0) goto L_0x0a64
            java.util.Set r0 = r2.A03
            com.google.common.collect.ImmutableList r0 = X.DbU.A0K(r0)
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0a58:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0a62
            X.C61036Jva.A01(r2, r1)
            goto L_0x0a58
        L_0x0a62:
            r6.A00 = r2
        L_0x0a64:
            if (r4 != 0) goto L_0x0a68
            java.lang.String r10 = r7.A08
        L_0x0a68:
            if (r5 == 0) goto L_0x0a6c
            java.lang.String r8 = r7.A09
        L_0x0a6c:
            java.lang.String r9 = r7.A07
            if (r9 == 0) goto L_0x0a3d
            X.0xx r0 = X.DbW.A0E(r7)
            r11 = 0
            r12 = 7
            X.MGp r5 = new X.MGp
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.AnonymousClass7TE.A1Z(r5, r0)
            goto L_0x0a3d
        L_0x0a7f:
            r5 = 0
            goto L_0x0a16
        L_0x0a81:
            r0 = r8
            goto L_0x09e5
        L_0x0a84:
            r0 = 5822015(0x58d63f, float:8.15838E-39)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            X.KXd r5 = (X.C62041KXd) r5
            X.0eM r0 = r5.A0C
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.8c0 r4 = X.C359088bz.A00(r0)
            X.9tI r0 = X.C391569tI.ADD_USERS_TO_NEW_GROUP
            r3 = 0
            X.C359098c0.A01(r0, r4, r3)
            java.lang.Object r1 = r1.A01
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            r0 = 1
            r1.setLoading(r0)
            com.instagram.common.ui.base.IgEditText r0 = r5.A02
            if (r0 == 0) goto L_0x0aaf
            android.text.Editable r3 = r0.getText()
        L_0x0aaf:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r3 = X.DbV.A12(r0)
            X.0xx r1 = X.DbW.A0E(r5)
            r0 = 17
            X.DbX.A1W(r5, r3, r1, r0)
            r0 = 1286201923(0x4ca9e243, float:8.9068056E7)
            goto L_0x104d
        L_0x0ac5:
            r0 = -1134837377(0xffffffffbc5bc17f, float:-0.013412832)
            int r2 = X.DbX.A03(r3, r0)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r3)
            java.lang.Object r7 = r1.A01
            X.MWx r7 = (X.C66569MWx) r7
            boolean r0 = X.C64131LPf.A02(r0, r7)
            if (r0 != 0) goto L_0x0adf
            r0 = -2099216620(0xffffffff82e07f14, float:-3.298678E-37)
            goto L_0x104d
        L_0x0adf:
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            java.lang.Object r5 = r1.A02
            X.KVM r5 = (X.KVM) r5
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            java.lang.Integer r4 = r5.A02
            X.MVU r3 = r5.A0K
            int r1 = r5.getBindingAdapterPosition()
            java.lang.String r0 = r5.A0O
            if (r6 != r4) goto L_0x0afb
            r3.DXR(r7, r0, r1)
        L_0x0af6:
            r0 = 1504461505(0x59ac42c1, float:6.0608866E15)
            goto L_0x104d
        L_0x0afb:
            r3.DnN(r7, r0, r1)
            goto L_0x0af6
        L_0x0aff:
            r0 = 619063455(0x24e6289f, float:9.9815415E-17)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A02
            X.Jkw r6 = (X.C60403Jkw) r6
            com.instagram.common.session.UserSession r8 = r6.A03
            X.27r r0 = X.27p.A01(r8)
            X.JVj r7 = r6.A02
            X.29R r3 = r0.A09
            X.1Ln r5 = X.JTO.A0N(r3)
            boolean r0 = X.DbT.A1Y(r5)
            if (r0 == 0) goto L_0x0b53
            X.4yP r0 = r3.A0J()
            if (r0 == 0) goto L_0x0b53
            X.JTO.A1V(r5)
            java.lang.String r0 = "CLIPS_ADD_YOURS_STICKER_PARTICIPATION_BUTTON"
            X.JTS.A1F(r5, r3, r0)
            X.283 r4 = r3.A04
            X.28D r0 = r4.A09
            r5.A0b(r0)
            r0 = 2
            r5.A0W(r0)
            r5.A0d(r7)
            X.JTQ.A1A(r5)
            int r0 = X.JTR.A0D(r4)
            r5.A0V(r0)
            java.lang.Long r3 = X.C51971G9r.A0m()
            java.lang.String r0 = "capture_format_index"
            r5.A0Q(r0, r3)
            X.JTT.A1E(r5, r4)
            r5.Cgf()
        L_0x0b53:
            X.37E r0 = X.AnonymousClass37D.A00
            android.content.Context r7 = r6.A01
            X.DbX.A14(r7, r0)
            X.MTw r6 = r6.A04
            java.lang.String r5 = "trending_prompts_page"
            java.lang.Object r0 = r1.A01
            com.instagram.reels.prompt.model.PromptStickerModel r0 = (com.instagram.reels.prompt.model.PromptStickerModel) r0
            com.instagram.reels.prompt.model.PromptStickerModel r4 = r0.A04()
            com.instagram.user.model.User r0 = X.DbT.A0j(r8)
            r4.A08(r0)
            r3 = 1
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r4.A00
            X.Vib r1 = r0.AKQ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.A0B = r0
            com.instagram.api.schemas.StoryPromptTappableData r0 = r1.A00()
            r4.A00 = r0
            X.JZg r0 = new X.JZg
            r0.<init>(r7, r8, r4, r5)
            r6.Daj(r0)
            r0 = -1864515796(0xffffffff90ddbf2c, float:-8.7463677E-29)
            goto L_0x104d
        L_0x0b8d:
            r0 = 1926381542(0x72d23fe6, float:8.328845E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            android.view.View r2 = (android.view.View) r2
            android.content.Context r6 = r2.getContext()
            boolean r2 = r6 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0bc5
            X.37E r5 = X.AnonymousClass37D.A00
            java.lang.String r4 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r6, r4)
            r3 = r6
            android.app.Activity r3 = (android.app.Activity) r3
            X.37D r2 = r5.A01(r3)
            if (r2 == 0) goto L_0x0bc5
            X.0qQ.A0C(r6, r4)
            X.DbX.A10(r3, r5)
            java.lang.Object r1 = r1.A02
            X.K7T r1 = (X.K7T) r1
            X.MTw r1 = r1.A00
            if (r1 != 0) goto L_0x0bc2
            java.lang.String r1 = "promptsAdapterListener"
            goto L_0x0ce2
        L_0x0bc2:
            r1.D6s()
        L_0x0bc5:
            r1 = 1497562759(0x5942fe87, float:3.43037508E15)
            goto L_0x0d5d
        L_0x0bca:
            r0 = -1873701762(0xffffffff9051947e, float:-4.1332377E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            X.KSr r5 = (X.C61942KSr) r5
            java.lang.Object r6 = r1.A01
            X.3Q2 r6 = (X.AnonymousClass3Q2) r6
            boolean r1 = r5.A0L
            if (r1 == 0) goto L_0x0c36
            boolean r1 = X.JTT.A1a(r5)
            r2 = 0
            if (r1 != 0) goto L_0x0c3b
            X.L8F r4 = r5.A0C
            if (r4 == 0) goto L_0x0c3b
            X.Lsu r1 = X.JTT.A0Y(r5)
            java.lang.String r9 = r1.A0H
            X.Lsu r1 = X.JTT.A0Y(r5)
            java.util.List r8 = r1.A0O
            if (r8 != 0) goto L_0x0bf8
            X.0sn r8 = X.0sn.A00
        L_0x0bf8:
            r1 = 49
            X.MMp r7 = X.C66306MMp.A02(r5, r1)
            X.MMi r3 = new X.MMi
            r3.<init>(r5, r2)
            java.lang.String r2 = ""
            r1 = 2
            X.0qQ.A0B(r8, r1)
            X.847 r10 = r4.A01
            com.instagram.common.session.UserSession r14 = r4.A02
            r1 = 32
            java.lang.String r1 = X.002.A0T(r2, r9, r1)
            java.util.List r2 = r10.A01(r14, r1, r8)
            boolean r1 = X.AnonymousClass7TE.A1b(r2)
            if (r1 == 0) goto L_0x0c3b
            r4.A00 = r2
            android.app.Activity r11 = r10.A02
            r1 = 45
            X.LV0 r12 = X.LV0.A00(r7, r4, r1)
            r1 = 46
            X.LV0 r13 = X.LV0.A00(r3, r4, r1)
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            java.lang.String r16 = "igtv"
            r17 = r2
            r10.A03(r11, r12, r13, r14, r15, r16, r17)
        L_0x0c36:
            r1 = 316239970(0x12d97062, float:1.372233E-27)
            goto L_0x0d5d
        L_0x0c3b:
            X.3Q2 r1 = X.LJ9.A01(r5)
            boolean r1 = r1.A5T
            if (r1 == 0) goto L_0x0c64
            java.lang.String r4 = X.C51972G9s.A0n()
            X.3Q2 r1 = X.LJ9.A01(r5)
            r1.A3x = r4
            X.KTX r1 = X.JTT.A0X(r5)
            java.lang.String r3 = "video_feed_composer"
            X.3Q2 r1 = r1.A02
            r1.A3z = r3
            X.0eM r1 = r5.A0W
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r1 = X.C2373637i.A01(r6)
            X.C64189LSw.A05(r2, r3, r1, r4)
        L_0x0c64:
            X.C61942KSr.A07(r5)
            goto L_0x0c36
        L_0x0c68:
            r0 = -548085347(0xffffffffdf54e19d, float:-1.5339714E19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            boolean r0 = r3.isSelected()
            r6 = r0 ^ 1
            r3.setSelected(r6)
            java.lang.Object r5 = r1.A02
            X.K6s r5 = (X.C61421K6s) r5
            X.0eM r0 = r5.A0D
            X.KTX r0 = X.JTR.A0o(r0)
            X.3Q2 r0 = r0.A02
            r0.A5F = r6
            android.widget.Toast r0 = r5.A01
            if (r0 == 0) goto L_0x0c8d
            r0.cancel()
        L_0x0c8d:
            r3 = 2131976405(0x7f1360d5, float:1.958993E38)
            if (r6 == 0) goto L_0x0c95
            r3 = 2131976404(0x7f1360d4, float:1.9589928E38)
        L_0x0c95:
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r4 = r0.getContext()
            java.lang.String r3 = r5.getString(r3)
            r1 = 0
            r0 = 0
            X.Jf4 r0 = X.C59689JTv.A03(r4, r3, r1, r0)
            r5.A01 = r0
            java.lang.String r1 = "videoPreviewDelegate"
            X.9Pn r0 = r5.A04
            if (r6 == 0) goto L_0x0cbd
            if (r0 == 0) goto L_0x0ce2
            X.9Pw r0 = r0.A08
            if (r0 == 0) goto L_0x0cb8
            r0.A09()
        L_0x0cb8:
            r0 = -514514173(0xffffffffe1552303, float:-2.4572996E20)
            goto L_0x104d
        L_0x0cbd:
            if (r0 == 0) goto L_0x0ce2
            X.9Pw r0 = r0.A08
            if (r0 == 0) goto L_0x0cb8
            r0.A0A()
            goto L_0x0cb8
        L_0x0cc7:
            r0 = -1840972812(0xffffffff9244fbf4, float:-6.215725E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.Jpm r3 = (X.C60701Jpm) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.K6y r3 = r3.A04
            java.lang.Object r2 = r1.A01
            com.instagram.common.gallery.Medium r2 = (com.instagram.common.gallery.Medium) r2
            r5 = 0
            X.KgF r1 = r3.A08
            r10 = 0
            if (r1 != 0) goto L_0x0cea
            java.lang.String r1 = "pickerMode"
        L_0x0ce2:
            X.0qQ.A0F(r1)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0cea:
            int r1 = r1.ordinal()
            r4 = 1
            if (r1 == r4) goto L_0x0d61
            if (r1 != r5) goto L_0x0e71
            X.0eM r6 = r3.A0G
            X.KTX r7 = X.JTR.A0o(r6)
            X.MW0 r1 = r7.A01
            r1.ESz(r4)
            r1.ET1(r5)
            r1.ET2(r5)
            X.3Q2 r1 = r7.A02
            r1.A5L = r5
            r1.A05 = r5
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r6)
            X.Lsu r1 = r1.A0M
            r1.A0A = r10
            android.content.Context r1 = r3.requireContext()
            X.6ST r5 = new X.6ST
            r5.<init>(r1, r4)
            r1 = 2131969783(0x7f1346f7, float:1.9576499E38)
            X.DbU.A1L(r3, r5, r1)
            X.AnonymousClass0fN.A00(r5)
            android.content.Context r7 = r5.getContext()
            X.0qQ.A07(r7)
            X.0eM r1 = r3.A0F
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r1)
            android.content.Context r1 = r5.getContext()
            int r13 = X.LQM.A01(r1)
            android.content.Context r1 = r5.getContext()
            int r14 = X.LQM.A00(r1)
            java.lang.String r11 = r2.A0X
            X.Lpf r9 = new X.Lpf
            r9.<init>(r3, r4)
            r12 = 1059363750(0x3f249ba6, float:0.643)
            X.LT1.A03(r7, r8, r9, r10, r11, r12, r13, r14)
            r5.hide()
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r2 = X.JTO.A0k(r6)
            X.KTR r1 = X.KTR.A00
            r2.A04(r3, r1)
        L_0x0d5a:
            r1 = 751777925(0x2ccf3885, float:5.8895688E-12)
        L_0x0d5d:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0d61:
            int r6 = r2.A03
            int r1 = r3.A00
            if (r6 > r1) goto L_0x0e27
            if (r5 > r6) goto L_0x0e27
            X.JYp r1 = X.C59796JYp.A00(r2, r5)
            long r6 = r1.A03
            r8 = -3
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0e16
            r8 = -1
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0e16
            X.0eM r4 = r3.A0G
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r4)
            X.LJ9 r1 = r1.A01
            boolean r1 = r1 instanceof X.KTX
            if (r1 == 0) goto L_0x0d9d
            X.KTX r1 = X.JTR.A0o(r4)
            com.instagram.common.gallery.Medium r1 = r1.A00
            boolean r1 = X.0qQ.A0K(r1, r2)
            if (r1 == 0) goto L_0x0d9d
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r2 = X.JTO.A0k(r4)
            X.KT8 r1 = X.KT8.A00
            r2.A04(r10, r1)
            goto L_0x0d5a
        L_0x0d9d:
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r3 = X.JTO.A0k(r4)
            X.LF3 r1 = r3.A09
            X.LJ9 r1 = r1.A00(r2, r3, r10)
            r3.A01 = r1
            boolean r1 = r1 instanceof X.KTX
            if (r1 == 0) goto L_0x0de9
            X.KTX r1 = r3.A02()
            X.3Q2 r1 = r1.A02
            float r2 = r1.A02
        L_0x0db5:
            X.Lsu r1 = r3.A0M
            r1.A00(r2)
            X.LJ9 r3 = r3.A01
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r4)
            X.KiE r2 = X.C62581KiE.VIDEO_GALLERY
            X.LQk r1 = r1.A08
            com.instagram.igtv.uploadflow.common.IGTVUploadProgress r1 = r1.A01
            X.0qQ.A0B(r2, r5)
            r1.A00 = r2
            X.L8E r1 = r1.A01
            r1.A02 = r5
            r1.A01 = r5
            r1.A00 = r5
            r1.A03 = r5
            boolean r1 = r3 instanceof X.KTX
            if (r1 == 0) goto L_0x0dec
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r2 = X.JTO.A0k(r4)
            X.0eM r1 = r2.A0E
            r1.getValue()
            X.KT8 r1 = X.KT8.A00
            r2.A04(r10, r1)
            goto L_0x0d5a
        L_0x0de9:
            r2 = 1058013184(0x3f100000, float:0.5625)
            goto L_0x0db5
        L_0x0dec:
            boolean r1 = r3 instanceof X.KTW
            if (r1 == 0) goto L_0x0d5a
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Cannot convert Medium to PendingMedia, entry point: "
            r2.append(r1)
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r4)
            X.28D r1 = r1.A00
            r2.append(r1)
            java.lang.String r1 = ", reason: "
            r2.append(r1)
            X.KTW r3 = (X.KTW) r3
            java.lang.String r1 = r3.A00
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r1, r2)
            java.lang.String r1 = "IGTVUploadGalleryFragment.onThumbnailClicked"
            X.0wb.A03(r1, r2)
            goto L_0x0d5a
        L_0x0e16:
            X.8ab r3 = X.Dba.A0H(r3)
            r1 = 2131964007(0x7f133067, float:1.9564783E38)
            r3.A09(r1)
            r1 = 2131976486(0x7f136126, float:1.9590094E38)
            r3.A08(r1)
            goto L_0x0e5a
        L_0x0e27:
            X.0eM r1 = r3.A0G
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r1)
            X.0eM r1 = r1.A0E
            r1.getValue()
            androidx.fragment.app.FragmentActivity r7 = r3.requireActivity()
            int r1 = r3.A02
            r6 = 60
            if (r1 != r6) goto L_0x0e62
            r5 = 2131964006(0x7f133066, float:1.9564781E38)
            int r1 = r3.A01
            int r1 = r1 / r6
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r1)
        L_0x0e46:
            java.lang.String r2 = r7.getString(r5, r1)
            X.0qQ.A0A(r2)
            X.8ab r3 = X.Dba.A0H(r3)
            r1 = 2131964007(0x7f133067, float:1.9564783E38)
            r3.A09(r1)
            r3.A0q(r2)
        L_0x0e5a:
            r3.A06()
            X.AnonymousClass7TH.A0a(r3, r4)
            goto L_0x0d5a
        L_0x0e62:
            r5 = 2131964005(0x7f133065, float:1.956478E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            int r1 = r3.A01
            int r1 = r1 / r6
            java.lang.Object[] r1 = X.C51968G9o.A1Z(r2, r1)
            goto L_0x0e46
        L_0x0e71:
            X.Wub r1 = X.AnonymousClass7TE.A1K()
            throw r1
        L_0x0e76:
            r0 = -564766691(0xffffffffde56581d, float:-3.8612817E18)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.K4Y r3 = (X.K4Y) r3
            java.lang.String r0 = r3.A0E
            if (r0 == 0) goto L_0x0e99
            X.0eM r0 = r3.A0F
            X.0lg r4 = X.DbT.A0X(r0)
            java.lang.String r0 = r3.A0E
            java.lang.String r3 = java.lang.String.valueOf(r0)
            X.AnonymousClass7TG.A1N(r4, r3)
            java.lang.String r0 = "upsell_secondary_button_clicked"
            X.FG9.A00(r4, r0, r3)
        L_0x0e99:
            java.lang.Object r0 = r1.A01
            X.MUy r0 = (X.C66520MUy) r0
            if (r0 == 0) goto L_0x0ea2
            r0.getSecondaryCtaAction()
        L_0x0ea2:
            r0 = 1784829351(0x6a6255a7, float:6.840543E25)
            goto L_0x104d
        L_0x0ea7:
            r0 = 1212835725(0x484a678d, float:207262.2)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.K4Y r3 = (X.K4Y) r3
            java.lang.String r0 = r3.A0E
            if (r0 == 0) goto L_0x0eca
            X.0eM r0 = r3.A0F
            X.0lg r4 = X.DbT.A0X(r0)
            java.lang.String r0 = r3.A0E
            java.lang.String r3 = java.lang.String.valueOf(r0)
            X.AnonymousClass7TG.A1N(r4, r3)
            java.lang.String r0 = "upsell_primary_button_clicked"
            X.FG9.A00(r4, r0, r3)
        L_0x0eca:
            java.lang.Object r0 = r1.A01
            X.MUy r0 = (X.C66520MUy) r0
            if (r0 == 0) goto L_0x0ed3
            r0.getPrimaryCtaAction()
        L_0x0ed3:
            r0 = 2061195360(0x7adb5860, float:5.6945273E35)
            goto L_0x104d
        L_0x0ed8:
            r0 = 898694597(0x3590fdc5, float:1.0802693E-6)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.2sY r0 = (X.C231872sY) r0
            java.lang.Object r3 = r1.A02
            X.Luw r3 = (X.C65533Luw) r3
            com.instagram.common.session.UserSession r1 = r0.A01
            androidx.fragment.app.Fragment r0 = r0.A00
            X.LMq r4 = new X.LMq
            r4.<init>(r0, r1, r3)
            X.8ab r3 = r4.A02
            java.lang.CharSequence[] r1 = X.C64096LMq.A00(r4)
            X.LU5 r0 = new X.LU5
            r0.<init>(r4)
            r3.A0e(r0, r1)
            r0 = 1
            X.AnonymousClass7TH.A0a(r3, r0)
            r0 = 1643075430(0x61ef5766, float:5.518837E20)
            goto L_0x104d
        L_0x0f07:
            r0 = -437016024(0xffffffffe5f3aa28, float:-1.4383424E23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.Luw r0 = (X.C65533Luw) r0
            X.3Q2 r0 = r0.A02
            if (r0 == 0) goto L_0x0f23
            X.1Xj r3 = r0.A1C
            if (r3 == 0) goto L_0x0f23
            java.lang.Object r0 = r1.A01
            X.2sZ r0 = (X.C231882sZ) r0
            if (r0 == 0) goto L_0x0f23
            r0.D31(r3)
        L_0x0f23:
            r0 = -258967260(0xfffffffff0907924, float:-3.5769833E29)
            goto L_0x104d
        L_0x0f28:
            r0 = 351759783(0x14f76da7, float:2.4983877E-26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.9PF r0 = (X.AnonymousClass9PF) r0
            X.L2a r0 = r0.A00
            if (r0 == 0) goto L_0x0f4e
            java.lang.Object r5 = r1.A01
            X.3rt r5 = (X.C254073rt) r5
            r4 = 0
            com.instagram.common.ui.base.IgSimpleImageView r3 = r5.A0O
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0f53
            r3.setVisibility(r4)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = r5.A0P
            r0.setVisibility(r1)
        L_0x0f4e:
            r0 = 1066552740(0x3f924da4, float:1.1429944)
            goto L_0x104d
        L_0x0f53:
            r3.setVisibility(r1)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = r5.A0P
            r0.setVisibility(r4)
            goto L_0x0f4e
        L_0x0f5c:
            r0 = 211114748(0xc955afc, float:2.3011844E-31)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r0 = r1.A02
            X.YBG r0 = (X.YBG) r0
            X.JxF r0 = (X.C61104JxF) r0
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r0 = r0.A01
            r3.invoke(r0)
            r0 = 836908906(0x31e2376a, float:6.5837655E-9)
            goto L_0x104d
        L_0x0f77:
            r0 = 1406704402(0x53d89b12, float:1.86062917E12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r0 = r1.A02
            X.JxF r0 = (X.C61104JxF) r0
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r0 = r0.A01
            r3.invoke(r0)
            r0 = 845725486(0x3268bf2e, float:1.3547647E-8)
            goto L_0x104d
        L_0x0f90:
            r0 = 972317925(0x39f464e5, float:4.661448E-4)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.0sP r3 = (X.0sP) r3
            java.lang.Object r0 = r1.A02
            X.JxF r0 = (X.C61104JxF) r0
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r0 = r0.A01
            r3.invoke(r0)
            r0 = -48893633(0xfffffffffd15f13f, float:-1.2456725E37)
            goto L_0x104d
        L_0x0fa9:
            r0 = 1909874834(0x71d66092, float:2.1230892E30)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.K6a r3 = (X.C61404K6a) r3
            java.lang.Object r0 = r1.A01
            android.widget.EditText r0 = (android.widget.EditText) r0
            X.C61404K6a.A00(r0, r3)
            r0 = 1582320763(0x5e504c7b, float:3.75237672E18)
            goto L_0x104d
        L_0x0fc0:
            r0 = 1702018048(0x6572bc00, float:7.1642542E22)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.K6a r3 = (X.C61404K6a) r3
            java.lang.Object r0 = r1.A01
            android.widget.EditText r0 = (android.widget.EditText) r0
            X.C61404K6a.A00(r0, r3)
            X.DbX.A1J(r3)
            r0 = -2090904388(0xffffffff835f54bc, float:-6.563108E-37)
            goto L_0x104d
        L_0x0fd9:
            r0 = 503907606(0x1e090516, float:7.253771E-21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K9L r0 = (X.K9L) r0
            X.L1P r4 = r0.A00
            java.lang.Object r0 = r1.A02
            int r3 = X.AnonymousClass7TE.A0M(r0)
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r0 = r4.A00
            X.K9I r1 = r0.A0H
            r0 = 6
            if (r3 != r0) goto L_0x1000
            int r0 = r1.A01
            int r0 = r0 + 6
            r1.A01 = r0
        L_0x0ff9:
            r1.A06()
            r0 = 1832226302(0x6d358dfe, float:3.5117778E27)
            goto L_0x104d
        L_0x1000:
            r0 = 7
            if (r3 != r0) goto L_0x100a
            int r0 = r1.A03
            int r0 = r0 + 6
            r1.A03 = r0
            goto L_0x0ff9
        L_0x100a:
            r0 = 11
            if (r3 != r0) goto L_0x1015
            int r0 = r1.A00
            int r0 = r0 + 6
            r1.A00 = r0
            goto L_0x0ff9
        L_0x1015:
            r0 = 19
            if (r3 != r0) goto L_0x0ff9
            int r0 = r1.A02
            int r0 = r0 + 6
            r1.A02 = r0
            goto L_0x0ff9
        L_0x1020:
            r0 = 1137987170(0x43d44e62, float:424.61237)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.MV9 r0 = (X.MV9) r0
            r0.D8z()
            r0 = -1570181304(0xffffffffa268ef48, float:-3.1568537E-18)
            goto L_0x104d
        L_0x1032:
            r0 = 1818520646(0x6c646c46, float:1.1045856E27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.MV9 r0 = (X.MV9) r0
            r0.DuW()
            java.lang.Object r0 = r1.A01
            X.LRd r0 = (X.C64162LRd) r0
            com.instagram.ui.widget.gradientspinner.SpinningGradientBorder r1 = r0.A04
            r0 = 0
            r1.setSpinnerState(r0)
            r0 = -869430692(0xffffffffcc2d8a5c, float:-4.5492592E7)
        L_0x104d:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x1051:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -71687460(0xfffffffffbba22dc, float:-1.9329485E36)
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LY7.onClick(android.view.View):void");
    }

    public LY7(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
