package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import com.instagram.model.reels.Reel;
import com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.34h  reason: invalid class name and case insensitive filesystem */
public final class C2365834h extends C2365934i {
    public int A00 = 0;
    public AnonymousClass3O9 A01;
    public C230212pD A02;
    public C228112ko A03;
    public C296845qj A04;
    public C293245kP A05;
    public AnonymousClass2sE A06;
    public Integer A07;
    public Integer A08;
    public String A09;
    public final UserSession A0A;
    public final C2366434n A0B;
    public final C230242pG A0C;
    public final boolean A0D;
    public final Context A0E;
    public final C2366234l A0F = new C2366134k(this);
    public final AnonymousClass0iw A0G;
    public final AnonymousClass34Y A0H;
    public final C2365534e A0I;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.5BC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: X.5BC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: X.3N1} */
    /* JADX WARNING: type inference failed for: r2v22, types: [X.Dn9, X.3kE] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C249703kE onCreateViewHolder(android.view.ViewGroup r11, int r12) {
        /*
            r10 = this;
            r0 = 6
            if (r12 != r0) goto L_0x003b
            android.content.Context r0 = r11.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            java.lang.Integer r0 = r10.A08
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0037
            r0 = 5
            if (r1 == r0) goto L_0x0037
            r0 = 1
            if (r1 == r0) goto L_0x0033
            r0 = 4
            if (r1 == r0) goto L_0x0033
            r0 = 2
            if (r1 == r0) goto L_0x0033
            java.lang.String r1 = "MainFeedTrayAdapter"
            java.lang.String r0 = "Tried to get loading spinner for invalid tray type"
            X.0wb.A03(r1, r0)
            r1 = -1
        L_0x0028:
            r0 = 0
            android.view.View r0 = r2.inflate(r1, r11, r0)
            X.3ux r2 = new X.3ux
            r2.<init>(r0)
        L_0x0032:
            return r2
        L_0x0033:
            r1 = 2131628821(0x7f0e1315, float:1.8884945E38)
            goto L_0x0028
        L_0x0037:
            r1 = 2131628901(0x7f0e1365, float:1.8885108E38)
            goto L_0x0028
        L_0x003b:
            r0 = 9
            if (r12 != r0) goto L_0x00c7
            android.content.Context r3 = r11.getContext()
            com.instagram.common.session.UserSession r5 = r10.A0A
            X.5kP r0 = r10.A05
            r0.getClass()
            int r4 = r0.CEq()
            r0 = 1
            if (r4 == r0) goto L_0x00a7
            r0 = 2
            if (r4 == r0) goto L_0x00a7
            r2 = 0
            X.0qQ.A0B(r3, r2)
            r0 = 1
            X.0qQ.A0B(r5, r0)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131628899(0x7f0e1363, float:1.8885104E38)
            android.view.View r1 = r1.inflate(r0, r11, r2)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0qQ.A0A(r1)
            r0 = 3
            X.0qQ.A0B(r1, r0)
            X.Dn9 r2 = new X.Dn9
            r2.<init>(r1)
            r2.A00 = r3
            r2.A01 = r5
            r0 = 2131432410(0x7f0b13da, float:1.8486577E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A07(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r2.A03 = r0
            r0 = 2131432411(0x7f0b13db, float:1.8486579E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A07(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r2.A04 = r0
            r0 = 2131432409(0x7f0b13d9, float:1.8486575E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.0qQ.A07(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r2.A02 = r0
        L_0x00a3:
            r1.setTag(r2)
            return r2
        L_0x00a7:
            r2 = 0
            X.0qQ.A0B(r3, r2)
            r0 = 2
            r1 = 2131629871(0x7f0e172f, float:1.8887075E38)
            if (r4 != r0) goto L_0x00b4
            r1 = 2131625980(0x7f0e07fc, float:1.8879183E38)
        L_0x00b4:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r3)
            android.view.View r1 = r0.inflate(r1, r11, r2)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0qQ.A0A(r1)
            X.Dp0 r2 = new X.Dp0
            r2.<init>(r1)
            goto L_0x00a3
        L_0x00c7:
            r0 = 13
            if (r12 != r0) goto L_0x00e9
            android.content.Context r0 = r11.getContext()
            r2 = 0
            X.0qQ.A0B(r0, r2)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131628807(0x7f0e1307, float:1.8884917E38)
            android.view.View r1 = r1.inflate(r0, r11, r2)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0qQ.A0A(r1)
            X.9Yg r2 = new X.9Yg
            r2.<init>(r1)
            goto L_0x00a3
        L_0x00e9:
            r0 = 12
            if (r12 != r0) goto L_0x0126
            android.content.Context r5 = r11.getContext()
            com.instagram.common.session.UserSession r4 = r10.A0A
            X.0iw r3 = r10.A0G
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 2
            X.0qQ.A0B(r4, r0)
            r0 = 3
            X.0qQ.A0B(r3, r0)
            r2 = 0
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131625938(0x7f0e07d2, float:1.8879098E38)
            android.view.View r1 = r1.inflate(r0, r11, r2)
            X.0qQ.A07(r1)
            r0 = 2131433710(0x7f0b18ee, float:1.8489213E38)
            android.view.View r0 = r1.findViewById(r0)
            X.0qQ.A07(r0)
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r0 = (com.instagram.igds.components.faceswarm.IgdsFaceSwarm) r0
            X.C49099EpO.A00(r5, r3, r4, r0)
            X.9Yf r2 = new X.9Yf
            r2.<init>(r1)
            goto L_0x00a3
        L_0x0126:
            com.instagram.common.session.UserSession r4 = r10.A0A
            X.3BQ r7 = r10.A01()
            X.2sE r1 = r10.A06
            X.34e r3 = r10.A0I
            r0 = 2
            if (r12 == r0) goto L_0x0183
            r0 = 3
            if (r12 == r0) goto L_0x01d8
            r0 = 4
            if (r12 == r0) goto L_0x01d9
            r0 = 5
            if (r12 == r0) goto L_0x01d8
            r0 = 7
            if (r12 == r0) goto L_0x01d9
            r0 = 10
            if (r12 == r0) goto L_0x0177
            r0 = 11
            if (r12 == r0) goto L_0x01ba
            android.content.Context r0 = r11.getContext()
            X.3N1 r2 = X.AnonymousClass3Mc.A00(r0, r11, r4)
            if (r3 == 0) goto L_0x0032
            r0 = 0
        L_0x0152:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView r0 = r2.A03
            X.3N0 r0 = r0.getHolder()
            X.C2365534e.A06(r3, r0, r1)
            X.3N5 r1 = r2.A02
            X.3N8 r0 = r1.A05
            X.C2365534e.A05(r3, r0)
            X.3N6 r0 = r1.A02
            android.widget.LinearLayout r1 = r0.A05
            int r0 = r3.A0B
            X.0nA.A0X(r1, r0)
            android.view.View r0 = r2.AeH()
        L_0x0173:
            X.C2365534e.A02(r0, r3)
            return r2
        L_0x0177:
            android.content.Context r0 = r11.getContext()
            X.3N1 r2 = X.AnonymousClass3Mc.A00(r0, r11, r4)
            if (r3 == 0) goto L_0x0032
            r0 = 1
            goto L_0x0152
        L_0x0183:
            android.content.Context r0 = r11.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131628805(0x7f0e1305, float:1.8884913E38)
            r0 = 0
            android.view.View r0 = r2.inflate(r1, r11, r0)
            X.5BC r2 = new X.5BC
            r2.<init>(r0)
            r0.setTag(r2)
            if (r3 == 0) goto L_0x0032
            X.5BD r0 = r2.A00
            X.C2365534e.A04(r3, r0)
            X.C2365534e.A03(r3, r0)
            X.3N5 r1 = r2.A01
            X.3N8 r0 = r1.A05
            X.C2365534e.A05(r3, r0)
            X.3N6 r0 = r1.A02
            android.widget.LinearLayout r1 = r0.A05
            int r0 = r3.A0B
            X.0nA.A0X(r1, r0)
            android.view.View r0 = r2.AeH()
            goto L_0x0173
        L_0x01ba:
            android.content.Context r0 = r11.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131629698(0x7f0e1682, float:1.8886724E38)
            r0 = 0
            android.view.View r0 = r2.inflate(r1, r11, r0)
            X.Jpv r2 = new X.Jpv
            r2.<init>(r0)
            r0.setTag(r2)
            if (r3 == 0) goto L_0x0032
            r3.A09(r2)
            return r2
        L_0x01d8:
            r4 = 0
        L_0x01d9:
            android.content.Context r9 = r11.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r9)
            if (r1 == 0) goto L_0x025c
            java.util.Queue r0 = r1.A03
            java.lang.Object r5 = r0.poll()
            android.view.View r5 = (android.view.View) r5
        L_0x01eb:
            r0 = 1
            r2 = 0
            if (r5 != 0) goto L_0x01f6
            r1 = 2131628814(0x7f0e130e, float:1.8884931E38)
            android.view.View r5 = r6.inflate(r1, r11, r2)
        L_0x01f6:
            X.0qQ.A0B(r5, r2)
            X.0qQ.A0B(r9, r0)
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            if (r1 != 0) goto L_0x0237
            android.content.res.Resources r2 = r9.getResources()
            r1 = 2131165258(0x7f07004a, float:1.7944728E38)
            int r8 = r2.getDimensionPixelSize(r1)
            android.content.res.Resources r2 = r9.getResources()
            r1 = 2131165369(0x7f0700b9, float:1.7944953E38)
            int r1 = r2.getDimensionPixelSize(r1)
            X.3MX r6 = new X.3MX
            r6.<init>((int) r1, (int) r8)
            android.content.res.Resources r1 = r9.getResources()
            r2 = 2131165293(0x7f07006d, float:1.79448E38)
            int r1 = r1.getDimensionPixelSize(r2)
            r6.leftMargin = r1
            android.content.res.Resources r1 = r9.getResources()
            int r1 = r1.getDimensionPixelSize(r2)
            r6.rightMargin = r1
            r5.setLayoutParams(r6)
        L_0x0237:
            X.3BQ r1 = X.AnonymousClass3BQ.IN_FEED_HIGHLIGHTS_TRAY
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x024c
            if (r4 == 0) goto L_0x025a
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324286474104769(0x810cbf00022fc1, double:3.0349632601607927E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
        L_0x024c:
            X.3Nw r2 = new X.3Nw
            r2.<init>(r5, r0)
            r5.setTag(r2)
            if (r3 == 0) goto L_0x0032
            r3.A08(r2)
            return r2
        L_0x025a:
            r0 = 0
            goto L_0x024c
        L_0x025c:
            r5 = 0
            goto L_0x01eb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2365834h.onCreateViewHolder(android.view.ViewGroup, int):X.3kE");
    }

    public final boolean A04() {
        if (this.A08 == AnonymousClass05K.A00) {
            UserSession userSession = this.A0A;
            0qQ.A0B(userSession, 0);
            if (!182.A06(0Tu.A05, userSession, 36320313631645948L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C2366234l r1 = this.A0F;
        List list = recyclerView.A0L;
        if (list == null) {
            list = new ArrayList();
            recyclerView.A0L = list;
        }
        list.add(r1);
    }

    public final void onBindViewHolder(C249703kE r44, int i) {
        AnonymousClass3BT r10;
        1Xj r102;
        View view;
        SegmentedProgressBar segmentedProgressBar;
        C69058Ndv ndv;
        View view2;
        RecyclerReelAvatarView recyclerReelAvatarView;
        int i2;
        String string;
        AnonymousClass3BQ r3;
        C255773uh A092;
        ImageUrl A072;
        int i3 = i;
        C249703kE r8 = r44;
        int itemViewType = getItemViewType(i3);
        if (itemViewType == 6) {
            C255933ux r1 = (C255933ux) r8;
            C228112ko r0 = this.A03;
            if (r0 != null) {
                r1.A00(r0);
            }
        } else if (itemViewType == 9) {
            C230242pG r5 = this.A0C;
            String str = this.A09;
            C293245kP r13 = this.A05;
            r13.getClass();
            AnonymousClass3BT r12 = (AnonymousClass3BT) this.A04.get(i3);
            FNW fnw = new FNW(r8, this, i3);
            UserSession userSession = this.A0A;
            AnonymousClass0iw r9 = this.A0G;
            if (r12 != null) {
                r3 = r12.A04;
            } else {
                r3 = null;
            }
            int CEq = r13.CEq();
            if (CEq == 1 || CEq == 2) {
                C249703kE r52 = r8;
                0qQ.A0B(r8, 0);
                0qQ.A0B(userSession, 4);
                0qQ.A0B(r9, 6);
                if (r3 != null) {
                    Context context = r8.itemView.getContext();
                    0qQ.A07(context);
                    AnonymousClass9I1 A002 = C294555me.A00(context, userSession, r3);
                    if (A002 != null) {
                        View view3 = r8.itemView;
                        0qQ.A06(view3);
                        0nA.A0g(view3, A002.A01, A002.A00);
                    }
                }
                XBz xBz = (XBz) r13;
                C47008Dp0 dp0 = (C47008Dp0) r52;
                List B3d = xBz.B3d();
                if (B3d != null && B3d.size() >= 3) {
                    AnonymousClass0fU.A00(fnw, dp0.A00);
                    dp0.A02.setText(xBz.getDescription());
                    dp0.A01.setText(xBz.Air());
                    Drawable BFt = xBz.BFt();
                    if (BFt != null) {
                        dp0.A04.setImageDrawable(BFt);
                    } else {
                        dp0.A04.setVisibility(8);
                    }
                    C72231Oyz oyz = C72231Oyz.A00;
                    IgImageView igImageView = dp0.A03;
                    igImageView.A0I = oyz;
                    if (!(r12 == null || (A092 = r12.A03.A09(userSession)) == null || (A072 = A092.A07(igImageView.getWidth())) == null)) {
                        igImageView.setUrl(A072, r9);
                    }
                }
            } else {
                0qQ.A0B(r8, 0);
                0qQ.A0B(r5, 1);
                XBz xBz2 = (XBz) r13;
                C46893Dn9 dn9 = (C46893Dn9) r8;
                Drawable BFt2 = xBz2.BFt();
                IgImageView igImageView2 = dn9.A04;
                if (BFt2 != null) {
                    igImageView2.setImageDrawable(BFt2);
                } else {
                    igImageView2.setVisibility(8);
                }
                String description = xBz2.getDescription();
                IgTextView igTextView = dn9.A03;
                if (description != null) {
                    igTextView.setText(description);
                } else {
                    igTextView.setVisibility(8);
                }
                String Air = xBz2.Air();
                IgTextView igTextView2 = dn9.A02;
                if (Air != null) {
                    igTextView2.setText(Air);
                } else {
                    igTextView2.setVisibility(8);
                }
                AnonymousClass0fU.A00(new W9p(xBz2, r5, str), igTextView2);
                2eS.A01(igTextView2);
            }
        } else if (itemViewType == 13) {
            C50048FLo fLo = new C50048FLo(this);
            0qQ.A0B(r8, 0);
            C380459Yg r14 = (C380459Yg) r8;
            View view4 = r14.A00;
            AnonymousClass0fU.A00(fLo, view4);
            Context context2 = view4.getContext();
            IgTextView igTextView3 = r14.A01;
            igTextView3.setText(context2.getResources().getText(2131971538));
            igTextView3.setTextColor(context2.getColor(R.color.igds_primary_text));
            igTextView3.setTypeface(AnonymousClass0qo.A00(context2).A02(0qm.A13));
            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
            0nA.A0h(igTextView3, dimensionPixelSize, dimensionPixelSize);
        } else if (itemViewType == 12) {
            C50049FLp fLp = new C50049FLp(this);
            UserSession userSession2 = this.A0A;
            int i4 = this.A00;
            AnonymousClass0iw r4 = this.A0G;
            0qQ.A0B(r8, 0);
            0qQ.A0B(userSession2, 2);
            0qQ.A0B(r4, 4);
            C380449Yf r92 = (C380449Yf) r8;
            View view5 = r92.A00;
            AnonymousClass0fU.A00(fLp, view5);
            View findViewById = r92.itemView.findViewById(R.id.group_story_peek_faceswarm);
            0qQ.A07(findViewById);
            Context context3 = r92.itemView.getContext();
            0qQ.A07(context3);
            C49099EpO.A00(context3, r4, userSession2, (IgdsFaceSwarm) findViewById);
            Context context4 = view5.getContext();
            IgTextView igTextView4 = r92.A01;
            if (i4 == 0) {
                string = context4.getString(2131954711);
            } else {
                string = context4.getString(2131954712, new Object[]{Integer.valueOf(i4)});
            }
            igTextView4.setText(string);
        } else {
            int i5 = i3;
            if (A04()) {
                i5 = i - 1;
            }
            Context context5 = this.A0E;
            UserSession userSession3 = this.A0A;
            AnonymousClass3BT r02 = (AnonymousClass3BT) this.A04.get(i5);
            String Bkc = ((AnonymousClass3N2) r8).Bkc();
            if (Bkc == null) {
                r10 = null;
            } else {
                r10 = (AnonymousClass3BT) this.A02.get(Bkc);
            }
            C230242pG r41 = this.A0C;
            List list = this.A03;
            AnonymousClass0iw r40 = this.A0G;
            String str2 = this.A09;
            Integer num = this.A07;
            C2365534e r53 = this.A0I;
            C293245kP r93 = this.A05;
            C296845qj r42 = this.A04;
            AnonymousClass3O9 r142 = this.A01;
            if (itemViewType != 0) {
                if (itemViewType != 7) {
                    if (itemViewType == 2) {
                        AnonymousClass5BC r43 = (AnonymousClass5BC) r8;
                        AnonymousClass3NC.A00(context5, (View.OnClickListener) null, r40, userSession3, r02, r43.A01, r41, list, i5, false);
                        AnonymousClass5BG.A00(r40, userSession3, r02, r43.A00);
                    } else if (!(itemViewType == 3 || itemViewType == 4)) {
                        if (itemViewType == 5) {
                            C294515ma.A00(context5, r40, userSession3, r142, r02.A00(userSession3), r02, r10, (C296845qj) null, (C293245kP) null, (C241103Nw) r8, r41, num, str2, list, i5);
                        } else if (itemViewType != 10) {
                            if (itemViewType == 11) {
                                C60710Jpv jpv = (C60710Jpv) r8;
                                C294525mb.A00(userSession3).A0D(r02, AnonymousClass3Mb.A01(userSession3, r02));
                                jpv.A00 = r02;
                                Context context6 = jpv.itemView.getContext();
                                C60005JdE jdE = jpv.A09;
                                jdE.A01();
                                int color = context6.getColor(2Yu.A0H(context6, R.attr.igds_color_highlight_background));
                                Paint paint = jdE.A0U;
                                Paint paint2 = paint;
                                paint.setColor(color);
                                jdE.invalidateSelf();
                                C60005JdE jdE2 = jdE;
                                jdE2.A04 = false;
                                jdE.invalidateSelf();
                                IgImageView igImageView3 = jpv.A0A;
                                igImageView3.A09();
                                igImageView3.setImageDrawable(jdE2);
                                C294535mc A003 = C294525mb.A00(userSession3);
                                Reel reel = r02.A03;
                                A003.A0B(reel);
                                jpv.A02 = new C17708Vcd(context5, r40, userSession3, r142, r02, r93, jpv, r41, num, str2, list, i5);
                                AnonymousClass3N6 r94 = jpv.A0C;
                                AnonymousClass3ND.A00(userSession3, r02, r94);
                                C294525mb.A00(userSession3).A08(reel);
                                AnonymousClass3N8 r37 = jpv.A0B;
                                0qQ.A0B(userSession3, 0);
                                AnonymousClass3N8 r45 = r37;
                                0qQ.A0B(r45, 1);
                                AnonymousClass3NE.A00(userSession3, reel.A09(userSession3), r02, r45, false);
                                jpv.A08.setTextSize(1, 12.0f);
                                C294525mb.A00(userSession3).A06(reel);
                                if (r02.A03()) {
                                    RecyclerReelAvatarView recyclerReelAvatarView2 = jpv.A0D;
                                    recyclerReelAvatarView = recyclerReelAvatarView2;
                                    C240743Md r32 = recyclerReelAvatarView2.A00;
                                    if (r32 != null) {
                                        AnonymousClass3NT.A00(r32.A00);
                                    }
                                    AnonymousClass5BG.A00(r40, userSession3, r02, jpv.A00());
                                } else {
                                    AnonymousClass5BD r33 = jpv.A01;
                                    if (r33 != null) {
                                        r33.A02.setVisibility(8);
                                    }
                                    recyclerReelAvatarView = jpv.A0D;
                                    recyclerReelAvatarView.A00(r40, userSession3, r02, r10, r41, i5, false, false, false, false);
                                    if (recyclerReelAvatarView.getHolder().A01() != null) {
                                        recyclerReelAvatarView.getHolder().A01().setBorderWidth(0.0f);
                                    }
                                }
                                String str3 = null;
                                igImageView3.setTag(R.id.key_media_id, (Object) null);
                                C294525mb.A00(userSession3).A07(reel);
                                if (reel.A0t()) {
                                    C294525mb.A00(userSession3).A05(reel);
                                    igImageView3.setImageDrawable(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{Color.parseColor("#FFD400"), Color.parseColor("#FF7000"), Color.parseColor("#FF0067"), Color.parseColor("#E700CB")}));
                                } else if (AnonymousClass3NF.A02(userSession3, r02)) {
                                    C294525mb.A00(userSession3).A04(reel);
                                    paint2.setColor(jpv.A04.getColor(R.color.context_line_color));
                                    jdE.invalidateSelf();
                                } else if (!r02.A06(userSession3)) {
                                    if (reel.A09(userSession3) == null) {
                                        C294535mc A004 = C294525mb.A00(userSession3);
                                        if (C294535mc.A02(A004)) {
                                            String id = reel.getId();
                                            0qQ.A07(id);
                                            Long A012 = C294535mc.A01(A004, id);
                                            if (A012 != null) {
                                                long longValue = A012.longValue();
                                                1QP r15 = A004.A00;
                                                long j = longValue;
                                                r15.flowAnnotate(j, TraceFieldType.FailureReason, "null_expected_reel_item");
                                                r15.flowEndFail(j, "null_expected_reel_item", (String) null);
                                            }
                                        }
                                    }
                                    C255773uh A093 = reel.A09(userSession3);
                                    A093.getClass();
                                    C294525mb.A00(userSession3).A0C(reel, A093);
                                    1Xj r34 = A093.A0b;
                                    1Xj r143 = r34;
                                    if (r34 != null) {
                                        str3 = r34.getId();
                                    }
                                    igImageView3.setTag(R.id.key_media_id, str3);
                                    String str4 = r94.A01;
                                    str4.getClass();
                                    C2366334m.A00(userSession3).A07(str4);
                                    igImageView3.A0E = new WTL(userSession3, str4);
                                    if (r143 != null) {
                                        igImageView3.A0A = new C247833gz();
                                        igImageView3.A0K = r143.BTL();
                                    }
                                    ImageUrl A073 = A093.A07(0);
                                    if (A073 != null) {
                                        igImageView3.A05 = A093.A02();
                                        jdE.A02(A073, r40.getModuleName());
                                    }
                                } else {
                                    C72695PFz pFz = reel.A0E;
                                    if (pFz != null) {
                                        C294525mb.A00(userSession3).A03(pFz, reel);
                                        String str5 = r94.A01;
                                        str5.getClass();
                                        C2366334m.A00(userSession3).A07(str5);
                                        igImageView3.A0E = new WTM(userSession3, str5);
                                        AnonymousClass3I4 r46 = pFz.A00;
                                        if (r46.getPreview() != null) {
                                            igImageView3.A0A = new C247833gz();
                                            igImageView3.A0K = r46.getPreview();
                                        }
                                        jdE.A02(pFz.A00(), r40.getModuleName());
                                        igImageView3.setTag(R.id.key_media_id, pFz.getId());
                                    }
                                }
                                C294525mb.A00(userSession3).A0A(reel);
                                TextView A042 = r37.A04();
                                if (AnonymousClass3NF.A02(userSession3, r02)) {
                                    i2 = R.color.igds_primary_text;
                                } else {
                                    boolean A043 = r02.A04(userSession3);
                                    i2 = R.color.canvas_bottom_sheet_description_text_color;
                                    if (A043) {
                                        i2 = R.color.fundraiser_sticker_donate_button_background_color;
                                    }
                                }
                                A042.setTextColor(context5.getColor(i2));
                                C294525mb.A00(userSession3).A09(reel);
                                boolean z = reel.A1Y;
                                IgImageView igImageView4 = jpv.A06;
                                float f = 0.5f;
                                if (!z) {
                                    f = 1.0f;
                                    igImageView4.setAlpha(1.0f);
                                    igImageView4 = igImageView3;
                                }
                                igImageView4.setAlpha(f);
                                jpv.Bkt().setInactiveColour(context5.getColor(R.color.grey_2));
                                C294535mc A005 = C294525mb.A00(userSession3);
                                if (C294535mc.A02(A005)) {
                                    String id2 = reel.getId();
                                    0qQ.A07(id2);
                                    Long A013 = C294535mc.A01(A005, id2);
                                    if (A013 != null) {
                                        A005.A00.flowEndSuccess(A013.longValue());
                                    }
                                }
                                if (r53 != null) {
                                    boolean A032 = r02.A03();
                                    C2365534e.A00(jpv.A04, r02, r53, recyclerReelAvatarView.getHolder());
                                    if (A032 && !jpv.A03) {
                                        C2365534e.A03(r53, jpv.A00());
                                        C2365534e.A04(r53, jpv.A00());
                                        jpv.A03 = true;
                                    }
                                    if (182.A06(0Tu.A05, userSession3, 36322044501108637L) && AnonymousClass3NF.A00(userSession3, r02)) {
                                        if (!r02.A06(userSession3) || !reel.A1a) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) r37.A01();
                                            C270354gb r35 = new C270354gb();
                                            r35.A0I(constraintLayout);
                                            r35.A09(R.id.username, 7);
                                            constraintLayout.A0D = r35;
                                            r37.A03().setGravity(8388611);
                                            LinearLayout linearLayout = r94.A05;
                                            linearLayout.setGravity(8388659);
                                            0nA.A0V(linearLayout, -1);
                                            r53.A09(jpv);
                                        } else {
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) r37.A01();
                                            C270354gb r103 = new C270354gb();
                                            r103.A0I(constraintLayout2);
                                            r103.A0C(R.id.username, 7, R.id.plus_cobroadcaster_count, 6);
                                            constraintLayout2.A0D = r103;
                                            LinearLayout linearLayout2 = r94.A05;
                                            linearLayout2.setGravity(17);
                                            0nA.A0V(linearLayout2, -2);
                                            r53.A00 = AnonymousClass05K.A0C;
                                            r53.A09(jpv);
                                            r53.A00 = AnonymousClass05K.A0N;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C241103Nw r36 = (C241103Nw) r8;
                AnonymousClass3BT r26 = r02;
                AnonymousClass3BT r27 = r10;
                C296845qj r28 = r42;
                C293245kP r29 = r93;
                C241103Nw r30 = r36;
                C230242pG r31 = r41;
                Integer num2 = num;
                String str6 = str2;
                List list2 = list;
                int i6 = i5;
                C294515ma.A00(context5, r40, userSession3, r142, r02.A00(userSession3), r26, r27, r28, r29, r30, r31, num2, str6, list2, i6);
                if (r42 != null) {
                    AnonymousClass0iw r23 = r40;
                    C17718Vcn vcn = new C17718Vcn(context5, r23, userSession3, r142, r26, r27, r28, r29, r30, r31, num2, str6, list2, i6);
                    0qQ.A0B(r36, 0);
                    0qQ.A0B(r40, 3);
                    AnonymousClass3W1 r22 = r42.A03;
                    UserSession userSession4 = r42.A02;
                    C255773uh A006 = r02.A00(userSession4);
                    if (A006 != null) {
                        r102 = A006.A0b;
                    } else {
                        r102 = null;
                    }
                    boolean A062 = 182.A06(0Tu.A05, userSession4, 36325330151224186L);
                    if (r102 == null) {
                        IgImageView igImageView5 = r36.A0C;
                        igImageView5.setVisibility(4);
                        igImageView5.A09();
                        if (!(!A062 || (ndv = r36.A0H) == null || (view2 = (View) ndv.A02.getValue()) == null)) {
                            view2.setVisibility(4);
                        }
                    } else {
                        C254043rq r95 = new C254043rq(r22, r36);
                        r42.A06.A00.put(r102, r95);
                        C69058Ndv ndv2 = r36.A0H;
                        if (ndv2 != null) {
                            view = (View) ndv2.A02.getValue();
                        } else {
                            view = null;
                        }
                        if (A062) {
                            if (view != null) {
                                view.setVisibility(0);
                            }
                            if (!(ndv2 == null || (segmentedProgressBar = (SegmentedProgressBar) ndv2.A02.getValue()) == null)) {
                                segmentedProgressBar.setSegments(r02.A03.A0O(userSession4).size());
                            }
                        } else if (view != null) {
                            view.setVisibility(8);
                        }
                        r42.A04.A0L.put(r95, new C263424Ly(r23, r02, r42, vcn, r36, i5, A062));
                        Rect rect = new Rect();
                        C230272pJ r144 = r42.A07;
                        View view6 = r95.A00;
                        C296845qj r24 = r42;
                        1Xj r25 = r102;
                        AnonymousClass3BT r262 = r02;
                        C254043rq r272 = r95;
                        J8X j8x = new J8X(5, rect, r24, r25, r262, r272);
                        J9I j9i = new J9I(2, rect, r24, r25, r262, r272, !A062);
                        JG2 jg2 = new JG2(44, r102, r42);
                        Integer valueOf = Integer.valueOf(i5);
                        String str7 = r02.A03.A1o;
                        0qQ.A07(str7);
                        AnonymousClass30Y r104 = AnonymousClass30Y.A07;
                        C2354830a r105 = new C2354830a(r02, valueOf, str7);
                        r105.A00(new IPF(j8x, j9i, jg2));
                        r144.A00.A05(view6, r105.A01());
                    }
                }
                if (r53 != null) {
                    boolean A033 = r02.A03();
                    C2365534e.A00(r36.A07, r02, r53, r36.A0I.getHolder());
                    if (A033 && !r36.A06) {
                        C2365534e.A03(r53, r36.A00());
                        C2365534e.A04(r53, r36.A00());
                        r36.A06 = true;
                    }
                    0qQ.A0B(userSession3, 0);
                    if (182.A06(0Tu.A05, userSession3, 36322044501108637L) && AnonymousClass3NF.A00(userSession3, r02)) {
                        if (!r02.A06(userSession3) || !r02.A03.A1a) {
                            AnonymousClass3N8 r106 = r36.A0F;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) r106.A01();
                            C270354gb r47 = new C270354gb();
                            r47.A0I(constraintLayout3);
                            r47.A09(R.id.username, 7);
                            constraintLayout3.A0D = r47;
                            r106.A03().setGravity(8388611);
                            LinearLayout linearLayout3 = r36.A0G.A05;
                            linearLayout3.setGravity(8388659);
                            0nA.A0V(linearLayout3, -1);
                            r53.A08(r36);
                        } else {
                            ConstraintLayout constraintLayout4 = (ConstraintLayout) r36.A0F.A01();
                            C270354gb r107 = new C270354gb();
                            r107.A0I(constraintLayout4);
                            r107.A0C(R.id.username, 7, R.id.plus_cobroadcaster_count, 6);
                            constraintLayout4.A0D = r107;
                            LinearLayout linearLayout4 = r36.A0G.A05;
                            linearLayout4.setGravity(17);
                            0nA.A0V(linearLayout4, -2);
                            r53.A00 = AnonymousClass05K.A0C;
                            r53.A08(r36);
                            r53.A00 = AnonymousClass05K.A0N;
                        }
                    }
                }
            }
            AnonymousClass3N1 r38 = (AnonymousClass3N1) r8;
            AnonymousClass3Mc.A01(context5, r40, userSession3, r02, r10, r38, r41, list, i5, false, false, false, false);
            if (r53 != null) {
                C2365534e.A00(context5, r02, r53, r38.A03.getHolder());
            }
        }
        C230242pG r39 = this.A0C;
        r39.Du3(i3);
        if (itemViewType == 6) {
            C255933ux r82 = (C255933ux) r8;
            if (this.A08 != AnonymousClass05K.A00) {
                return;
            }
            if (this.A0D) {
                17k.A0E(r39 instanceof C2365234b);
                ((C2365234b) r39).EC6(r82.A00, i3);
                return;
            }
            17k.A0E(r39 instanceof C230232pF);
            ((C230232pF) r39).DcK(i3);
        } else if (itemViewType == 12) {
            if (this.A08 == AnonymousClass05K.A00 && this.A0D) {
                ArrayList arrayList = new ArrayList();
                FFN.A00(this.A0A, arrayList);
                17k.A0E(r39 instanceof C2365234b);
                ((C2365234b) r39).EBe(r8.itemView, i3, !arrayList.isEmpty());
            }
        } else if (itemViewType != 13) {
            UserSession userSession5 = this.A0A;
            boolean z2 = this.A0D;
            boolean z3 = false;
            if (itemViewType == 9) {
                z3 = true;
            }
            if (this.A08 != AnonymousClass05K.A0j && i > 0) {
                0qQ.A0B(userSession5, 0);
                if (182.A06(0Tu.A05, userSession5, 36320313631645948L)) {
                    i3 = i - 1;
                }
            }
            Reel reel2 = ((AnonymousClass3BT) this.A04.get(i3)).A03;
            if (!reel2.A0a()) {
                if (this.A02.containsKey("add_to_story")) {
                    i3--;
                }
                if (z2) {
                    17k.A0E(r39 instanceof C2365234b);
                    ((C2365234b) r39).ECI(r8.itemView, reel2, A00(userSession5), i3);
                    return;
                }
                AnonymousClass3BN A007 = A00(userSession5);
                if (z3) {
                    r39.DcZ(reel2, A007, i3);
                } else {
                    r39.Dcd(reel2, A007, this.A08, i3);
                }
            }
        }
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C2366234l r1 = this.A0F;
        List list = recyclerView.A0L;
        if (list != null) {
            list.remove(r1);
        }
    }

    public C2365834h(Context context, AnonymousClass0iw r3, UserSession userSession, AnonymousClass34Y r5, C2365534e r6, C230242pG r7, Integer num, boolean z) {
        this.A0C = r7;
        this.A0A = userSession;
        this.A08 = num;
        this.A0G = r3;
        this.A0E = context;
        this.A0I = r6;
        this.A0D = z;
        this.A0H = r5;
        this.A0B = C2366334m.A00(userSession);
        setHasStableIds(true);
    }

    public final int CMG(Reel reel) {
        int CMG = super.CMG(reel);
        if (CMG == -1 || !A04()) {
            return CMG;
        }
        return CMG + 1;
    }

    public final int getItemCount() {
        int CEq;
        C228112ko r0;
        int A032 = AnonymousClass0fD.A03(228069757);
        int size = this.A04.size();
        C228112ko r02 = this.A03;
        if ((r02 != null && r02.CKZ()) || this.A08 == AnonymousClass05K.A0j) {
            size++;
        }
        C293245kP r03 = this.A05;
        if (!(r03 == null || (CEq = r03.CEq()) == 1 || CEq == 2 || (r0 = this.A03) == null || r0.CKZ())) {
            size++;
        }
        if (A04()) {
            size++;
        }
        AnonymousClass0fD.A0A(-647440598, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A002;
        int i2;
        C228112ko r0;
        Integer num;
        int A032 = AnonymousClass0fD.A03(-1478907475);
        if (this.A05 != null && (((num = this.A08) == AnonymousClass05K.A01 || num == AnonymousClass05K.A0C) && i == getItemCount() - 1)) {
            A002 = 9;
            i2 = -1219406538;
        } else if (this.A08 == AnonymousClass05K.A0j && i == getItemCount() - 1) {
            A002 = 13;
            i2 = -320674341;
        } else if (i == 0 && A04()) {
            A002 = 12;
            i2 = 819731991;
        } else if (i != getItemCount() - 1 || (r0 = this.A03) == null || !r0.CKZ()) {
            if (A04()) {
                i--;
            }
            A002 = AnonymousClass3Mb.A00(this.A0A, (AnonymousClass3BT) this.A04.get(i));
            i2 = -1890509309;
        } else {
            A002 = 6;
            i2 = 2012139979;
        }
        AnonymousClass0fD.A0A(i2, A032);
        return A002;
    }
}
