package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraCapturer;

/* renamed from: X.JlV  reason: case insensitive filesystem */
public final class C60437JlV extends 2Rw {
    public M0V A00;
    public M0S A01;
    public final Context A02;
    public final UserSession A03;
    public final C313666go A04;
    public final MVX A05;
    public final List A06 = AnonymousClass7TE.A1C();
    public final List A07 = AnonymousClass7TE.A1C();
    public final C262224Cq A08;
    public final AnonymousClass0iw A09;
    public final C63683L2t A0A;

    public final void A02(MVW mvw) {
        0qQ.A0B(mvw, 0);
        List list = this.A06;
        if (!list.contains(mvw) && A04(mvw)) {
            int size = CameraCapturer.OPEN_CAMERA_DELAY_MS - list.size();
            if (size < 1) {
                int min = Math.min(list.size(), 1 - size);
                Iterator it = list.iterator();
                Iterator it2 = this.A07.iterator();
                for (int i = 0; i < min; i++) {
                    it.next();
                    it.remove();
                    if (it2.hasNext()) {
                        it2.next();
                        it2.remove();
                    }
                }
                if (min == 1) {
                    notifyItemRemoved(getItemCount() + 1);
                }
            }
            list.add(mvw);
            this.A07.add(getItemCount(), mvw);
            notifyItemInserted(0);
        }
    }

    public final void A03(MVW mvw) {
        0qQ.A0B(mvw, 0);
        List list = this.A07;
        int indexOf = list.indexOf(mvw);
        if (indexOf != -1) {
            list.remove(indexOf);
            this.A06.remove(mvw);
            notifyItemRemoved(A00(this, indexOf) + 1);
        }
    }

    public final boolean A04(MVW mvw) {
        String pk;
        0qQ.A0B(mvw, 0);
        if (mvw.BNP() != C62584KiH.A0A) {
            return true;
        }
        M0V m0v = (M0V) mvw;
        if (!2PP.A00(m0v, this.A00)) {
            C63683L2t l2t = this.A0A;
            0qQ.A0B(m0v, 0);
            User user = m0v.A08;
            if ((user == null || !user.A1w()) && m0v.A07.A00() && !m0v.A0E && ((pk = m0v.getPk()) == null || !C339667jy.A03.A00(l2t.A00).A00.getBoolean(pk, false))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.JpY, X.Kci] */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a8, code lost:
        if (r3.A04 == X.C313666go.A03) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C249703kE onCreateViewHolder(android.view.ViewGroup r4, int r5) {
        /*
            r3 = this;
            r1 = 0
            X.0qQ.A0B(r4, r1)
            X.KiH r0 = X.C62584KiH.A0A
            int r0 = r0.A00
            if (r5 != r0) goto L_0x0025
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r4)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r0 = 2131626795(0x7f0e0b2b, float:1.8880836E38)
            android.view.View r2 = X.DbU.A09(r2, r4, r0, r1)
            X.JpY r1 = new X.JpY
            r1.<init>(r2)
            r4.getWidth()
        L_0x0021:
            r2.setTag(r1)
            return r1
        L_0x0025:
            X.KiH r0 = X.C62584KiH.A0G
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00a4
            X.KiH r0 = X.C62584KiH.A08
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00a4
            X.KiH r0 = X.C62584KiH.A0H
            int r0 = r0.A00
            if (r5 != r0) goto L_0x0044
            X.6go r2 = r3.A04
            X.6go r0 = X.C313666go.VIEWER
            if (r2 == r0) goto L_0x00c0
            java.lang.String r0 = "SingleUserLeft comment type can only be used for viewers."
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0044:
            X.KiH r0 = X.C62584KiH.A0C
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A0O
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A0D
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A0E
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A0N
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A09
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A0M
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A0B
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A05
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A0L
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A0I
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A0F
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A07
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A0J
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            X.KiH r0 = X.C62584KiH.A06
            int r0 = r0.A00
            if (r5 == r0) goto L_0x00aa
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x00a4:
            X.6go r2 = r3.A04
            X.6go r0 = X.C313666go.BROADCASTER
            if (r2 != r0) goto L_0x00c0
        L_0x00aa:
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r4)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r0 = 2131626853(0x7f0e0b65, float:1.8880954E38)
            android.view.View r2 = X.DbU.A09(r2, r4, r0, r1)
            X.UEX r1 = new X.UEX
            r1.<init>(r2)
            goto L_0x0021
        L_0x00c0:
            android.view.LayoutInflater r2 = X.DbV.A0D(r4)
            r0 = 2131626795(0x7f0e0b2b, float:1.8880836E38)
            android.view.View r2 = X.DbU.A09(r2, r4, r0, r1)
            r4.getWidth()
            r0 = 1
            X.0qQ.A0B(r2, r0)
            X.Kci r1 = new X.Kci
            r1.<init>(r2)
            r0 = 2131430512(0x7f0b0c70, float:1.8482727E38)
            X.3Nc r0 = X.C240903Nb.A00(r2, r0)
            r1.A02 = r0
            r0 = 2131430511(0x7f0b0c6f, float:1.8482725E38)
            X.3Nc r0 = X.C240903Nb.A00(r2, r0)
            r1.A01 = r0
            r0 = 2131434350(0x7f0b1b6e, float:1.8490511E38)
            X.3Nc r0 = X.C240903Nb.A00(r2, r0)
            r1.A00 = r0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60437JlV.onCreateViewHolder(android.view.ViewGroup, int):X.3kE");
    }

    public final void A01() {
        List list = this.A07;
        list.clear();
        for (MVW mvw : this.A06) {
            if (A04(mvw)) {
                list.add(mvw);
            }
        }
        notifyDataSetChanged();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.M0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.X84} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.M0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: X.HsR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: X.HsR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.HsR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: com.instagram.common.typedurl.ImageUrl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: com.instagram.common.typedurl.ImageUrl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.X84} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.M0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: com.instagram.common.typedurl.ImageUrl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: X.M0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: X.HsR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: X.M0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.X84} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: X.M0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v10, resolved type: com.instagram.common.typedurl.ImageUrl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: X.M0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: X.M0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: X.M0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: X.M0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: X.M0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: X.M0d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: X.M0d} */
    /* JADX WARNING: type inference failed for: r16v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r10v2, types: [android.view.animation.Animation] */
    /* JADX WARNING: type inference failed for: r8v2, types: [com.instagram.common.typedurl.ImageUrl] */
    /* JADX WARNING: type inference failed for: r8v6, types: [com.instagram.common.typedurl.ImageUrl] */
    /* JADX WARNING: type inference failed for: r8v11, types: [X.HsR] */
    /* JADX WARNING: type inference failed for: r8v21, types: [com.instagram.common.typedurl.ImageUrl] */
    /* JADX WARNING: type inference failed for: r8v24, types: [java.lang.Integer] */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c9, code lost:
        if (r5 != 0) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01cf, code lost:
        if (r5 != 3) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d1, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d2, code lost:
        if (r11 == false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d4, code lost:
        r13 = X.JTP.A0P(2131965456);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01dd, code lost:
        if (r11 == false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01df, code lost:
        r17 = X.C51965G9l.A0E().append("👋");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e7, code lost:
        if (r7 == false) goto L_0x022f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e9, code lost:
        r11 = X.C64179LSh.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ed, code lost:
        r16 = X.C317486nL.A04.A04("👋");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f3, code lost:
        if (r6 == false) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f5, code lost:
        r3 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fa, code lost:
        if (r3 == null) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01fc, code lost:
        r10 = r3.getUsername();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0200, code lost:
        r14 = X.JTR.A0g(r10, 2131965455);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0204, code lost:
        r7 = X.C18537Vtp.A00;
        r5 = (X.UEX) r1;
        r3 = r9.A09;
        r6 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x020d, code lost:
        if (r6 == null) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x020f, code lost:
        r8 = r6.Bh3();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0213, code lost:
        r10 = new X.C18519VtJ(r11, (X.C56078HsR) null, r13, r14, r8, r16, r17, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, r3, (java.lang.String) null);
        r9 = r2.A09;
        r8 = new X.C65812M0e(0, r1, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x022f, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0230, code lost:
        if (r6 != false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0232, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0234, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0236, code lost:
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0239, code lost:
        r13 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x063f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r32, int r33) {
        /*
            r31 = this;
            r1 = r32
            r4 = 0
            r2 = r31
            r0 = r33
            int r5 = X.JTP.A07(r2, r1, r4, r0)
            java.util.List r3 = r2.A07
            int r0 = A00(r2, r0)
            java.lang.Object r0 = r3.get(r0)
            X.MVW r0 = (X.MVW) r0
            X.MVX r7 = r2.A05
            r3 = r7
            X.Kch r3 = (X.C62247Kch) r3
            X.0qQ.A0B(r0, r4)
            X.KdH r10 = r3.A03
            java.util.Set r6 = r10.A0A
            boolean r3 = r6.contains(r0)
            if (r3 != 0) goto L_0x00e8
            r6.add(r0)
            X.0t1 r3 = r10.A05
            com.instagram.user.model.User r6 = r3.A00()
            com.instagram.user.model.User r3 = r0.CCd()
            boolean r3 = X.0qQ.A0K(r6, r3)
            if (r3 != 0) goto L_0x00e8
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r3 = r10.A07
            X.JvD r3 = X.JTQ.A0Q(r3)
            if (r3 == 0) goto L_0x00e8
            X.L5M r8 = r10.A06
            java.lang.String r13 = r3.A09
            java.lang.String r9 = r3.A08
            X.6h4 r3 = r10.A08
            long r14 = r3.A00()
            X.0sn r10 = X.0sn.A00
            X.C51972G9s.A1B(r9, r10)
            com.instagram.common.session.UserSession r6 = r8.A01
            X.0iw r3 = r8.A00
            X.0wc r6 = X.AnonymousClass0kN.A01(r3, r6)
            java.lang.String r3 = "ig_live_comment_impression"
            X.0Aj r8 = X.AnonymousClass7TE.A0e(r6, r3)
            java.lang.String r3 = r0.getPk()
            if (r3 == 0) goto L_0x05f4
            java.lang.Long r3 = X.AnonymousClass7TE.A10(r3)
            if (r3 == 0) goto L_0x05f4
            long r11 = r3.longValue()
        L_0x0073:
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            java.lang.String r3 = "c_pk"
            r8.A9F(r3, r6)
            X.JTQ.A14(r8, r9)
            X.C51965G9l.A1I(r8, r13)
            com.instagram.user.model.User r3 = r0.CCd()
            if (r3 == 0) goto L_0x05f0
            java.lang.String r3 = r3.getId()
        L_0x008c:
            X.4Ny r6 = X.C263944Ny.A00(r3)
            java.lang.String r3 = "ca_pk"
            r8.AAE(r6, r3)
            boolean r11 = r0 instanceof X.M0V
            r9 = 0
            if (r11 == 0) goto L_0x05ed
            r3 = r0
            X.M0V r3 = (X.M0V) r3
            if (r3 == 0) goto L_0x05ed
            java.lang.String r3 = r3.A0C
            if (r3 == 0) goto L_0x05ed
            java.lang.Long r6 = X.AnonymousClass7TE.A10(r3)
        L_0x00a7:
            r3 = 871(0x367, float:1.22E-42)
            java.lang.String r3 = X.C273654mx.A00(r3)
            r8.A9F(r3, r6)
            if (r11 == 0) goto L_0x00c9
            r6 = r0
            X.M0V r6 = (X.M0V) r6
            if (r6 == 0) goto L_0x00c9
            java.lang.Boolean r3 = r6.A09
            if (r3 == 0) goto L_0x05e9
            boolean r9 = r3.booleanValue()
        L_0x00bf:
            boolean r3 = r6.A0F
            if (r9 != r3) goto L_0x05df
            int r6 = r6.A02
        L_0x00c5:
            java.lang.Long r9 = X.DbS.A0j(r6)
        L_0x00c9:
            java.lang.String r3 = "like_count"
            r8.A9F(r3, r9)
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            java.lang.String r3 = "live_position"
            r8.A9F(r3, r6)
            java.lang.String r3 = "friend_chat_ids"
            r8.AAe(r3, r10)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            java.lang.String r3 = "is_from_pill"
            r8.A7p(r3, r6)
            r8.Cgf()
        L_0x00e8:
            X.KiH r3 = X.C62584KiH.A0A
            int r3 = r3.A00
            if (r5 != r3) goto L_0x0104
            X.LEV r5 = X.C63562KzB.A01
            X.JpY r1 = (X.C60687JpY) r1
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.datasource.apimodel.IgLiveNormalComment"
            X.0qQ.A0C(r0, r3)
            X.M0V r0 = (X.M0V) r0
            X.0iw r2 = r2.A09
            r8 = r7
            r9 = r1
            r10 = r4
            r6 = r2
            r7 = r0
            r5.A00(r6, r7, r8, r9, r10)
        L_0x0103:
            return
        L_0x0104:
            X.KiH r3 = X.C62584KiH.A0C
            int r3 = r3.A00
            if (r5 != r3) goto L_0x0138
            X.Vtp r4 = X.C18537Vtp.A00
            X.UEX r1 = (X.UEX) r1
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.video.live.mvvm.model.domainmodel.comment.IgLiveNuxComment"
            X.0qQ.A0C(r0, r3)
            X.M0Q r0 = (X.M0Q) r0
            java.lang.String r3 = r0.A02
            r6 = 0
            r0 = 2131238462(0x7f081e3e, float:1.8093203E38)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            X.VtJ r5 = new X.VtJ
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r15 = r6
            r16 = r6
            r18 = r6
            r17 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.0iw r0 = r2.A09
            r4.A00(r0, r5, r6, r1)
            return
        L_0x0138:
            X.KiH r12 = X.C62584KiH.A0G
            int r14 = r12.A00
            r16 = 3
            r15 = 7
            r6 = 2
            r9 = 6
            java.lang.String r10 = ""
            r3 = 1
            r11 = 5
            r8 = 0
            if (r5 == r14) goto L_0x01b1
            X.KiH r13 = X.C62584KiH.A08
            int r13 = r13.A00
            if (r5 == r13) goto L_0x01b1
            X.KiH r13 = X.C62584KiH.A0H
            int r13 = r13.A00
            if (r5 != r13) goto L_0x023b
            boolean r5 = r0 instanceof X.M0U
            if (r5 == 0) goto L_0x0103
            r9 = r0
            X.M0U r9 = (X.M0U) r9
            if (r9 == 0) goto L_0x0103
        L_0x015d:
            X.0iw r6 = r2.A09
            X.Kci r1 = (X.C62248Kci) r1
            X.0qQ.A0B(r1, r3)
            X.LEV r2 = X.C63562KzB.A01
            java.lang.String r0 = r9.A09
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x062f
            r2.A01(r9, r7, r1, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r1.A0A
            com.instagram.user.model.User r0 = r9.A04
            if (r0 == 0) goto L_0x062a
            X.DbU.A1S(r6, r2, r0)
            X.KiH r0 = r9.BNP()
            if (r0 != r12) goto L_0x0103
            int r0 = r9.A00
            java.lang.String r5 = "👋"
            if (r0 == 0) goto L_0x05f8
            if (r0 != r3) goto L_0x0103
            X.3Nc r3 = r1.A01
            android.view.View r2 = r3.A00()
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            X.7fS r0 = X.C317486nL.A04
            com.instagram.common.typedurl.SimpleImageUrl r0 = r0.A04(r5)
            r2.setUrl(r0, r6)
            android.view.View r0 = r3.A00()
            r0.setVisibility(r4)
            android.view.View r0 = r3.A00()
            X.5nL r2 = X.C64179LSh.A01(r0)
            X.LyY r0 = new X.LyY
            r0.<init>(r11, r9, r1)
            r2.A05 = r0
            r2.A0H()
            return
        L_0x01b1:
            boolean r9 = r0 instanceof X.M0U
            if (r9 == 0) goto L_0x0103
            r9 = r0
            X.M0U r9 = (X.M0U) r9
            if (r9 == 0) goto L_0x0103
            X.6go r15 = r2.A04
            X.6go r13 = X.C313666go.BROADCASTER
            if (r15 != r13) goto L_0x015d
            if (r5 != r14) goto L_0x0634
            int r5 = r9.A00
            r11 = 1
            if (r5 == r6) goto L_0x01cb
            r11 = 0
            r7 = 1
            if (r5 == 0) goto L_0x01d1
        L_0x01cb:
            r7 = 0
            r6 = 1
            r3 = r16
            if (r5 == r3) goto L_0x01d2
        L_0x01d1:
            r6 = 0
        L_0x01d2:
            if (r11 == 0) goto L_0x0239
            r3 = 2131965456(0x7f133610, float:1.9567722E38)
            X.HsR r13 = X.JTP.A0P(r3)
        L_0x01db:
            java.lang.String r5 = "👋"
            if (r11 == 0) goto L_0x0236
            android.text.SpannableStringBuilder r3 = X.C51965G9l.A0E()
            android.text.SpannableStringBuilder r17 = r3.append(r5)
        L_0x01e7:
            if (r7 == 0) goto L_0x022f
            android.view.animation.RotateAnimation r11 = X.C64179LSh.A00()
        L_0x01ed:
            X.7fS r3 = X.C317486nL.A04
            com.instagram.common.typedurl.SimpleImageUrl r16 = r3.A04(r5)
            if (r6 == 0) goto L_0x0234
            r5 = 2131965455(0x7f13360f, float:1.956772E38)
            com.instagram.user.model.User r3 = r9.A04
            if (r3 == 0) goto L_0x0200
            java.lang.String r10 = r3.getUsername()
        L_0x0200:
            X.HsR r14 = X.JTR.A0g(r10, r5)
        L_0x0204:
            X.Vtp r7 = X.C18537Vtp.A00
            r5 = r1
            X.UEX r5 = (X.UEX) r5
            java.lang.String r3 = r9.A09
            com.instagram.user.model.User r6 = r9.A04
            if (r6 == 0) goto L_0x0213
            com.instagram.common.typedurl.ImageUrl r8 = r6.Bh3()
        L_0x0213:
            r12 = 0
            X.VtJ r10 = new X.VtJ
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r3
            r23 = r12
            r15 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.0iw r9 = r2.A09
            X.M0e r8 = new X.M0e
            r8.<init>(r4, r1, r0, r2)
            goto L_0x02b6
        L_0x022f:
            r11 = r8
            if (r6 != 0) goto L_0x01ed
            r16 = r8
        L_0x0234:
            r14 = r8
            goto L_0x0204
        L_0x0236:
            r17 = r8
            goto L_0x01e7
        L_0x0239:
            r13 = r8
            goto L_0x01db
        L_0x023b:
            X.KiH r7 = X.C62584KiH.A0D
            int r7 = r7.A00
            if (r5 == r7) goto L_0x0347
            X.KiH r7 = X.C62584KiH.A0E
            int r7 = r7.A00
            if (r5 == r7) goto L_0x0347
            X.KiH r7 = X.C62584KiH.A0N
            int r7 = r7.A00
            if (r5 == r7) goto L_0x0347
            X.KiH r7 = X.C62584KiH.A09
            int r7 = r7.A00
            if (r5 != r7) goto L_0x0301
            boolean r4 = r0 instanceof X.M0T
            if (r4 == 0) goto L_0x0103
            X.M0T r0 = (X.M0T) r0
            if (r0 == 0) goto L_0x0103
            X.Vtp r7 = X.C18537Vtp.A00
            r5 = r1
            X.UEX r5 = (X.UEX) r5
            X.6go r4 = r2.A04
            X.6go r1 = X.C313666go.VIEWER
            if (r4 != r1) goto L_0x02ba
            r6 = 2131238361(0x7f081dd9, float:1.8092999E38)
            boolean r1 = r0.A03
            r4 = 2131965427(0x7f1335f3, float:1.9567664E38)
            if (r1 == 0) goto L_0x0273
            r4 = 2131965434(0x7f1335fa, float:1.9567678E38)
        L_0x0273:
            com.instagram.user.model.User r1 = r0.A01
            if (r1 == 0) goto L_0x027b
            java.lang.String r10 = r1.getUsername()
        L_0x027b:
            X.HsR r19 = X.JTR.A0g(r10, r4)
            com.instagram.api.schemas.LiveUserPaySupportTier r0 = r0.A00
            if (r0 == 0) goto L_0x0287
            java.lang.Integer r8 = X.LKL.A00(r0, r3)
        L_0x0287:
            r0 = 2131965418(0x7f1335ea, float:1.9567645E38)
            X.HsR r20 = X.JTP.A0P(r0)
            r18 = 0
            java.lang.Integer r26 = java.lang.Integer.valueOf(r6)
            X.VtJ r10 = new X.VtJ
            r17 = r10
            r21 = r18
            r22 = r18
            r23 = r18
            r24 = r18
            r25 = r8
            r27 = r18
            r28 = r18
            r29 = r18
            r30 = r18
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x02ad:
            X.0iw r9 = r2.A09
            X.M0c r8 = new X.M0c
            r0 = r16
            r8.<init>(r2, r0)
        L_0x02b6:
            r7.A00(r9, r10, r8, r5)
            return
        L_0x02ba:
            boolean r1 = r0.A03
            r4 = 2131965427(0x7f1335f3, float:1.9567664E38)
            if (r1 == 0) goto L_0x02c4
            r4 = 2131965434(0x7f1335fa, float:1.9567678E38)
        L_0x02c4:
            com.instagram.user.model.User r1 = r0.A01
            if (r1 == 0) goto L_0x02cc
            java.lang.String r10 = r1.getUsername()
        L_0x02cc:
            X.HsR r19 = X.JTR.A0g(r10, r4)
            com.instagram.api.schemas.LiveUserPaySupportTier r1 = r0.A00
            if (r1 == 0) goto L_0x02fe
            java.lang.Integer r25 = X.LKL.A00(r1, r3)
        L_0x02d8:
            com.instagram.user.model.User r0 = r0.A01
            if (r0 == 0) goto L_0x02e0
            com.instagram.common.typedurl.ImageUrl r8 = r0.Bh3()
        L_0x02e0:
            r18 = 0
            X.VtJ r10 = new X.VtJ
            r17 = r10
            r20 = r18
            r21 = r18
            r22 = r8
            r23 = r18
            r24 = r18
            r26 = r18
            r27 = r18
            r28 = r18
            r29 = r18
            r30 = r18
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x02ad
        L_0x02fe:
            r25 = r8
            goto L_0x02d8
        L_0x0301:
            X.KiH r7 = X.C62584KiH.A0M
            int r7 = r7.A00
            if (r5 != r7) goto L_0x0394
            boolean r3 = r0 instanceof X.M0U
            if (r3 == 0) goto L_0x0103
            X.M0U r0 = (X.M0U) r0
            if (r0 == 0) goto L_0x0103
            X.Vtp r5 = X.C18537Vtp.A00
            X.UEX r1 = (X.UEX) r1
            java.lang.String r4 = r0.A09
            r0 = 2131238361(0x7f081dd9, float:1.8092999E38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            android.content.Context r3 = r2.A02
            r0 = 2130970242(0x7f040682, float:1.7549189E38)
            int r0 = X.2Yu.A0H(r3, r0)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            X.VtJ r3 = new X.VtJ
            r6 = r3
            r7 = r8
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r18 = r4
            r19 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.0iw r0 = r2.A09
            r5.A00(r0, r3, r8, r1)
            return
        L_0x0347:
            X.Vtp r7 = X.C18537Vtp.A00
            r5 = r1
            X.UEX r5 = (X.UEX) r5
            java.lang.String r23 = r0.getText()
            r12 = 0
            r1 = 2131238984(0x7f082048, float:1.8094262E38)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r1)
            X.KiH r1 = r0.BNP()
            int r4 = r1.ordinal()
            if (r4 == r11) goto L_0x0390
            if (r4 == r9) goto L_0x038c
            if (r4 != r15) goto L_0x036d
            r1 = 2131965473(0x7f133621, float:1.9567757E38)
        L_0x0369:
            X.HsR r8 = X.JTP.A0P(r1)
        L_0x036d:
            X.VtJ r10 = new X.VtJ
            r11 = r10
            r13 = r12
            r14 = r8
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r21 = r12
            r22 = r12
            r24 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.0iw r9 = r2.A09
            X.M0d r8 = new X.M0d
            r8.<init>(r3, r0, r2)
            goto L_0x03d2
        L_0x038c:
            r1 = 2131965469(0x7f13361d, float:1.9567749E38)
            goto L_0x0369
        L_0x0390:
            r1 = 2131965467(0x7f13361b, float:1.9567745E38)
            goto L_0x0369
        L_0x0394:
            X.KiH r7 = X.C62584KiH.A0B
            int r7 = r7.A00
            if (r5 != r7) goto L_0x03d6
            boolean r4 = r0 instanceof X.M0U
            if (r4 == 0) goto L_0x0103
            r6 = r0
            X.M0U r6 = (X.M0U) r6
            if (r6 == 0) goto L_0x0103
            X.Vtp r7 = X.C18537Vtp.A00
            r5 = r1
            X.UEX r5 = (X.UEX) r5
            java.lang.String r4 = r6.A09
            r1 = 2131237859(0x7f081be3, float:1.809198E38)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = r6.A07
            X.VtJ r10 = new X.VtJ
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r20 = r8
            r21 = r8
            r22 = r4
            r23 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.0iw r9 = r2.A09
            X.M0e r8 = new X.M0e
            r8.<init>(r3, r6, r0, r2)
        L_0x03d2:
            X.X84 r8 = (X.X84) r8
            goto L_0x02b6
        L_0x03d6:
            X.KiH r7 = X.C62584KiH.A07
            int r7 = r7.A00
            if (r5 != r7) goto L_0x041e
            boolean r3 = r0 instanceof X.M0U
            if (r3 == 0) goto L_0x0103
            r3 = r0
            X.M0U r3 = (X.M0U) r3
            if (r3 == 0) goto L_0x0103
            X.Vtp r7 = X.C18537Vtp.A00
            r5 = r1
            X.UEX r5 = (X.UEX) r5
            java.lang.String r4 = r3.A09
            r1 = 2131238777(0x7f081f79, float:1.8093842E38)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r1)
            android.content.Context r1 = r2.A02
            android.content.res.Resources r3 = r1.getResources()
            r1 = 2131965132(0x7f1334cc, float:1.9567065E38)
            java.lang.String r23 = r3.getString(r1)
            X.VtJ r10 = new X.VtJ
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r20 = r8
            r21 = r8
            r22 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.0iw r9 = r2.A09
            X.M0d r8 = new X.M0d
            r8.<init>(r6, r0, r2)
            goto L_0x03d2
        L_0x041e:
            X.KiH r7 = X.C62584KiH.A05
            int r7 = r7.A00
            if (r5 != r7) goto L_0x045e
            boolean r3 = r0 instanceof X.M0U
            if (r3 == 0) goto L_0x0103
            r4 = r0
            X.M0U r4 = (X.M0U) r4
            if (r4 == 0) goto L_0x0103
            X.Vtp r7 = X.C18537Vtp.A00
            r5 = r1
            X.UEX r5 = (X.UEX) r5
            java.lang.String r3 = r4.A09
            r1 = 2131237859(0x7f081be3, float:1.809198E38)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = r4.A07
            X.VtJ r10 = new X.VtJ
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r20 = r8
            r21 = r8
            r22 = r3
            r23 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.0iw r9 = r2.A09
            X.M0e r8 = new X.M0e
            r8.<init>(r6, r4, r0, r2)
            goto L_0x03d2
        L_0x045e:
            X.KiH r7 = X.C62584KiH.A0L
            int r7 = r7.A00
            if (r5 != r7) goto L_0x0477
            boolean r3 = r0 instanceof X.M0U
            if (r3 == 0) goto L_0x0103
            X.M0U r0 = (X.M0U) r0
            if (r0 == 0) goto L_0x0103
            X.Vtp r6 = X.C18537Vtp.A00
            X.UEX r1 = (X.UEX) r1
            java.lang.String r5 = r0.A09
            r4 = 0
            com.instagram.user.model.User r0 = r0.A04
            goto L_0x063d
        L_0x0477:
            X.KiH r7 = X.C62584KiH.A0O
            int r7 = r7.A00
            if (r5 != r7) goto L_0x04ad
            boolean r3 = r0 instanceof X.M0U
            if (r3 == 0) goto L_0x0103
            X.M0U r0 = (X.M0U) r0
            if (r0 == 0) goto L_0x0103
            X.Vtp r5 = X.C18537Vtp.A00
            X.UEX r1 = (X.UEX) r1
            java.lang.String r4 = r0.A09
            r0 = 2131238462(0x7f081e3e, float:1.8093203E38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            X.VtJ r3 = new X.VtJ
            r6 = r3
            r7 = r8
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r16 = r8
            r17 = r8
            r18 = r4
            r19 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.0iw r0 = r2.A09
            r5.A00(r0, r3, r8, r1)
            return
        L_0x04ad:
            X.KiH r7 = X.C62584KiH.A0I
            int r7 = r7.A00
            if (r5 != r7) goto L_0x0509
            boolean r5 = r0 instanceof X.M0U
            if (r5 == 0) goto L_0x0103
            X.M0U r0 = (X.M0U) r0
            if (r0 == 0) goto L_0x0103
            X.6go r6 = r2.A04
            X.6go r5 = X.C313666go.VIEWER
            if (r6 == r5) goto L_0x04c2
            r3 = 0
        L_0x04c2:
            X.Vtp r9 = X.C18537Vtp.A00
            X.UEX r1 = (X.UEX) r1
            java.lang.String r7 = r0.A09
            com.instagram.user.model.User r5 = r0.A04
            if (r5 == 0) goto L_0x0507
            com.instagram.common.typedurl.ImageUrl r15 = r5.Bh3()
        L_0x04d0:
            if (r3 == 0) goto L_0x0504
            android.content.Context r5 = r2.A02
            android.content.res.Resources r6 = r5.getResources()
            r5 = 2131965473(0x7f133621, float:1.9567757E38)
            java.lang.String r23 = r6.getString(r5)
        L_0x04df:
            X.VtJ r6 = new X.VtJ
            r10 = r6
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r8
            r20 = r8
            r21 = r8
            r22 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.0iw r5 = r2.A09
            if (r3 == 0) goto L_0x0500
            X.M0d r8 = new X.M0d
            r8.<init>(r4, r0, r2)
        L_0x0500:
            r9.A00(r5, r6, r8, r1)
            return
        L_0x0504:
            r23 = r8
            goto L_0x04df
        L_0x0507:
            r15 = r8
            goto L_0x04d0
        L_0x0509:
            X.KiH r7 = X.C62584KiH.A0F
            int r7 = r7.A00
            if (r5 != r7) goto L_0x0554
            X.Vtp r7 = X.C18537Vtp.A00
            r5 = r1
            X.UEX r5 = (X.UEX) r5
            java.lang.String r22 = r0.getText()
            r0 = 2131238202(0x7f081d3a, float:1.8092676E38)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            android.content.Context r1 = r2.A02
            int r0 = X.2Yu.A05(r1)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            r0 = 2131237803(0x7f081bab, float:1.8091867E38)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131965383(0x7f1335c7, float:1.9567574E38)
            java.lang.String r23 = r1.getString(r0)
            X.VtJ r10 = new X.VtJ
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.0iw r9 = r2.A09
            X.M0c r8 = new X.M0c
            r8.<init>(r2, r4)
            goto L_0x02b6
        L_0x0554:
            X.KiH r4 = X.C62584KiH.A06
            int r4 = r4.A00
            if (r5 != r4) goto L_0x0594
            X.Vtp r7 = X.C18537Vtp.A00
            r5 = r1
            X.UEX r5 = (X.UEX) r5
            java.lang.String r22 = r0.getText()
            r0 = 2131238961(0x7f082031, float:1.8094215E38)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            android.content.Context r0 = r2.A02
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131963901(0x7f132ffd, float:1.9564568E38)
            java.lang.String r23 = r1.getString(r0)
            X.VtJ r10 = new X.VtJ
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r20 = r8
            r21 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.0iw r9 = r2.A09
            X.M0c r8 = new X.M0c
            r8.<init>(r2, r3)
            goto L_0x02b6
        L_0x0594:
            X.KiH r3 = X.C62584KiH.A0J
            int r3 = r3.A00
            if (r5 != r3) goto L_0x0103
            X.Vtp r7 = X.C18537Vtp.A00
            r5 = r1
            X.UEX r5 = (X.UEX) r5
            java.lang.String r22 = r0.getText()
            r0 = 2131238331(0x7f081dbb, float:1.8092938E38)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r0)
            android.content.Context r1 = r2.A02
            int r0 = X.2Yu.A05(r1)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)
            r0 = 2131237804(0x7f081bac, float:1.8091869E38)
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131965388(0x7f1335cc, float:1.9567584E38)
            java.lang.String r23 = r1.getString(r0)
            X.VtJ r10 = new X.VtJ
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.0iw r9 = r2.A09
            X.M0c r8 = new X.M0c
            r8.<init>(r2, r6)
            goto L_0x02b6
        L_0x05df:
            int r3 = r6.A02
            int r6 = r3 + -1
            if (r9 == 0) goto L_0x00c5
            int r6 = r3 + 1
            goto L_0x00c5
        L_0x05e9:
            boolean r9 = r6.A0F
            goto L_0x00bf
        L_0x05ed:
            r6 = r9
            goto L_0x00a7
        L_0x05f0:
            java.lang.String r3 = "0"
            goto L_0x008c
        L_0x05f4:
            r11 = 0
            goto L_0x0073
        L_0x05f8:
            X.3Nc r3 = r1.A01
            android.view.View r2 = r3.A00()
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            X.7fS r0 = X.C317486nL.A04
            com.instagram.common.typedurl.SimpleImageUrl r0 = r0.A04(r5)
            r2.setUrl(r0, r6)
            android.view.View r0 = r3.A00()
            r0.setVisibility(r4)
            java.lang.String r3 = r9.A08
            android.widget.TextView r2 = r1.A08
            java.lang.String r0 = r9.A09
            r2.setText(r0)
            android.widget.TextView r0 = r1.A07
            r0.setText(r3)
            r2.setVisibility(r4)
            r0.setVisibility(r4)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r2.setTypeface(r0)
            return
        L_0x062a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x062f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r5)
            throw r0
        L_0x0634:
            X.Vtp r6 = X.C18537Vtp.A00
            X.UEX r1 = (X.UEX) r1
            java.lang.String r5 = r9.A09
            r4 = 0
            com.instagram.user.model.User r0 = r9.A04
        L_0x063d:
            if (r0 == 0) goto L_0x0643
            com.instagram.common.typedurl.ImageUrl r8 = r0.Bh3()
        L_0x0643:
            X.VtJ r3 = new X.VtJ
            r11 = r4
            r12 = r4
            r13 = r4
            r15 = r4
            r16 = r4
            r17 = r4
            r18 = r4
            r19 = r4
            r20 = r4
            r21 = r5
            r22 = r4
            r9 = r3
            r10 = r4
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.0iw r0 = r2.A09
            r6.A00(r0, r3, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60437JlV.onBindViewHolder(X.3kE, int):void");
    }

    public C60437JlV(Context context, AnonymousClass0iw r3, UserSession userSession, C313666go r5, MVX mvx, C63683L2t l2t, C262224Cq r8) {
        this.A02 = context;
        this.A05 = mvx;
        this.A0A = l2t;
        this.A03 = userSession;
        this.A04 = r5;
        this.A08 = r8;
        this.A09 = r3;
    }

    public static final int A00(C60437JlV jlV, int i) {
        if (jlV.getItemCount() == 0) {
            return 0;
        }
        return (jlV.getItemCount() - i) - 1;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-653464609);
        int size = this.A07.size();
        AnonymousClass0fD.A0A(-1201739210, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(746728087);
        int i2 = ((MVW) this.A07.get(A00(this, i))).BNP().A00;
        AnonymousClass0fD.A0A(65023319, A032);
        return i2;
    }
}
