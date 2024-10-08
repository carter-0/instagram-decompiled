package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.Oaq  reason: case insensitive filesystem */
public final class C71071Oaq {
    public static final C71071Oaq A00 = new Object();

    public static final void A01(Fragment fragment, UserSession userSession, N2M n2m) {
        boolean z;
        Class cls;
        int[] iArr;
        0qQ.A0B(userSession, 0);
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            z = C71106Ock.A02(activity);
        } else {
            z = false;
        }
        Bundle A002 = A00(userSession, n2m, z);
        new AnonymousClass43E(userSession).A00(AnonymousClass05K.A01);
        if (C249223jK.A06(userSession)) {
            cls = TransparentModalActivity.class;
        } else {
            cls = ModalActivity.class;
        }
        AnonymousClass6W8 A0b = DbS.A0b(fragment.getActivity(), A002, userSession, cls, "notes_creation");
        if (!C249223jK.A06(userSession)) {
            A0b.A07();
        } else {
            if (C71106Ock.A00.A04(userSession)) {
                iArr = ModalActivity.A08;
            } else {
                iArr = AnonymousClass6W8.A0Q;
            }
            A0b.A0J = iArr;
        }
        DbT.A1M(fragment, A0b);
    }

    public static final Bundle A00(UserSession userSession, N2M n2m, boolean z) {
        Bundle A002 = Q21.A00(AnonymousClass7TE.A1L("replace_note", Boolean.valueOf(n2m.A0C)), AnonymousClass7TE.A1L("content_container_module", n2m.A05), AnonymousClass7TE.A1L("content_event_source", n2m.A00), AnonymousClass7TE.A1L("content_inventory_source", n2m.A09), AnonymousClass7TE.A1L("content_ranking_info_token", n2m.A0B), AnonymousClass7TE.A1L("content_media_position", n2m.A04), AnonymousClass7TE.A1L("content_carousel_child_id", n2m.A06), AnonymousClass7TE.A1L("content_preview_url", n2m.A01), AnonymousClass7TE.A1L("content_id", n2m.A07), AnonymousClass7TE.A1L("content_media_code", n2m.A08), AnonymousClass7TE.A1L("arg_is_in_immersive_mode", Boolean.valueOf(C249223jK.A06(userSession))), AnonymousClass7TE.A1L("arg_immersive_content_notes_ui_state", new ContentNotesImmersiveCreationUiState(n2m.A02, n2m.A0A, z)));
        Integer num = n2m.A03;
        if (num != null) {
            A002.putInt("content_carousel_child_index", num.intValue());
        }
        return A002;
    }

    public final void A02(UserSession userSession, N2M n2m, WeakReference weakReference) {
        Class cls;
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            Bundle A002 = A00(userSession, n2m, C71106Ock.A02(activity));
            if (C249223jK.A06(userSession)) {
                cls = TransparentModalActivity.class;
            } else {
                cls = ModalActivity.class;
            }
            Dbb.A0i(activity, A002, userSession, cls, "notes_creation");
        }
    }
}
