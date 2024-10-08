package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.facebook.smartcapture.ui.view.ArrowHintView;
import com.instagram.common.ui.text.ExpandableTextView;
import java.util.ArrayList;

/* renamed from: X.TtS  reason: case insensitive filesystem */
public final class C14294TtS extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C14294TtS(View view, ViewPropertyAnimator viewPropertyAnimator, V4J v4j, AnonymousClass3AQ r4, int i) {
        this.A00 = i;
        this.A01 = r4;
        this.A02 = v4j;
        if (i != 0) {
            this.A04 = viewPropertyAnimator;
            this.A03 = view;
        } else {
            this.A03 = viewPropertyAnimator;
            this.A04 = view;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [android.widget.TextView, com.instagram.common.ui.text.ExpandableTextView, android.view.View] */
    public final void onAnimationEnd(Animator animator) {
        AnonymousClass3AQ r3;
        ArrayList arrayList;
        C249703kE r0;
        CharSequence charSequence;
        int i;
        switch (this.A00) {
            case 0:
                ((ViewPropertyAnimator) this.A03).setListener((Animator.AnimatorListener) null);
                C13989Tnp.A16((View) this.A04);
                r3 = (AnonymousClass3AQ) this.A01;
                V4J v4j = (V4J) this.A02;
                r3.A0C(v4j.A05);
                arrayList = r3.A02;
                r0 = v4j.A05;
                break;
            case 1:
                ((ViewPropertyAnimator) this.A04).setListener((Animator.AnimatorListener) null);
                C13989Tnp.A16((View) this.A03);
                r3 = (AnonymousClass3AQ) this.A01;
                V4J v4j2 = (V4J) this.A02;
                r3.A0C(v4j2.A04);
                arrayList = r3.A02;
                r0 = v4j2.A04;
                break;
            case 2:
                RFH rfh = (RFH) this.A03;
                C7927Qcy.A00(rfh, (C7927Qcy) this.A04);
                ((ArrowHintView) this.A01).setCaptureState(rfh);
                ((Runnable) this.A02).run();
                return;
            case 3:
                ? r4 = (ExpandableTextView) this.A01;
                int i2 = 0;
                r4.A02 = false;
                if (!((C17960Vit) this.A02).A00.A0O) {
                    int width = ((C68048MzF) this.A03).A01.getWidth();
                    ViewGroup.LayoutParams layoutParams = r4.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        i = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    } else {
                        i = 0;
                    }
                    ViewGroup.LayoutParams layoutParams2 = r4.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        i2 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    }
                    charSequence = r4.A00(((N3A) this.A04).A03, AnonymousClass7TF.A0d(DbU.A05(r4), 2131972827), width - (i + i2));
                } else {
                    charSequence = ((N3A) this.A04).A03;
                }
                r4.setText(charSequence);
                return;
            default:
                return;
        }
        arrayList.remove(r0);
        r3.A0V();
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 0:
            case 1:
                return;
            case 4:
                ((View) this.A01).setVisibility(0);
                View view = (View) this.A03;
                0qQ.A0A(view);
                ((View) this.A02).setVisibility(0);
                2eQ.A06(view, 500);
                view.setAccessibilityLiveRegion(2);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public C14294TtS(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj4;
        this.A02 = obj2;
        this.A03 = obj3;
    }
}
