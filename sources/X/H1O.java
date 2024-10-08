package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.location.platform.api.Location;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import com.instagram.user.model.User;
import java.util.Collection;

public final class H1O extends AnonymousClass4DH implements AnonymousClass4DU, C337237fw {
    public static final String __redex_internal_original_name = "DirectNewCollectionFragment";
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public RecyclerView A04;
    public IgTextView A05;
    public IgdsInlineSearchBox A06;
    public IgdsSwitch A07;
    public BackInterceptEditText A08;
    public Integer A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final AnonymousClass0eM A0G = AnonymousClass1YB.A00(new C73918Ply(this, 45));
    public final AnonymousClass0eM A0H = AnonymousClass1YB.A00(new C73918Ply(this, 46));
    public final AnonymousClass0eM A0I = AnonymousClass1YB.A00(new C73918Ply(this, 47));
    public final AnonymousClass0eM A0J = AnonymousClass1YB.A00(new C73918Ply(this, 48));
    public final AnonymousClass0eM A0K = AnonymousClass1YB.A00(new C73918Ply(this, 49));
    public final AnonymousClass0eM A0L = A01(this, 0);
    public final AnonymousClass0eM A0M = A01(this, 1);
    public final AnonymousClass0eM A0N = A01(this, 2);
    public final AnonymousClass0eM A0O = A01(this, 3);
    public final AnonymousClass0eM A0P = A01(this, 4);
    public final AnonymousClass0eM A0Q = A01(this, 5);
    public final AnonymousClass0eM A0R = A01(this, 6);
    public final AnonymousClass0eM A0S = A01(this, 7);
    public final AnonymousClass0eM A0T = A01(this, 8);
    public final AnonymousClass0eM A0U = A01(this, 9);
    public final AnonymousClass0eM A0V = C227642jf.A02(this);
    public final C252213ok A0W = new IP1(this, 1);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != true) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.view.View r4, X.H1O r5) {
        /*
            r3 = 1
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r5.A07
            if (r0 == 0) goto L_0x000c
            boolean r1 = r0.isChecked()
            r0 = 1
            if (r1 == r3) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            boolean r0 = r5.A0B(r0, r3)
            if (r0 == 0) goto L_0x003f
            java.lang.Integer r0 = r5.A09
            if (r0 == 0) goto L_0x0022
            int r0 = r0.intValue()
            float r2 = (float) r0
            r1 = 0
            X.Iqy r0 = X.C58379Iqy.A00
            A07(r5, r0, r1, r2)
        L_0x0022:
            X.0nA.A0N(r4)
            X.0eM r0 = r5.A0N
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0040
            com.instagram.save.model.SavedCollection r1 = new com.instagram.save.model.SavedCollection
            r1.<init>()
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r5.A08
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            r1.A0G = r0
            A05(r5, r1)
        L_0x003f:
            return
        L_0x0040:
            X.0eM r0 = r5.A0V
            X.0lg r0 = X.DbT.A0X(r0)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "collections/create/"
            r2.A0A(r0)
            java.lang.Class<com.instagram.save.model.SavedCollection> r1 = com.instagram.save.model.SavedCollection.class
            java.lang.Class<X.Vwn> r0 = X.C18689Vwn.class
            r2.A0Q(r1, r0)
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r5.A08
            if (r0 == 0) goto L_0x00f4
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r0)
            java.lang.String r0 = "name"
            r2.A9m(r0, r1)
            X.0eM r4 = r5.A0I
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r4)
            java.lang.Integer r0 = r0.A03
            java.lang.String r1 = X.C70864OPd.A00(r0)
            java.lang.String r0 = "surface"
            r2.A9m(r0, r1)
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r4)
            java.lang.String r1 = r0.A07
            java.lang.String r0 = "module_name"
            r2.A9m(r0, r1)
            boolean r1 = r5.A0F
            java.lang.String r0 = "with_search_text"
            r2.A0H(r0, r1)
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r4)
            java.lang.String r0 = r0.A04
            if (r0 == 0) goto L_0x00d7
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r4)
            java.lang.String r0 = r0.A04
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r1 = X.C51970G9q.A0k(r0)
            java.lang.String r0 = "added_media_fbids"
        L_0x009e:
            r2.A9m(r0, r1)
        L_0x00a1:
            X.0eM r0 = r5.A0T
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x00b6
            com.instagram.api.schemas.CollectionPrivacyModeEnum r0 = com.instagram.api.schemas.CollectionPrivacyModeEnum.PUBLIC
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "privacy_mode"
            r2.A9m(r0, r1)
        L_0x00b6:
            java.lang.String r1 = r5.A00()
            java.lang.String r0 = "thread_id"
            r2.A0G(r0, r1)
            boolean r0 = r5.isAdded()
            if (r0 == 0) goto L_0x003f
            X.1OC r1 = X.DbT.A0U(r2, r3)
            X.0eM r0 = r5.A0H
            java.lang.Object r0 = r0.getValue()
            X.1P0 r0 = (X.1P0) r0
            r1.A00 = r0
            r5.schedule(r1)
            return
        L_0x00d7:
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r4)
            java.lang.String r0 = r0.A00()
            if (r0 == 0) goto L_0x00a1
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r4)
            java.lang.String r0 = r0.A00()
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            java.lang.String r1 = X.C51970G9q.A0k(r0)
            java.lang.String r0 = "added_media_ids"
            goto L_0x009e
        L_0x00f4:
            java.lang.String r0 = "collectionNameEditText"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1O.A02(android.view.View, X.H1O):void");
    }

    public static final void A03(H1O h1o) {
        h1o.A0C = true;
        View view = h1o.A00;
        if (view != null) {
            ImageView A0J2 = DbX.A0J(view, R.id.privacy_icon);
            View view2 = h1o.A00;
            if (view2 != null) {
                TextView A0R2 = AnonymousClass7TG.A0R(view2, R.id.visible_to);
                View view3 = h1o.A00;
                if (view3 != null) {
                    TextView A0R3 = AnonymousClass7TG.A0R(view3, R.id.audience_status);
                    View view4 = h1o.A00;
                    if (view4 != null) {
                        ImageView A0J3 = DbX.A0J(view4, R.id.chevron);
                        int color = h1o.requireContext().getColor(2Yu.A0H(h1o.getContext(), R.attr.igds_color_primary_text_disabled));
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                        A0J2.setColorFilter(color, mode);
                        A0R2.setTextColor(color);
                        A0R3.setTextColor(color);
                        DbU.A1G(A0R3, h1o, 2131968268);
                        A0J3.setColorFilter(color, mode);
                        return;
                    }
                }
            }
        }
        0qQ.A0F("audienceSelectorIntentRow");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r1 != true) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(X.H1O r6, boolean r7) {
        /*
            r5 = 0
            boolean r4 = r6.A0B(r7, r5)
            com.instagram.common.ui.base.IgTextView r1 = r6.A05
            java.lang.String r3 = "saveButton"
            if (r1 == 0) goto L_0x004f
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r4 == 0) goto L_0x0012
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0012:
            r1.setAlpha(r0)
            android.content.Context r0 = r6.requireContext()
            r2 = 1
            boolean r0 = X.2eO.A01(r0, r2)
            if (r0 == 0) goto L_0x0027
            com.instagram.common.ui.base.IgTextView r0 = r6.A05
            if (r0 == 0) goto L_0x004f
            r0.setEnabled(r4)
        L_0x0027:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r6.A07
            if (r0 == 0) goto L_0x0032
            boolean r1 = r0.isChecked()
            r0 = 1
            if (r1 == r2) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            r1 = 0
            boolean r0 = r6.A0B(r0, r5)
            r0 = r0 ^ 1
            com.instagram.common.ui.base.IgTextView r2 = r6.A05
            if (r2 == 0) goto L_0x004f
            if (r0 == 0) goto L_0x004b
            android.content.Context r1 = r6.requireContext()
            r0 = 2131952367(0x7f1302ef, float:1.9541175E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x004b:
            r2.setContentDescription(r1)
            return
        L_0x004f:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1O.A08(X.H1O, boolean):void");
    }

    public final void Dam(C337257fy r4) {
        0qQ.A0B(r4, 0);
        if (!(!((Collection) r4.Bo1()).isEmpty())) {
            return;
        }
        if (G9t.A1b(this.A0R)) {
            11Z.A04(new C57822Ih1(this, r4), 100);
        } else {
            11Z.A02(new C57823Ih2(this, r4));
        }
    }

    public final String getModuleName() {
        return "direct_new_collection";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d0, code lost:
        if (r1 != true) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r3 = 0
            X.0qQ.A0B(r9, r3)
            super.onViewCreated(r9, r10)
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            android.content.Context r1 = r8.requireContext()
            r0 = 2130971249(0x7f040a71, float:1.7551231E38)
            int r0 = X.2Yu.A0F(r1, r0)
            X.2db.A02(r2, r0)
            android.view.View r1 = r8.requireView()
            r0 = 2131430558(0x7f0b0c9e, float:1.848282E38)
            android.view.View r0 = r1.requireViewById(r0)
            r8.A02 = r0
            android.view.View r1 = r8.requireView()
            r0 = 2131430405(0x7f0b0c05, float:1.848251E38)
            android.view.View r1 = r1.requireViewById(r0)
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r1 = (com.instagram.ui.text.backinterceptedittext.BackInterceptEditText) r1
            r8.A08 = r1
            java.lang.String r7 = "collectionNameEditText"
            if (r1 == 0) goto L_0x00dc
            r2 = 1
            X.I9i r0 = new X.I9i
            r0.<init>(r8, r2)
            r1.addTextChangedListener(r0)
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r1 = r8.A08
            if (r1 == 0) goto L_0x00dc
            X.IEI r0 = new X.IEI
            r0.<init>(r8, r2)
            r1.setOnEditorActionListener(r0)
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r4 = r8.A08
            if (r4 == 0) goto L_0x00dc
            r1 = 11
            X.Plk r0 = new X.Plk
            r0.<init>(r8, r1)
            r4.setOnBackCallback(r0)
            android.view.View r1 = r8.requireView()
            r0 = 2131430397(0x7f0b0bfd, float:1.8482494E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r1, r0)
            android.view.View r1 = r8.requireView()
            r0 = 2131430400(0x7f0b0c00, float:1.84825E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.0eM r4 = r8.A0I
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r4)
            java.lang.Integer r0 = r0.A03
            if (r1 != r0) goto L_0x012d
            r1 = 2131956256(0x7f131220, float:1.9549063E38)
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r4)
            java.lang.String r0 = r0.A09
            X.DbX.A1F(r6, r8, r0, r1)
            r0 = 2131956261(0x7f131225, float:1.9549073E38)
        L_0x008d:
            X.DbU.A1G(r5, r8, r0)
        L_0x0090:
            X.0eM r5 = r8.A0M
            boolean r0 = X.AnonymousClass7TF.A1Z(r5)
            if (r0 == 0) goto L_0x011d
            android.view.View r1 = r8.A02
            java.lang.String r7 = "composerContainer"
            if (r1 == 0) goto L_0x00dc
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            android.view.View r0 = r8.A02
            if (r0 == 0) goto L_0x00dc
            r0.setVisibility(r3)
        L_0x00aa:
            android.view.View r1 = r8.requireView()
            r0 = 2131429534(0x7f0b089e, float:1.8480743E38)
            android.view.View r1 = r1.requireViewById(r0)
            r0 = 51
            X.C56800ICx.A00(r1, r0, r8)
            android.view.View r1 = r8.requireView()
            r0 = 2131440615(0x7f0b33e7, float:1.8503218E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r1, r0)
            r8.A05 = r0
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r8.A07
            if (r0 == 0) goto L_0x00d2
            boolean r1 = r0.isChecked()
            r0 = 1
            if (r1 == r2) goto L_0x00d3
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            A08(r8, r0)
            com.instagram.common.ui.base.IgTextView r1 = r8.A05
            if (r1 != 0) goto L_0x00e4
            java.lang.String r7 = "saveButton"
        L_0x00dc:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00e4:
            r0 = 52
            X.C56800ICx.A00(r1, r0, r8)
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.C51966G9m.A0q(r4)
            com.instagram.common.typedurl.ImageUrl r4 = r0.A00
            if (r4 == 0) goto L_0x00ff
            android.view.View r1 = r8.requireView()
            r0 = 2131430406(0x7f0b0c06, float:1.8482512E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.DbT.A0b(r1, r0)
            r0.setUrl(r4, r8)
        L_0x00ff:
            X.0eM r0 = r8.A0T
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x01b9
            android.view.View r1 = r8.requireView()
            r0 = 2131428244(0x7f0b0394, float:1.8478127E38)
            X.3oV r0 = X.DbV.A0T(r1, r0, r3)
            android.view.View r1 = r0.getView()
            r8.A00 = r1
            if (r1 != 0) goto L_0x01ab
            java.lang.String r7 = "audienceSelectorIntentRow"
            goto L_0x00dc
        L_0x011d:
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r8.A08
            if (r0 == 0) goto L_0x00dc
            r0.requestFocus()
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r8.A08
            if (r0 == 0) goto L_0x00dc
            X.0nA.A0Q(r0)
            goto L_0x00aa
        L_0x012d:
            X.0eM r0 = r8.A0P
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x0148
            X.0eM r0 = r8.A0O
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x0148
            r0 = 2131969768(0x7f1346e8, float:1.9576468E38)
            X.DbU.A1G(r6, r8, r0)
            r0 = 2131969767(0x7f1346e7, float:1.9576466E38)
            goto L_0x008d
        L_0x0148:
            r0 = 2131968272(0x7f134110, float:1.9573434E38)
            X.DbU.A1G(r6, r8, r0)
            r0 = 2131968271(0x7f13410f, float:1.9573432E38)
            X.DbU.A1G(r5, r8, r0)
            X.0eM r0 = r8.A0T
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0177
            android.view.View r1 = r8.requireView()
            r0 = 2131430382(0x7f0b0bee, float:1.8482463E38)
            android.view.View r1 = r1.requireViewById(r0)
            r8.A01 = r1
            if (r1 == 0) goto L_0x0170
            r0 = 50
            X.C56800ICx.A00(r1, r0, r8)
        L_0x0170:
            android.view.View r0 = r8.A01
            if (r0 == 0) goto L_0x0177
            r0.setClickable(r3)
        L_0x0177:
            android.view.View r1 = r8.requireView()
            r0 = 2131430381(0x7f0b0bed, float:1.8482461E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r0
            r8.A07 = r0
            X.0eM r0 = r8.A0M
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0195
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r8.A07
            if (r0 == 0) goto L_0x0195
            r0.A00()
        L_0x0195:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r8.A07
            if (r0 == 0) goto L_0x019c
            r0.setVisibility(r3)
        L_0x019c:
            com.instagram.igds.components.switchbutton.IgdsSwitch r5 = r8.A07
            if (r5 == 0) goto L_0x0090
            r1 = 15
            X.PHt r0 = new X.PHt
            r0.<init>(r8, r1)
            r5.A07 = r0
            goto L_0x0090
        L_0x01ab:
            r0 = 49
            X.C56800ICx.A00(r1, r0, r8)
            boolean r0 = X.AnonymousClass7TF.A1Z(r5)
            if (r0 == 0) goto L_0x01b9
            A03(r8)
        L_0x01b9:
            X.0eM r0 = r8.A0P
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x01c9
            X.0eM r0 = r8.A0O
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x026e
        L_0x01c9:
            X.0eM r4 = r8.A0U
            java.lang.Object r0 = r4.getValue()
            X.7fy r0 = (X.C337257fy) r0
            r0.EcJ(r8)
            java.lang.String r1 = ""
            java.lang.Object r0 = r4.getValue()
            X.7fy r0 = (X.C337257fy) r0
            r0.EhX(r1)
            android.view.View r1 = r8.requireView()
            r0 = 2131442506(0x7f0b3b4a, float:1.8507054E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r1, r0)
            r8.A03 = r0
            boolean r0 = X.AnonymousClass7TF.A1Z(r5)
            if (r0 == 0) goto L_0x0221
            X.0eM r0 = r8.A0O
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x021a
            android.view.ViewGroup r4 = r8.A03
            if (r4 == 0) goto L_0x026f
            X.0eM r0 = r8.A0Q
            boolean r0 = X.G9t.A1b(r0)
            r1 = 1053609165(0x3ecccccd, float:0.4)
            if (r0 == 0) goto L_0x020c
            r1 = 1058642330(0x3f19999a, float:0.6)
        L_0x020c:
            android.content.Context r0 = r8.requireContext()
            int r0 = X.AnonymousClass0nB.A00(r0)
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            X.0nA.A0V(r4, r0)
        L_0x021a:
            android.view.ViewGroup r0 = r8.A03
            if (r0 == 0) goto L_0x0221
            r0.setVisibility(r3)
        L_0x0221:
            android.view.View r1 = r8.requireView()
            r0 = 2131442503(0x7f0b3b47, float:1.8507048E38)
            androidx.recyclerview.widget.RecyclerView r1 = X.DbT.A0I(r1, r0)
            r8.A04 = r1
            if (r1 == 0) goto L_0x023d
            X.0eM r0 = r8.A0G
            java.lang.Object r0 = r0.getValue()
            X.HmG r0 = (X.C55719HmG) r0
            X.2t9 r0 = r0.A01
            r1.setAdapter(r0)
        L_0x023d:
            androidx.recyclerview.widget.RecyclerView r1 = r8.A04
            if (r1 == 0) goto L_0x024a
            r1.A0S = r2
            android.content.Context r0 = r8.requireContext()
            X.DbU.A15(r0, r1, r2, r3)
        L_0x024a:
            android.view.View r1 = r8.requireView()
            r0 = 2131442505(0x7f0b3b49, float:1.8507052E38)
            android.view.View r2 = r1.requireViewById(r0)
            com.instagram.igds.components.search.IgdsInlineSearchBox r2 = (com.instagram.igds.components.search.IgdsInlineSearchBox) r2
            r1 = 12
            X.Plk r0 = new X.Plk
            r0.<init>(r8, r1)
            r2.setEditTextOnBackListener(r0)
            r1 = 3
            X.PHc r0 = new X.PHc
            r0.<init>(r8, r1)
            r2.A02 = r0
            r2.setVisibility(r3)
            r8.A06 = r2
        L_0x026e:
            return
        L_0x026f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1O.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final String A00() {
        IgdsSwitch igdsSwitch;
        if ((!AnonymousClass7TF.A1Z(this.A0P) && !AnonymousClass7TF.A1Z(this.A0O)) || (igdsSwitch = this.A07) == null || !igdsSwitch.isChecked()) {
            return C51966G9m.A0q(this.A0I).A08;
        }
        DirectShareTarget directShareTarget = ((C55719HmG) this.A0G.getValue()).A00;
        if (directShareTarget != null) {
            return directShareTarget.A08();
        }
        return null;
    }

    public static AnonymousClass0eM A01(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73909Plk(obj, i));
    }

    public static final void A04(H1O h1o) {
        Integer num = h1o.A09;
        if (num != null) {
            int intValue = num.intValue();
            IgdsInlineSearchBox igdsInlineSearchBox = h1o.A06;
            if (igdsInlineSearchBox != null) {
                boolean z = true;
                if (igdsInlineSearchBox.A07() || intValue <= 0) {
                    z = false;
                }
                igdsInlineSearchBox.setVisibilityOfClearButton(z);
            }
        }
    }

    public static final void A05(H1O h1o, SavedCollection savedCollection) {
        if (AnonymousClass7TF.A1Z(h1o.A0N)) {
            0eP A1L = AnonymousClass7TE.A1L("SaveFragment.SAVE_HOME_TAB_MODE", HMH.ADD_AND_CREATE_COLLECTION);
            0eP A1L2 = AnonymousClass7TE.A1L("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", savedCollection);
            0eP A1L3 = AnonymousClass7TE.A1L("SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_IS_PUBLIC", Boolean.valueOf(h1o.A0D));
            AnonymousClass0eM r2 = h1o.A0I;
            Bundle A002 = Q21.A00(A1L, A1L2, A1L3, AnonymousClass7TE.A1L("SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_SURFACE", C70864OPd.A00(C51966G9m.A0q(r2).A03)), AnonymousClass7TE.A1L("SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_WITH_SEARCH_TEXT", Boolean.valueOf(h1o.A0F)), AnonymousClass7TE.A1L("SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_THREAD_ID", h1o.A00()), AnonymousClass7TE.A1L("SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_ADDED_MEDIA_FBID", C51966G9m.A0q(r2).A04));
            C55115HcO.A00();
            C52770GcN gcN = new C52770GcN();
            Dbc.A0S(gcN, DbU.A0I(A002, gcN, h1o), h1o.A0V);
            return;
        }
        Bundle A0P2 = AnonymousClass7TG.A0P("SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION", savedCollection, AnonymousClass7TE.A1L("SaveFragment.SAVE_HOME_TAB_MODE", HMH.ADD_TO_EXISTING_COLLECTION));
        DbU.A1K(h1o, DbS.A0b(h1o.requireActivity(), A0P2, DbT.A0X(h1o.A0V), ModalActivity.class, "saved_feed"));
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.2tL, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r0.length() == 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.H1O r8, X.C337257fy r9) {
        /*
            X.0eM r0 = r8.A0G
            java.lang.Object r7 = r0.getValue()
            X.HmG r7 = (X.C55719HmG) r7
            java.lang.Object r1 = r9.Bo1()
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = r9.BiY()
            r5 = 0
            if (r0 == 0) goto L_0x001c
            int r0 = r0.length()
            r4 = 0
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r4 = 1
        L_0x001d:
            X.0qQ.A0B(r1, r5)
            com.instagram.common.recyclerview.ViewModelListUpdate r6 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r6.<init>()
            if (r4 == 0) goto L_0x002f
            X.IOO r0 = new X.IOO
            r0.<init>()
            r6.A00(r0)
        L_0x002f:
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.next()
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            X.IOQ r0 = new X.IOQ
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0037
        L_0x004c:
            if (r4 == 0) goto L_0x008a
            com.instagram.model.direct.DirectShareTarget r1 = r7.A00
            if (r1 == 0) goto L_0x008a
            X.IOQ r0 = new X.IOQ
            r0.<init>(r1)
            r6.A00(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r3.iterator()
        L_0x0062:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.IOQ r0 = (X.IOQ) r0
            com.instagram.model.direct.DirectShareTarget r0 = r0.A00
            java.lang.String r1 = r0.A09()
            X.0qQ.A07(r1)
            com.instagram.model.direct.DirectShareTarget r0 = r7.A00
            X.0qQ.A0A(r0)
            java.lang.String r0 = r0.A09()
            boolean r0 = r1.equals(r0)
            X.DbV.A1U(r2, r4, r0)
            goto L_0x0062
        L_0x0089:
            r3 = r4
        L_0x008a:
            r6.A01(r3)
            X.2t9 r0 = r7.A01
            r0.A05(r6)
            androidx.recyclerview.widget.RecyclerView r0 = r8.A04
            if (r0 == 0) goto L_0x0099
            r0.A0o(r5)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1O.A06(X.H1O, X.7fy):void");
    }

    public static final void A07(H1O h1o, C62320sa r4, float f, float f2) {
        ViewGroup viewGroup = h1o.A03;
        if (viewGroup != null) {
            C294975nL A002 = C294975nL.A00(viewGroup);
            A002.A0G();
            C294975nL A0A2 = A002.A0A();
            A0A2.A0K(f);
            A0A2.A0N(AnonymousClass7TE.A03(viewGroup), f2);
            A0A2.A05 = new C65724Lye(r4, 16);
            A0A2.A0H();
        }
        View view = h1o.A02;
        if (view == null) {
            0qQ.A0F("composerContainer");
            throw AnonymousClass00P.createAndThrow();
        }
        C294975nL A003 = C294975nL.A00(view);
        A003.A0G();
        C294975nL A0A3 = A003.A0A();
        A0A3.A0K(f);
        A0A3.A0H();
    }

    public static final boolean A09(H1O h1o) {
        return AnonymousClass7TF.A1Z(h1o.A0O);
    }

    public static final boolean A0A(H1O h1o) {
        return G9t.A1b(h1o.A0Q);
    }

    private final boolean A0B(boolean z, boolean z2) {
        Context context;
        int i;
        BackInterceptEditText backInterceptEditText = this.A08;
        String str = null;
        if (backInterceptEditText == null) {
            0qQ.A0F("collectionNameEditText");
            throw AnonymousClass00P.createAndThrow();
        }
        Editable text = backInterceptEditText.getText();
        if (text == null || 00l.A0W(text)) {
            if (z2) {
                context = getContext();
                if (context != null) {
                    i = 2131956257;
                }
                C310336ap A0X = DbV.A0X();
                1xC r0 = 1xC.A01;
                A0X.A0D = str;
                DbY.A1K(r0, A0X);
            }
            return false;
        } else if (!z || ((C55719HmG) this.A0G.getValue()).A00 != null) {
            return true;
        } else {
            if (z2) {
                context = getContext();
                if (context != null) {
                    i = 2131956258;
                }
                C310336ap A0X2 = DbV.A0X();
                1xC r02 = 1xC.A01;
                A0X2.A0D = str;
                DbY.A1K(r02, A0X2);
            }
            return false;
        }
        str = context.getString(i);
        C310336ap A0X22 = DbV.A0X();
        1xC r022 = 1xC.A01;
        A0X22.A0D = str;
        DbY.A1K(r022, A0X22);
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0V);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1222860456);
        H1O.super.onCreate(bundle);
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(53);
        }
        if (!AnonymousClass7TF.A1Z(this.A0O)) {
            ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A0S)).A9Y(this.A0W);
        }
        C56534I0f i0f = (C56534I0f) this.A0K.getValue();
        String obj = this.A0L.getValue().toString();
        0qQ.A0B(obj, 0);
        UserSession userSession = i0f.A00;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "ig_collections");
        if (A0e.isSampled()) {
            A0e.AAJ("module_name", AnonymousClass7TF.A0j(obj));
            DbS.A1I(A0e, "collection_creation_enter");
            DbS.A1N(A0e, i0f.A01.A07);
            User A0j = DbT.A0j(userSession);
            0eP A1L = AnonymousClass7TE.A1L(AnonymousClass000.A00(625), String.valueOf(A0j.A03.BBu()));
            A0e.A9H(Location.EXTRAS, DbY.A0p(AnonymousClass000.A00(623), String.valueOf(A0j.A03.BAo()), A1L));
            A0e.Cgf();
        }
        AnonymousClass0fD.A09(357777363, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1437996051);
        0qQ.A0B(layoutInflater, 0);
        boolean A1Z = AnonymousClass7TF.A1Z(this.A0O);
        int i = R.layout.new_collection_fragment;
        if (A1Z) {
            i = R.layout.new_empty_collection_fragment;
        }
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, i, false);
        AnonymousClass0fD.A09(1056634270, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(934122527);
        super.onDestroy();
        ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A0S)).EEH(this.A0W);
        ((C337257fy) this.A0U.getValue()).DDU();
        AnonymousClass0fD.A09(478797048, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(2057575642);
        H1O.super.onStart();
        ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A0S)).DmJ(requireActivity());
        AnonymousClass0fD.A09(435210142, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1507005115);
        H1O.super.onStop();
        ((AnonymousClass3E6) AnonymousClass7TE.A14(this.A0S)).onStop();
        AnonymousClass0fD.A09(692740248, A022);
    }
}
