package X;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.NJv  reason: case insensitive filesystem */
public final class C68478NJv extends AnonymousClass4DH implements AnonymousClass4DU, C74423Pud {
    public static final String __redex_internal_original_name = "QuickSnapConsumptionViewerFragment";
    public int A00 = -1;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public ImageView A09;
    public TextView A0A;
    public C228422le A0B;
    public RecyclerView A0C;
    public AnonymousClass2t9 A0D;
    public C49653F0k A0E;
    public final AnonymousClass3E6 A0F = AnonymousClass3E4.A01(this, false, true);
    public final String A0G = C273654mx.A00(182);
    public final AnonymousClass0eM A0H = I7E.A05(this, new G4S(this, 45), R.id.quick_snap_consumption_animatable_preview);
    public final AnonymousClass0eM A0I = AnonymousClass1YB.A00(new MJ1(this, 2));
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K = AnonymousClass0eN.A01(new MJ1(this, 5));
    public final AnonymousClass0eM A0L = C227642jf.A02(this);
    public final 1wn A0M;
    public final AnonymousClass0eM A0N;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.GnY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.GnY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.GnY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.GnY} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C53401GnY A01(X.C71968Ott r5, X.C68478NJv r6) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x002f
            java.util.List r0 = r5.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.GnY r0 = (X.C53401GnY) r0
            java.lang.String r1 = r0.A04
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.36N r0 = A03(r6)
            X.L50 r0 = r0.A04
            java.util.Set r0 = r0.A01
            boolean r0 = r0.contains(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0009
            r4 = r2
        L_0x002d:
            X.GnY r4 = (X.C53401GnY) r4
        L_0x002f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68478NJv.A01(X.Ott, X.NJv):X.GnY");
    }

    public static final void A04(View view, C68478NJv nJv, String str) {
        AnonymousClass0xx A0J2 = DbV.A0J(nJv);
        String str2 = str;
        C66173MGk mGk = new C66173MGk(view, nJv, str2, (AnonymousClass4D7) null, 6);
        19B r3 = 19B.A00;
        1Eo.A05(r3, mGk, A0J2);
        AnonymousClass36N A032 = A03(nJv);
        C53401GnY gnY = (C53401GnY) ((C61069Jw7) A032.A0A.getValue()).A00;
        if (gnY != null) {
            C359098c0.A02(C69468NmC.REACT, A032.A03, ((1Xj) gnY.A02).A30());
            1Eo.A05(r3, new C66173MGk(gnY, A032, str2, (AnonymousClass4D7) null, 8), C318116oQ.A00(A032));
        }
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: X.NJv} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r4 = 0
            r3 = r19
            X.0qQ.A0B(r3, r4)
            r11 = r18
            r0 = r20
            super.onViewCreated(r3, r0)
            r0 = 2131430627(0x7f0b0ce3, float:1.848296E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r3, r0)
            r6 = 10
            X.C71396Ojv.A00(r0, r6, r11)
            r0 = 2131430628(0x7f0b0ce4, float:1.8482962E38)
            android.view.View r2 = r3.requireViewById(r0)
            r11.A05 = r2
            if (r2 == 0) goto L_0x002e
            r1 = 15
            X.FP2 r0 = new X.FP2
            r0.<init>((java.lang.Object) r11, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x002e:
            r0 = 2131430329(0x7f0b0bb9, float:1.8482356E38)
            android.view.View r1 = r3.requireViewById(r0)
            r11.A03 = r1
            if (r1 == 0) goto L_0x004a
            r0 = 2131430333(0x7f0b0bbd, float:1.8482364E38)
            X.Dbb.A0t(r1, r0, r4)
            r0 = 2131430330(0x7f0b0bba, float:1.8482358E38)
            X.Dbb.A0t(r1, r0, r4)
            r0 = 11
            X.C71396Ojv.A00(r1, r0, r11)
        L_0x004a:
            r0 = 2131428229(0x7f0b0385, float:1.8478097E38)
            android.view.View r2 = r3.requireViewById(r0)
            r11.A06 = r2
            if (r2 == 0) goto L_0x006d
            r0 = 2131438245(0x7f0b2aa5, float:1.8498411E38)
            X.Dbb.A0t(r2, r0, r4)
            r0 = 2131438246(0x7f0b2aa6, float:1.8498413E38)
            android.widget.ImageView r1 = X.DbU.A0F(r2, r0)
            r0 = 2131238512(0x7f081e70, float:1.8093305E38)
            r1.setImageResource(r0)
            r0 = 12
            X.C71396Ojv.A00(r2, r0, r11)
        L_0x006d:
            X.2tC r8 = X.DbV.A0S(r11)
            X.0eM r2 = r11.A0L
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r2)
            X.0eM r0 = r11.A0H
            java.lang.Object r13 = r0.getValue()
            com.instagram.common.ui.base.IgSimpleImageView r13 = (com.instagram.common.ui.base.IgSimpleImageView) r13
            X.0eM r1 = r11.A0K
            java.lang.Object r15 = r1.getValue()
            com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView r15 = (com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView) r15
            X.0xx r16 = X.DbW.A0E(r11)
            X.0eM r0 = r11.A0I
            int r17 = X.DbX.A07(r0)
            X.NQ9 r10 = new X.NQ9
            r14 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r8.A01(r10)
            int r7 = X.DbX.A07(r0)
            X.NPn r5 = new X.NPn
            r5.<init>(r7)
            X.2t9 r5 = X.DbU.A0U(r8, r5)
            r11.A0D = r5
            android.content.Context r5 = r11.requireContext()
            com.instagram.quicksnap.consumption.QuickSnapConsumptionViewerFragment$setupRecyclerView$layoutManager$1 r9 = new com.instagram.quicksnap.consumption.QuickSnapConsumptionViewerFragment$setupRecyclerView$layoutManager$1
            r9.<init>(r5)
            androidx.recyclerview.widget.RecyclerView r5 = X.DbX.A0K(r3)
            r11.A0C = r5
            java.lang.String r10 = "recyclerView"
            if (r5 == 0) goto L_0x00c9
            r5.setLayoutManager(r9)
            androidx.recyclerview.widget.RecyclerView r7 = r11.A0C
            if (r7 == 0) goto L_0x00c9
            X.2t9 r5 = r11.A0D
            if (r5 != 0) goto L_0x00d1
            java.lang.String r10 = "adapter"
        L_0x00c9:
            X.0qQ.A0F(r10)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d1:
            r7.setAdapter(r5)
            androidx.recyclerview.widget.RecyclerView r8 = r11.A0C
            if (r8 == 0) goto L_0x00c9
            android.content.Context r7 = r11.requireContext()
            int r5 = X.DbX.A07(r0)
            X.MvS r0 = new X.MvS
            r0.<init>(r7, r5)
            r8.A11(r0)
            X.2le r5 = new X.2le
            r5.<init>()
            r11.A0B = r5
            androidx.recyclerview.widget.RecyclerView r0 = r11.A0C
            if (r0 == 0) goto L_0x00c9
            r5.A07(r0)
            androidx.recyclerview.widget.RecyclerView r5 = r11.A0C
            if (r5 == 0) goto L_0x00c9
            r7 = 2
            X.Mvi r0 = new X.Mvi
            r0.<init>(r7, r11, r9)
            r5.A15(r0)
            androidx.recyclerview.widget.RecyclerView r5 = r11.A0C
            if (r5 == 0) goto L_0x00c9
            X.Mqo r0 = new X.Mqo
            r0.<init>(r11, r7)
            r5.A13(r0)
            r0 = 2131441127(0x7f0b35e7, float:1.8504257E38)
            android.view.View r0 = r3.requireViewById(r0)
            r11.A01 = r0
            r0 = 2131441137(0x7f0b35f1, float:1.8504277E38)
            android.widget.ImageView r0 = X.DbU.A0F(r3, r0)
            r11.A09 = r0
            r0 = 2131441128(0x7f0b35e8, float:1.8504259E38)
            android.widget.TextView r0 = X.DbU.A0G(r3, r0)
            r11.A0A = r0
            r0 = 2131439084(0x7f0b2dec, float:1.8500113E38)
            android.view.View r5 = r3.requireViewById(r0)
            r11.A02 = r5
            if (r5 == 0) goto L_0x013a
            r0 = 13
            X.C71396Ojv.A00(r5, r0, r11)
        L_0x013a:
            r0 = 2131439237(0x7f0b2e85, float:1.8500423E38)
            android.view.View r0 = r3.requireViewById(r0)
            r11.A07 = r0
            r0 = 2131432335(0x7f0b138f, float:1.8486425E38)
            android.widget.ImageView r7 = X.DbU.A0F(r3, r0)
            X.0qQ.A0A(r7)
            java.lang.String r0 = "😂"
            X.I7E.A07(r7, r0)
            X.3NG r5 = X.C66583MXo.A0N(r7)
            r0 = 9
            X.C68642NQw.A00(r5, r7, r11, r0)
            r0 = 2131432336(0x7f0b1390, float:1.8486427E38)
            android.widget.ImageView r5 = X.DbU.A0F(r3, r0)
            X.0qQ.A0A(r5)
            java.lang.String r0 = "❤️"
            X.I7E.A07(r5, r0)
            X.3NG r0 = X.C66583MXo.A0N(r5)
            X.C68642NQw.A00(r0, r5, r11, r6)
            r0 = 2131432337(0x7f0b1391, float:1.8486429E38)
            android.widget.ImageView r6 = X.DbU.A0F(r3, r0)
            X.0qQ.A0A(r6)
            java.lang.String r0 = "😍"
            X.I7E.A07(r6, r0)
            X.3NG r5 = X.C66583MXo.A0N(r6)
            r0 = 7
            X.C68642NQw.A00(r5, r6, r11, r0)
            r0 = 2131432338(0x7f0b1392, float:1.848643E38)
            android.widget.ImageView r6 = X.DbU.A0F(r3, r0)
            X.0qQ.A0A(r6)
            java.lang.String r0 = "🔥"
            X.I7E.A07(r6, r0)
            X.3NG r5 = X.C66583MXo.A0N(r6)
            r0 = 8
            X.C68642NQw.A00(r5, r6, r11, r0)
            r0 = 2131431190(0x7f0b0f16, float:1.8484102E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r3, r0)
            X.3NG r6 = X.C66583MXo.A0N(r0)
            r5 = 5
            X.EHf r0 = new X.EHf
            r0.<init>(r11, r5)
            r6.A04 = r0
            r6.A00()
            r0 = 2131439846(0x7f0b30e6, float:1.8501659E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r3, r0)
            r0 = 2131439849(0x7f0b30e9, float:1.8501665E38)
            android.view.View r0 = r3.requireViewById(r0)
            r11.A04 = r0
            r0 = 2131441123(0x7f0b35e3, float:1.8504249E38)
            android.view.View r0 = r3.requireViewById(r0)
            r11.A08 = r0
            X.0lg r7 = X.AnonymousClass7TF.A0L(r2, r4)
            X.0Tu r0 = X.0Tu.A05
            r4 = 36325557785015338(0x810de7000b342a, double:3.0357672422997947E-306)
            boolean r7 = X.182.A06(r0, r7, r4)
            r0 = 2131441122(0x7f0b35e2, float:1.8504247E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r3, r0)
            r0 = r7 ^ 1
            r4 = 0
            int r0 = X.DbW.A01(r0)
            r5.setVisibility(r0)
            r0 = 2131441120(0x7f0b35e0, float:1.8504243E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r3, r0)
            if (r7 != 0) goto L_0x01fa
            r4 = 8
        L_0x01fa:
            r0.setVisibility(r4)
            X.3E6 r0 = r11.A0F
            X.F0k r5 = new X.F0k
            r5.<init>(r6, r0, r11)
            r11.A0E = r5
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r4 = r5.A07
            X.FKk r0 = r5.A03
            r4.addTextChangedListener(r0)
            X.3E6 r4 = r5.A05
            X.3ok r0 = r5.A04
            r4.A9Y(r0)
            android.view.View r4 = r11.A08
            if (r4 == 0) goto L_0x021d
            r0 = 14
            X.C71396Ojv.A00(r4, r0, r11)
        L_0x021d:
            X.07U r10 = X.07U.A05
            X.07Z r12 = r11.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r12)
            r13 = 0
            r14 = 18
            X.MH5 r9 = new X.MH5
            r9.<init>(r10, r11, r12, r13, r14)
            X.19B r8 = X.19B.A00
            X.1Eo.A05(r8, r9, r0)
            X.36N r7 = A03(r11)
            r0 = 33
            X.PgO r6 = X.C66580MXl.A15(r11, r0)
            X.6oS r5 = X.C318116oQ.A00(r7)
            r4 = 31
            X.MGd r0 = new X.MGd
            r0.<init>(r7, r6, r13, r4)
            X.1Eo.A05(r8, r0, r5)
            android.view.View r4 = r3.getRootView()
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x025f
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L_0x025f
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            r4.addView(r0)
        L_0x025f:
            X.0eM r0 = r11.A0J
            java.lang.Object r1 = r0.getValue()
            r0 = 12
            X.C71439Oke.A01(r3, r0, r1)
            X.1Ng r2 = X.DbX.A0R(r2)
            java.lang.Class<X.Osl> r1 = X.C71903Osl.class
            X.1wn r0 = r11.A0M
            r2.A01(r0, r1)
            X.36N r0 = A03(r11)
            X.8c0 r1 = r0.A03
            X.NmC r0 = X.C69468NmC.OPEN_QUICKSNAP_CONSUMPTION
            X.C359098c0.A02(r0, r1, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68478NJv.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final int A00(C68478NJv nJv) {
        String str;
        RecyclerView recyclerView = nJv.A0C;
        if (recyclerView == null) {
            str = "recyclerView";
        } else {
            C252553pI r1 = recyclerView.A0D;
            0qQ.A0C(r1, C273654mx.A00(7));
            C228422le r0 = nJv.A0B;
            if (r0 == null) {
                str = "snapHelper";
            } else {
                View A032 = r0.A03(r1);
                if (A032 != null) {
                    return C252553pI.A06(A032);
                }
                return -1;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final AnonymousClass36N A03(C68478NJv nJv) {
        return (AnonymousClass36N) nJv.A0N.getValue();
    }

    public static final void A05(C68478NJv nJv) {
        Object obj;
        LayerDrawable layerDrawable;
        C68478NJv nJv2 = nJv;
        C53401GnY gnY = (C53401GnY) ((C61069Jw7) A03(nJv2).A0A.getValue()).A00;
        if (gnY != null && (obj = gnY.A00) != null) {
            FragmentActivity requireActivity = nJv2.requireActivity();
            AnonymousClass0eM r2 = nJv2.A0L;
            new C2355930l(requireActivity, AnonymousClass7TE.A0l(r2));
            FragmentActivity requireActivity2 = nJv2.requireActivity();
            0qQ.A0B(r2.getValue(), 2);
            User user = (User) gnY.A01;
            C71252OgJ ogJ = new C71252OgJ(nJv2, 11);
            C71250OgH ogH = new C71250OgH(nJv2, 8);
            0qQ.A0B(user, 1);
            Resources resources = requireActivity2.getResources();
            C358248ab A0X = DbS.A0X(requireActivity2);
            A0X.A0H((DialogInterface.OnClickListener) null, 2131960992);
            A0X.A0g(ogJ);
            A0X.A0f(ogH);
            if (obj == AnonymousClass3QO.CLOSE_FRIENDS) {
                A0X.A05 = resources.getString(2131971118);
                A0X.A0q(AnonymousClass7TF.A0e(resources, user.getUsername(), 2131971117));
                layerDrawable = C346697vb.A01(requireActivity2);
            } else {
                A0X.A05 = resources.getString(2131971110);
                A0X.A0q(AnonymousClass7TF.A0e(resources, user.getUsername(), 2131971109));
                ShapeDrawable A052 = C346697vb.A05(requireActivity2.getColor(2Yu.A02(requireActivity2)));
                ShapeDrawable A053 = C346697vb.A05(AnonymousClass7TF.A03(requireActivity2, R.attr.igds_color_creation_tools_green));
                Paint paint = AnonymousClass3JT.A00;
                layerDrawable = new LayerDrawable(new Drawable[]{A052, A053, AnonymousClass3JT.A05(requireActivity2, R.drawable.instagram_lock_pano_filled_24, requireActivity2.getColor(R.color.igds_icon_on_color))});
                int A012 = AnonymousClass1GB.A01(0nA.A04(requireActivity2, 3));
                int A013 = AnonymousClass1GB.A01(0nA.A04(requireActivity2, 18));
                layerDrawable.setLayerInset(0, 0, 0, 0, 0);
                layerDrawable.setLayerInset(1, A012, A012, A012, A012);
                layerDrawable.setLayerInset(2, A013, A013, A013, A013);
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            A1C.add(layerDrawable);
            A1C.add(new C244303ay(user.Bh3(), nJv2.A0G, DbS.A02(requireActivity2, 58), DbS.A02(requireActivity2, 2), requireActivity2.getColor(R.color.igds_elevated_background), requireActivity2.getColor(R.color.grey_1)));
            A0X.A0j(new C244323b0(requireActivity2, AnonymousClass05K.A00, A1C, 0.3f, DbS.A02(requireActivity2, 58), true));
            AnonymousClass7TH.A0a(A0X, true);
        }
    }

    public final boolean Dpr() {
        String str;
        C49653F0k f0k = this.A0E;
        if (f0k == null) {
            str = "replyBarController";
        } else if (f0k.A00) {
            View view = this.A04;
            str = "editText";
            if (view != null) {
                view.clearFocus();
                View view2 = this.A04;
                if (view2 != null) {
                    0nA.A0N(view2);
                    return true;
                }
            }
        } else {
            DbX.A1J(this);
            return true;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean Dq0() {
        String str;
        C49653F0k f0k = this.A0E;
        if (f0k == null) {
            str = "replyBarController";
        } else if (f0k.A00) {
            return true;
        } else {
            View view = this.A04;
            str = "editText";
            if (view != null) {
                view.requestFocus();
                View view2 = this.A04;
                if (view2 != null) {
                    0nA.A0S(view2);
                    return true;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return this.A0G;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0L);
    }

    public C68478NJv() {
        MJ1 mj1 = new MJ1(this, 4);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MJ1(new MJ1(this, 6), 7));
        this.A0N = DbS.A0I(new MJ1(A002, 8), mj1, new MJ8(7, (Object) null, A002), DbS.A0z(AnonymousClass36N.class));
        this.A0J = AnonymousClass0eN.A01(new MJ1(this, 3));
        this.A0M = C71932OtG.A00(this, 43);
    }

    public static final C68050MzH A02(C68478NJv nJv) {
        int A002 = A00(nJv);
        RecyclerView recyclerView = nJv.A0C;
        if (recyclerView == null) {
            C66580MXl.A19();
            throw AnonymousClass00P.createAndThrow();
        }
        C249703kE A0W = recyclerView.A0W(A002);
        if (A0W instanceof C68050MzH) {
            return (C68050MzH) A0W;
        }
        return null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(511999596);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.quick_snap_consumption_viewer_fragment, false);
        AnonymousClass0fD.A09(-780101061, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1949046470);
        super.onDestroy();
        this.A0F.onDestroy();
        AnonymousClass0fD.A09(1024386452, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1422352471);
        super.onDestroyView();
        ((QuickSnapReactionEmitterView) this.A0K.getValue()).A01();
        DbX.A0R(this.A0L).A02(this.A0M, C71903Osl.class);
        C49653F0k f0k = this.A0E;
        if (f0k != null) {
            f0k.A07.removeTextChangedListener(f0k.A03);
            f0k.A05.EEH(f0k.A04);
        }
        AnonymousClass0fD.A09(-913853110, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1422778764);
        C68478NJv.super.onPause();
        A03(this).A03(false);
        A03(this).A01();
        AnonymousClass0fD.A09(1649658441, A022);
    }

    public final void onResume() {
        AnonymousClass37D A0i;
        int A022 = AnonymousClass0fD.A02(722133853);
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity == null || (A0i = DbT.A0i(activity)) == null || !((AnonymousClass37F) A0i).A0g) {
            A03(this).A03(true);
        }
        AnonymousClass0fD.A09(-1872900820, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(239893543);
        C68478NJv.super.onStart();
        JTP.A17(this, this.A0F);
        AnonymousClass0fD.A09(1929375096, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1678451075);
        C68478NJv.super.onStop();
        this.A0F.onStop();
        AnonymousClass0fD.A09(-1764341775, A022);
    }
}
