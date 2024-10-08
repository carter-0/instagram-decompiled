package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.W9w  reason: case insensitive filesystem */
public final class C18858W9w implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C18858W9w(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        if (this.A00 != 0) {
            A05 = AnonymousClass0fD.A05(-802617866);
            User user = (User) this.A02;
            if (user != null) {
                ((C17809VgM) this.A03).A01.Dw7(user, ((AnonymousClass0iw) this.A01).getModuleName());
            }
            i = -586458759;
        } else {
            A05 = AnonymousClass0fD.A05(783044034);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new U0F(4, this.A02, view));
            animatorSet.playTogether(new Animator[]{(ValueAnimator) this.A03, (ValueAnimator) this.A01});
            animatorSet.start();
            i = -907433667;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
