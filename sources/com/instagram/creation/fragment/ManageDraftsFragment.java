package com.instagram.creation.fragment;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0fU;
import X.AnonymousClass7TF;
import X.C273374mT;
import X.C3499582p;
import X.C63463KxS;
import X.C66218MIz;
import X.C66291MMa;
import X.DbS;
import X.DbT;
import X.DbU;
import X.JTS;
import X.JWE;
import X.JWZ;
import X.K9A;
import X.LYB;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class ManageDraftsFragment extends C273374mT {
    public K9A A00;
    public C3499582p A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AnonymousClass0eM A05 = DbS.A0I(new C66218MIz(this, 14), new C66218MIz(this, 13), C66291MMa.A00((Object) null, this, 45), DbS.A0z(JWZ.class));
    public final String A06 = "manage_drafts";
    public View actionButton;
    public View cancelButton;
    public TextView titleView;

    public final void onViewCreated(View view, Bundle bundle) {
        ImageView imageView;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        GridView gridView = (GridView) AnonymousClass7TF.A0F(view, R.id.drafts_grid);
        K9A k9a = this.A00;
        if (k9a == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        gridView.setAdapter(k9a);
        gridView.setNumColumns(3);
        C3499582p r0 = this.A01;
        if (r0 == null || !JWE.A01(r0).A0M) {
            this.actionButton = requireActivity().requireViewById(R.id.next_button_imageview);
            TextView textView = (TextView) requireActivity().requireViewById(R.id.action_bar_textview_title);
            this.titleView = textView;
            if (textView != null) {
                textView.setAccessibilityHeading(true);
            }
            imageView = requireActivity().requireViewById(R.id.button_back);
        } else {
            View A0C = JTS.A0C(view, R.id.action_bar);
            if (this.A04 || this.A03) {
                0qQ.A0A(A0C);
                view = A0C;
            }
            View requireViewById = view.requireViewById(R.id.next_button_imageview);
            this.actionButton = requireViewById;
            if (requireViewById != null) {
                requireViewById.setVisibility(0);
            }
            TextView A0G = DbU.A0G(view, R.id.action_bar_textview_title);
            this.titleView = A0G;
            if (A0G != null) {
                A0G.setAccessibilityHeading(true);
            }
            TextView textView2 = this.titleView;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            LYB lyb = new LYB((Object) this, 37);
            ImageView A0G2 = DbS.A0G(view, R.id.action_bar_cancel);
            imageView = A0G2;
            if (A0G2 != null) {
                Context context = view.getContext();
                A0G2.setImageResource(R.drawable.instagram_x_pano_outline_24);
                AnonymousClass0fU.A00(lyb, A0G2);
                DbT.A1A(context.getResources(), A0G2, 2131954722);
                imageView = A0G2;
            }
        }
        this.cancelButton = imageView;
        View view2 = this.actionButton;
        if (view2 != null) {
            LYB.A00(view2, 38, this);
        }
        A00(this);
    }

    public static final void A00(ManageDraftsFragment manageDraftsFragment) {
        ImageView imageView;
        int i = 2131961037;
        if (manageDraftsFragment.A02) {
            i = 2131958477;
        }
        TextView textView = manageDraftsFragment.titleView;
        if (textView != null) {
            textView.setText(i);
        }
        View view = manageDraftsFragment.actionButton;
        if ((view instanceof ImageView) && (imageView = (ImageView) view) != null) {
            boolean z = manageDraftsFragment.A02;
            int i2 = R.drawable.instagram_edit_pano_outline_24;
            if (z) {
                i2 = R.drawable.instagram_check_pano_filled_24;
            }
            imageView.setImageResource(i2);
        }
        View view2 = manageDraftsFragment.actionButton;
        if (view2 != null) {
            int i3 = 2131961425;
            if (manageDraftsFragment.A02) {
                i3 = 2131972502;
            }
            view2.setContentDescription(manageDraftsFragment.getString(i3));
        }
    }

    public final String getModuleName() {
        return this.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x008c, code lost:
        if (r4 != null) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r35) {
        /*
            r34 = this;
            r0 = 2027553342(0x78da023e, float:3.5373944E34)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r3 = r34
            r0 = r35
            com.instagram.creation.fragment.ManageDraftsFragment.super.onCreate(r0)
            android.content.res.Resources r0 = X.DbV.A05(r3)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / 3
            float r0 = (float) r0
            int r5 = X.AnonymousClass1GB.A01(r0)
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "is_navigating_from_content_management"
            boolean r0 = r1.getBoolean(r0)
            r3.A04 = r0
            android.os.Bundle r1 = r3.requireArguments()
            r0 = 3443(0xd73, float:4.825E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0)
            r3.A03 = r0
            android.content.Context r4 = r3.requireContext()
            com.instagram.common.session.UserSession r1 = r3.getSession()
            X.8XV r0 = new X.8XV
            r0.<init>(r1, r5)
            X.K9A r5 = new X.K9A
            r5.<init>(r4, r0, r3)
            r3.A00 = r5
            com.instagram.common.session.UserSession r0 = r3.getSession()
            java.util.ArrayList r4 = X.JX7.A00(r0)
            java.util.ArrayList r1 = r5.A01
            r1.clear()
            java.util.ArrayList r0 = r5.A02
            r0.clear()
            r1.addAll(r4)
            X.K9A.A00(r5)
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "previousCreationSession"
            android.os.Parcelable r4 = r1.getParcelable(r0)
            com.instagram.creation.base.CreationSession r4 = (com.instagram.creation.base.CreationSession) r4
            if (r4 != 0) goto L_0x008e
            android.content.Context r0 = r3.requireContext()
            boolean r0 = r0 instanceof X.C267854cK
            if (r0 == 0) goto L_0x00d4
            android.content.Context r1 = r3.requireContext()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.base.SessionProvider"
            X.0qQ.A0C(r1, r0)
            X.4cK r1 = (X.C267854cK) r1
            com.instagram.creation.base.CreationSession r4 = r1.AsK()
            if (r4 == 0) goto L_0x00e5
        L_0x008e:
            com.instagram.common.session.UserSession r1 = r3.getSession()
            X.28D r0 = X.28D.A5J
            r6 = 0
            r26 = 0
            r29 = 1
            X.82Y r5 = new X.82Y
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r6
            r25 = r6
            r27 = r26
            r28 = r26
            r30 = r26
            r31 = r26
            r32 = r26
            r33 = r26
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.82p r0 = X.JWD.A00(r0, r1, r4, r5)
            r3.A01 = r0
            r0 = -672196466(0xffffffffd7ef188e, float:-5.25777481E14)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x00d4:
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x00e5
            com.instagram.creation.base.CreationSession r4 = new com.instagram.creation.base.CreationSession
            r4.<init>()
            X.36W r0 = X.AnonymousClass36W.FOLLOWERS_SHARE
            r4.A0A = r0
            r0 = 1
            r4.A0M = r0
            goto L_0x008e
        L_0x00e5:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 639969163(0x2625278b, float:5.7299465E-16)
            X.AnonymousClass0fD.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.ManageDraftsFragment.onCreate(android.os.Bundle):void");
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return C63463KxS.A00(this, i2, z);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(703151268);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_drafts_grid, viewGroup, false);
        AnonymousClass0fD.A09(-561857714, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-581468953);
        super.onDestroyView();
        ManageDraftsFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(-430434364, A022);
    }
}
