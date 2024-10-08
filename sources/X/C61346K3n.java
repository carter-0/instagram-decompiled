package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.sundial.edit.nux.EducationNuxType;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.ArrayList;

/* renamed from: X.K3n  reason: case insensitive filesystem */
public final class C61346K3n extends C240383Kr {
    public IgTextView A00;
    public Runnable A01;
    public IgdsMediaButton A02;
    public ArrayList A03;

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000d: MOVE  (r1v1 android.content.DialogInterface$OnDismissListener) = (r1v0 android.content.DialogInterface$OnDismissListener)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void onDismiss(android.content.DialogInterface r3) {
        /*
            r2 = this;
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.C61346K3n.super.onDismiss(r3)
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            boolean r0 = r1 instanceof android.content.DialogInterface.OnDismissListener
            if (r0 == 0) goto L_0x0014
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            if (r1 == 0) goto L_0x0014
            r1.onDismiss(r3)
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61346K3n.onDismiss(android.content.DialogInterface):void");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        EducationNuxType educationNuxType;
        0qQ.A0B(view, 0);
        IgdsMediaButton igdsMediaButton = (IgdsMediaButton) view.requireViewById(R.id.nux_media_button);
        LY4.A01(igdsMediaButton, 65, this);
        this.A02 = igdsMediaButton;
        LY4.A01(view, 66, this);
        this.A00 = DbT.A0a(view, R.id.nux_title);
        ArrayList arrayList = this.A03;
        if (arrayList != null) {
            educationNuxType = (EducationNuxType) 018.A13(arrayList);
        } else {
            educationNuxType = null;
        }
        A03(educationNuxType);
        A01();
    }

    private final void A01() {
        IgdsMediaButton igdsMediaButton;
        Resources A05;
        int i;
        ArrayList arrayList = this.A03;
        if (arrayList == null || !arrayList.isEmpty()) {
            igdsMediaButton = this.A02;
            if (igdsMediaButton != null) {
                A05 = DbV.A05(this);
                i = 2131968361;
            } else {
                return;
            }
        } else {
            igdsMediaButton = this.A02;
            if (igdsMediaButton != null) {
                A05 = DbV.A05(this);
                i = 2131968730;
            } else {
                return;
            }
        }
        igdsMediaButton.setLabel(A05.getText(i));
    }

    public static final void A02(C61346K3n k3n) {
        EducationNuxType educationNuxType;
        Runnable runnable = k3n.A01;
        if (runnable != null) {
            runnable.run();
        }
        ArrayList arrayList = k3n.A03;
        if (arrayList == null) {
            educationNuxType = null;
        } else if (arrayList.isEmpty()) {
            k3n.A08();
            return;
        } else {
            educationNuxType = (EducationNuxType) 018.A13(arrayList);
        }
        k3n.A03(educationNuxType);
        k3n.A01();
    }

    private final void A03(EducationNuxType educationNuxType) {
        if (educationNuxType == null || educationNuxType.ordinal() != 0) {
            A08();
            return;
        }
        View requireViewById = requireView().requireViewById(R.id.fling_nux_dot);
        requireViewById.setVisibility(0);
        View requireViewById2 = requireView().requireViewById(R.id.fling_nux_hand);
        requireViewById2.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(requireViewById, "translationY", new float[]{100.0f});
        ofFloat.setDuration(1200);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(requireViewById2, "translationY", new float[]{130.0f});
        ofFloat2.setDuration(1200);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.play(ofFloat2);
        animatorSet.setStartDelay(100);
        animatorSet.start();
        IgTextView igTextView = this.A00;
        if (igTextView != null) {
            igTextView.setText(DbV.A05(this).getText(2131969728));
        }
        this.A01 = new C66026M8l(animatorSet, requireViewById, requireViewById2);
    }

    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        int A022 = AnonymousClass0fD.A02(1208287787);
        C61346K3n.super.onCreate(bundle);
        A09(2, R.style.StackedTimelineNuxTheme);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            arrayList = bundle2.getParcelableArrayList("KEY_NUX_TYPES");
        } else {
            arrayList = null;
        }
        this.A03 = arrayList;
        AnonymousClass0fD.A09(-480433639, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(322352380);
        0qQ.A0B(layoutInflater, 0);
        C61346K3n.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.stacked_timeline_education_nux, viewGroup, false);
        AnonymousClass0fD.A09(-2035795996, A022);
        return inflate;
    }
}
