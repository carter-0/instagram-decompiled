package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.JqI  reason: case insensitive filesystem */
public final class C60729JqI extends C14191TrW {
    public final List A00;
    public final Fragment A01;
    public final UserSession A02;
    public final K4J A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60729JqI(Fragment fragment, UserSession userSession, K4J k4j, List list) {
        super(fragment);
        0qQ.A0B(userSession, 2);
        this.A01 = fragment;
        this.A02 = userSession;
        this.A00 = list;
        this.A03 = k4j;
    }

    public final Fragment A03(int i) {
        C61072JwA jwA = (C61072JwA) 00k.A0O(this.A00, i);
        if (jwA == null) {
            return new Fragment();
        }
        C62519KhA khA = (C62519KhA) jwA.A02;
        int i2 = jwA.A01;
        K4J k4j = this.A03;
        C51972G9s.A1B(khA, k4j);
        K4P k4p = new K4P();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt(DevServerEntity.COLUMN_DESCRIPTION, i2);
        A0a.putSerializable(MediaStreamTrack.VIDEO_TRACK_KIND, khA);
        A0a.putInt("position", i);
        k4p.setArguments(A0a);
        k4p.A01 = k4j;
        return k4p;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1373983984);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(806985501, A032);
        return size;
    }
}
