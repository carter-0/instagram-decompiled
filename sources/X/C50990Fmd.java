package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.Fmd  reason: case insensitive filesystem */
public final class C50990Fmd implements C273634mu {
    public final /* synthetic */ DirectPrivateStoryRecipientController A00;

    public final void DFX(View view) {
    }

    public final void DS0() {
    }

    public final void Dhs(View view, C67301Mlb mlb) {
    }

    public C50990Fmd(DirectPrivateStoryRecipientController directPrivateStoryRecipientController) {
        this.A00 = directPrivateStoryRecipientController;
    }

    public final void Dhq(View view, Integer num) {
        String str;
        long j;
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        C48140EZi eZi = C48140EZi.SHARE_SHEET_SEARCHBAR;
        Bundle A0a = AnonymousClass7TE.A0a();
        AnonymousClass4DH r5 = directPrivateStoryRecipientController.A0w;
        A0a.putString("DirectVisualMessageCreateGroupFragment.DIRECT_MODULE", r5.getModuleName());
        A0a.putSerializable("bundle_extra_serializable_group_creation_entry_point", eZi);
        FZ0 fz0 = directPrivateStoryRecipientController.A1E;
        if (fz0 != null) {
            A0a.putBoolean("DirectVisualMessageCreateGroupFragment.SHOULD_REWRITE_LOGGING", true);
            1iA r0 = directPrivateStoryRecipientController.A0M;
            if (r0 != null) {
                j = (long) r0.A00;
            } else {
                j = -1;
            }
            A0a.putLong("DirectVisualMessageCreateGroupFragment.MEDIA_TYPE_LOGGING_VALUE", j);
            A0a.putString("DirectVisualMessageCreateGroupFragment.REQUEST_ID_LOGGING_VALUE", directPrivateStoryRecipientController.A0U);
            fz0.A05();
        }
        if (DbY.A1Y(0Tu.A05, directPrivateStoryRecipientController.A0B, 36324385259204679L)) {
            str = C273654mx.A00(667);
        } else {
            str = "direct_story_create_group";
        }
        Object A002 = 0mE.A00(r5.getContext(), Activity.class);
        A002.getClass();
        DbS.A0b((Activity) A002, A0a, directPrivateStoryRecipientController.A0B, TransparentModalActivity.class, str).A0D(r5, 2001);
    }

    public final void Dhr() {
        DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A00;
        directPrivateStoryRecipientController.mSearchController.A02(true, 0.0f);
        FZ0 fz0 = directPrivateStoryRecipientController.A1E;
        if (fz0 != null) {
            directPrivateStoryRecipientController.A07 = C48136EZe.SEARCH_NULL_STATE;
            fz0.A05();
        }
    }
}
