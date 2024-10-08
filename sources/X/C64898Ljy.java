package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.contentnotes.domain.uistate.NotesPogThoughtBubbleUiState;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.Ljy  reason: case insensitive filesystem */
public final class C64898Ljy implements AnonymousClass33B {
    public final Fragment A00;
    public final UserSession A01;
    public final C63609Kzx A02;
    public final C63890LAt A03;
    public final AnonymousClass0eM A04 = MMC.A00(this, 43);
    public final boolean A05;
    public final boolean A06;
    public final C262224Cq A07;

    public C64898Ljy(Fragment fragment, UserSession userSession, C63609Kzx kzx, C63890LAt lAt, C262224Cq r6, boolean z, boolean z2) {
        DbW.A1O(userSession, 1, kzx);
        this.A01 = userSession;
        this.A00 = fragment;
        this.A07 = r6;
        this.A05 = z;
        this.A03 = lAt;
        this.A02 = kzx;
        this.A06 = z2;
    }

    public final void D5w(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, C62320sa r2) {
    }

    public final void DIP(NoteCustomTheme noteCustomTheme, ContentNoteMetadata contentNoteMetadata, AnonymousClass4DU r3, Integer num, Long l, String str, List list, boolean z, boolean z2) {
    }

    public final void DPF(AnonymousClass0iw r1, AnonymousClass4GS r2, C54692HOx hOx, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, boolean z) {
    }

    public final void DUq(C247003fc r1, 1Xj r2, Integer num, WeakReference weakReference, C62320sa r5, 0sP r6) {
    }

    public final void DVf(View view, NoteCustomTheme noteCustomTheme, ContentNoteMetadata contentNoteMetadata, AnonymousClass4DU r4, Integer num, Integer num2, Long l, String str, boolean z, boolean z2) {
    }

    public final void DVn(Fragment fragment, C273494mf r2) {
    }

    public final void Diu(View view, Fragment fragment, ContentNoteMetadata contentNoteMetadata, NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, AnonymousClass4DU r5, Integer num) {
    }

    public final void Div(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, Integer num, String str) {
        AnonymousClass7TE.A1Z(new MHM(notesPogThoughtBubbleUiState, this, num, str, (AnonymousClass4D7) null), this.A07);
    }

    public final void EbG(0sP r1) {
    }

    public final void Euu(NotesPogThoughtBubbleUiState notesPogThoughtBubbleUiState, Integer num, String str) {
    }
}
