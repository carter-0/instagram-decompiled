package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;

/* renamed from: X.739  reason: invalid class name */
public final class AnonymousClass739 extends ClickableSpan {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass70J A02;
    public final /* synthetic */ User A03;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        Context context = this.A01;
        textPaint.setColor(context.getColor(2Yu.A0H(context, this.A00)));
        textPaint.setUnderlineText(false);
    }

    public AnonymousClass739(Context context, AnonymousClass70J r2, User user, int i) {
        this.A02 = r2;
        this.A03 = user;
        this.A01 = context;
        this.A00 = i;
    }

    public final void onClick(View view) {
        C50672FgX A022;
        AnonymousClass70J r0 = this.A02;
        if (r0 != null && (A022 = r0.A02()) != null) {
            User user = this.A03;
            AnonymousClass37E r02 = AnonymousClass37D.A00;
            FragmentActivity fragmentActivity = A022.A00;
            AnonymousClass37D A012 = r02.A01(fragmentActivity);
            if (A012 != null) {
                AnonymousClass37F r1 = (AnonymousClass37F) A012;
                if (r1.A0g && r1.A0n) {
                    Bundle bundle = new Bundle();
                    bundle.putString("category_name", user.A03.getCategory());
                    bundle.putString("category_id", String.valueOf(user.A03.AmI()));
                    bundle.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user.getId());
                    AnonymousClass6W8 r3 = new AnonymousClass6W8(fragmentActivity, bundle, A022.A02, ModalActivity.class, "clickable_category");
                    r3.A08();
                    r3.A0C(fragmentActivity);
                    return;
                }
            }
            C323246xB r5 = A022.A05;
            C46447Df9.A03();
            String category = user.A03.getCategory();
            String valueOf = String.valueOf(user.A03.AmI());
            String id = user.getId();
            Bundle bundle2 = new Bundle();
            bundle2.putString("category_name", category);
            bundle2.putString("category_id", valueOf);
            bundle2.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, id);
            E1U e1u = new E1U();
            e1u.setArguments(bundle2);
            r5.A03(e1u, "clickable_category", true);
            r5.A00();
        }
    }
}
