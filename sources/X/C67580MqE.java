package X;

import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.MqE  reason: case insensitive filesystem */
public final class C67580MqE extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ AnonymousClass4AT A00;
    public final /* synthetic */ C67582MqG A01;
    public final /* synthetic */ boolean A02;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        long j;
        0qQ.A0B(motionEvent, 0);
        AnonymousClass4AT r4 = this.A00;
        if (!r4.A0G && 0qQ.A0K(r4.A0C, "media_note_author_stack")) {
            C71110Ocp ocp = C71110Ocp.A00;
            C67582MqG mqG = this.A01;
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            UserSession userSession = mqG.A03;
            FragmentActivity fragmentActivity = mqG.A01;
            AnonymousClass0iw r7 = mqG.A02;
            AnonymousClass4AD r11 = mqG.A0B;
            String str = r4.A08;
            if (str != null) {
                j = Long.parseLong(str);
            } else {
                j = 0;
            }
            User user = r4.A06;
            String id = user.getId();
            String username = user.getUsername();
            ImageUrl Bh3 = user.Bh3();
            String str2 = (String) 00k.A0A(r4.A0E.keySet());
            if (str2 == null) {
                str2 = "";
            }
            ocp.A07(fragmentActivity, r7, userSession, Bh3, new ContentNoteMetadata((ImageUrl) null, user, (Integer) null, (Integer) null, str2, (String) null, str, r7.getModuleName(), (String) null, (String) null, (String) null, false), r11, (AnonymousClass6ZA) null, id, username, j, true, false, false);
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C66947Mfg mfg;
        String str;
        User A0g;
        0qQ.A0B(motionEvent, 0);
        C67582MqG mqG = this.A01;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = mqG.A03;
        C3018760k A012 = C3018660j.A01(userSession);
        AnonymousClass4AT r1 = this.A00;
        C319726r6 r12 = C319726r6.POG;
        String id = r1.A06.getId();
        String str2 = r1.A0C;
        if (0qQ.A0K(str2, "media_note_author_stack")) {
            mfg = C66947Mfg.MEDIA_NOTES_AUTHOR;
        } else {
            mfg = C66947Mfg.MEDIA_NOTES_STACK;
        }
        List A1I = AnonymousClass7TE.A1I(mfg);
        int i2 = r1.A01;
        A012.A01 = new C319496qh((C319746r9) null, r12, (C319736r8) null, (NoteAudience) null, DbS.A0j(r1.A04), (Long) null, id, (String) null, r1.A08, (String) null, A1I, i2, false);
        A012.A0B(C69506Nmo.A0b);
        boolean A0K = 0qQ.A0K(str2, "media_note_author_stack");
        0Tu r0 = 0Tu.A05;
        if (A0K) {
            boolean A06 = 182.A06(r0, userSession, 36328263614479527L);
            List list = r1.A0D;
            if (list == null || (A0g = DbS.A0g(list, 0)) == null) {
                str = null;
            } else {
                str = A0g.getId();
            }
            C67582MqG.A02(r1, mqG, str, (String) 00k.A0A(r1.A0E.keySet()), false, A06);
            return true;
        }
        C67582MqG.A02(r1, mqG, (String) null, (String) 00k.A0A(r1.A0E.keySet()), true, 182.A06(r0, userSession, 2342171272827583648L));
        return true;
    }

    public C67580MqE(AnonymousClass4AT r1, C67582MqG mqG, boolean z) {
        this.A01 = mqG;
        this.A00 = r1;
        this.A02 = z;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.A02) {
            AnonymousClass4AT r4 = this.A00;
            if (!AnonymousClass7TF.A1Y(r4.A07, true)) {
                C67582MqG mqG = this.A01;
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                if (182.A06(0Tu.A05, mqG.A03, 36323161194834888L)) {
                    String str = (String) 00k.A0A(r4.A0E.keySet());
                    String str2 = r4.A08;
                    if (!(str == null || str2 == null)) {
                        AnonymousClass2S0.A01.A04();
                        C69990NvU.A00((Drawable) null, mqG.A07, mqG.A05, new C51804G2n((Object) mqG, str, str2, 24));
                    }
                }
            }
        }
        return true;
    }
}
