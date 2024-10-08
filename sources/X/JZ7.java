package X;

import android.view.View;
import android.widget.BaseAdapter;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class JZ7 extends BaseAdapter {
    public int A00;
    public final View A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C357638Yz A04;
    public final AnonymousClass8MH A05;
    public final List A06 = AnonymousClass7TE.A1C();
    public final List A07;
    public final boolean A08;
    public final C314286hx A09;
    public final Map A0A;

    public final void A02(LMR lmr, boolean z) {
        0qQ.A0B(lmr, 0);
        C62554Khk khk = lmr.A00;
        if (khk != null) {
            int ordinal = khk.ordinal();
            if (ordinal == 0) {
                Object obj = this.A0A.get(lmr.A01);
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerEmojiSheetViewBinder.Holder");
                ((C63704L3o) obj).A01.EKn(z);
                return;
            } else if (ordinal == 1 || ordinal == 2) {
                return;
            }
        }
        throw AnonymousClass7TE.A1B("Unknown asset sheet type");
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final boolean A03(LMR lmr) {
        C62554Khk khk = lmr.A00;
        if (khk != null) {
            int ordinal = khk.ordinal();
            if (ordinal == 0) {
                Object obj = this.A0A.get(lmr.A01);
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerEmojiSheetViewBinder.Holder");
                return ((C63704L3o) obj).A01.COw();
            } else if (ordinal == 1 || ordinal == 2) {
                return true;
            }
        }
        throw AnonymousClass7TE.A1B("Unknown asset sheet type");
    }

    public final int getCount() {
        return this.A07.size();
    }

    public final Object getItem(int i) {
        return this.A07.get(i);
    }

    public final long getItemId(int i) {
        return (long) ((LMR) this.A07.get(i)).A01.hashCode();
    }

    public final int getItemViewType(int i) {
        C62554Khk khk = ((LMR) this.A07.get(i)).A00;
        if (khk != null) {
            int ordinal = khk.ordinal();
            if (ordinal == 0) {
                return 0;
            }
            if (ordinal == 1 || ordinal == 2) {
                return 1;
            }
        }
        throw AnonymousClass7TE.A1B("Unknown asset sheet type");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.L3o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.L3n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: X.L3n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r21, android.view.View r22, android.view.ViewGroup r23) {
        /*
            r20 = this;
            r15 = r22
            r0 = 2
            r5 = r23
            X.0qQ.A0B(r5, r0)
            r2 = r20
            r1 = r21
            if (r22 != 0) goto L_0x0044
            int r3 = r2.getItemViewType(r1)
            if (r3 == 0) goto L_0x00c1
            r10 = 1
            android.content.Context r3 = X.AnonymousClass7TE.A0S(r5)
            com.instagram.common.session.UserSession r9 = r2.A03
            X.0iw r8 = r2.A02
            X.8Yz r7 = r2.A04
            X.8MH r6 = r2.A05
            r4 = 0
            X.0qQ.A0B(r9, r10)
            X.DbW.A1N(r8, r0, r6)
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r0 = 2131626659(0x7f0e0aa3, float:1.888056E38)
            android.view.View r15 = X.DbU.A0A(r3, r5, r0, r4)
            X.L3n r5 = new X.L3n
            r14 = r5
            r18 = r7
            r19 = r6
            r16 = r8
            r17 = r9
            r14.<init>(r15, r16, r17, r18, r19)
        L_0x0041:
            r15.setTag(r5)
        L_0x0044:
            com.instagram.common.session.UserSession r6 = r2.A03
            X.27r r0 = X.27p.A01(r6)
            X.29J r7 = r0.A01
            X.0qQ.A07(r7)
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x0076
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0076
            X.29E r8 = r7.A04
            long r3 = r7.A00
            java.lang.String r0 = "ui_load_start"
            r8.A0C(r0, r3)
            long r3 = r7.A00
            X.29D r0 = r7.A05
            X.27x r0 = r0.A00
            X.4yP r0 = r0.A0J()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "camera_destination"
            r8.A09(r3, r0, r5)
            r0 = 1
            r7.A02 = r0
        L_0x0076:
            java.util.List r4 = r2.A06
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x00af
            int r3 = r2.getItemViewType(r1)
            java.util.List r5 = r2.A07
            java.lang.Object r0 = r5.get(r1)
            X.LMR r0 = (X.LMR) r0
            r2.A00(r15, r0, r4, r3)
        L_0x008d:
            r0 = 1
            X.MJ9 r4 = new X.MJ9
            r4.<init>(r0, r7, r2)
            X.0Tu r0 = X.AnonymousClass7TF.A0H(r6)
            r2 = 36327297246050631(0x810f7c00003947, double:3.0368672844627613E-306)
            boolean r0 = X.182.A06(r0, r6, r2)
            X.Hqe r2 = new X.Hqe
            r2.<init>(r15, r4, r0)
            int r0 = X.C51966G9m.A06(r5)
            if (r1 != r0) goto L_0x00ae
            r2.A00()
        L_0x00ae:
            return r15
        L_0x00af:
            int r4 = r2.getItemViewType(r1)
            java.util.List r5 = r2.A07
            java.lang.Object r3 = r5.get(r1)
            X.LMR r3 = (X.LMR) r3
            X.0sn r0 = X.0sn.A00
            r2.A00(r15, r3, r0, r4)
            goto L_0x008d
        L_0x00c1:
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r5)
            com.instagram.common.session.UserSession r9 = r2.A03
            android.view.View r7 = r2.A01
            X.0iw r8 = r2.A02
            X.8MH r11 = r2.A05
            boolean r14 = r2.A08
            X.8Yz r10 = r2.A04
            boolean r4 = X.DbW.A1X(r9)
            X.0qQ.A0B(r7, r0)
            r0 = 3
            X.DbW.A1N(r8, r0, r11)
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r6)
            r0 = 2131626660(0x7f0e0aa4, float:1.8880562E38)
            android.view.View r15 = r3.inflate(r0, r5, r4)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r15, r0)
            r0 = r15
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.3Ar r12 = X.C238103Ao.A00(r0)
            X.0qQ.A07(r12)
            int r13 = X.JTR.A04(r6)
            X.L3o r5 = new X.L3o
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZ7.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public JZ7(View view, AnonymousClass0iw r5, UserSession userSession, C357638Yz r7, AnonymousClass8MH r8, C314286hx r9, boolean z, boolean z2) {
        AnonymousClass7TG.A1U(userSession, view, r5);
        0qQ.A0B(r8, 5);
        this.A03 = userSession;
        this.A01 = view;
        this.A02 = r5;
        this.A09 = r9;
        this.A05 = r8;
        this.A08 = z;
        this.A04 = r7;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A07 = A1C;
        this.A0A = AnonymousClass7TE.A1E();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        if (!z2) {
            A1C2.add(C317876nz.A1c);
            A1C2.add(C317876nz.A1b);
        }
        LMR.A00(A1C, A1C2);
        this.A00 = A1C.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.L3o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.L3n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.L3o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.L3o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(android.view.View r11, X.LMR r12, java.util.List r13, int r14) {
        /*
            r10 = this;
            java.lang.Object r3 = r11.getTag()
            if (r14 == 0) goto L_0x0085
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.RecentSheetViewBinder.Holder"
            X.0qQ.A0C(r3, r0)
            X.L3n r3 = (X.C63703L3n) r3
            X.6hx r0 = r10.A09
            if (r0 == 0) goto L_0x0080
            java.util.ArrayList r1 = r0.A02()
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.K98 r7 = r3.A00
            java.util.List r6 = r7.A03
            r6.clear()
            r6.addAll(r1)
            r7.A06()
            android.content.Context r1 = r7.A00
            r0 = 2131971360(0x7f134d20, float:1.9579697E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 0
            X.JwJ r1 = new X.JwJ
            r1.<init>((X.C61081JwJ) r0, (java.lang.String) r2)
            X.K9U r0 = r7.A02
            r7.A08(r0, r1)
            int r0 = r6.size()
            double r4 = (double) r0
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r9 = X.JTP.A01(r4, r0)
            r8 = 0
        L_0x0046:
            if (r8 >= r9) goto L_0x007c
            int r0 = r8 * 4
            r5 = 4
            X.71g r4 = new X.71g
            r4.<init>(r6, r0, r5)
            java.lang.String r1 = X.AnonymousClass7TF.A0h(r4)
            java.util.Map r0 = r7.A04
            java.lang.Object r2 = r0.get(r1)
            X.6u8 r2 = (X.AnonymousClass6u8) r2
            if (r2 != 0) goto L_0x0066
            X.6u8 r2 = new X.6u8
            r2.<init>()
            r0.put(r1, r2)
        L_0x0066:
            int r0 = r9 + -1
            boolean r0 = X.AnonymousClass7TF.A1S(r8, r0)
            r2.A00(r8, r0)
            X.L3m r1 = new X.L3m
            r1.<init>(r4, r5)
            X.K9q r0 = r7.A01
            r7.A09(r0, r1, r2)
            int r8 = r8 + 1
            goto L_0x0046
        L_0x007c:
            r7.A07()
            goto L_0x009c
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0085:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerEmojiSheetViewBinder.Holder"
            X.0qQ.A0C(r3, r0)
            X.L3o r3 = (X.C63704L3o) r3
            X.AnonymousClass7TG.A1N(r3, r12)
            boolean r0 = X.AnonymousClass3S1.A04(r13)
            X.9iZ r2 = r3.A00
            if (r0 != 0) goto L_0x00a4
            r2.A01 = r13
        L_0x0099:
            X.C385209iZ.A01(r2)
        L_0x009c:
            java.util.Map r1 = r10.A0A
            java.lang.String r0 = r12.A01
            r1.put(r0, r3)
            return
        L_0x00a4:
            java.util.List r1 = r12.A02
            java.util.List r0 = r2.A0F
            r0.clear()
            r0.addAll(r1)
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZ7.A00(android.view.View, X.LMR, java.util.List, int):void");
    }

    public final int A01(int i, int i2) {
        C63704L3o l3o;
        View AnC;
        Object item = getItem(i2);
        0qQ.A0C(item, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.model.StickerSet");
        Object obj = this.A0A.get(((LMR) item).A01);
        if (!(obj instanceof C63704L3o) || (l3o = (C63704L3o) obj) == null || (AnC = l3o.A01.AnC(i)) == null) {
            return 0;
        }
        return AnC.getHeight();
    }
}
