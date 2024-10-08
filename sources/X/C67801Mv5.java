package X;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Mv5  reason: case insensitive filesystem */
public final class C67801Mv5 extends 2Rw {
    public int A00;
    public int A01;
    public final Fragment A02;
    public final UserSession A03;
    public final ArrayList A04;
    public final ArrayList A05;
    public final ArrayList A06;

    public C67801Mv5(Fragment fragment, UserSession userSession, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        0qQ.A0B(userSession, 4);
        this.A04 = arrayList;
        this.A05 = arrayList2;
        this.A06 = arrayList3;
        this.A03 = userSession;
        this.A02 = fragment;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r12, int i) {
        Uri uri;
        ArrayList arrayList;
        Object obj;
        AnonymousClass19S A022;
        int i2;
        C67996MyO myO = (C67996MyO) r12;
        0qQ.A0B(myO, 0);
        ArrayList arrayList2 = this.A04;
        if (arrayList2 != null && (uri = (Uri) arrayList2.get(i)) != null) {
            String type = this.A02.requireContext().getContentResolver().getType(uri);
            if (type != null) {
                if (C66580MXl.A1a("image", 1, type)) {
                    ArrayList arrayList3 = this.A05;
                    if (arrayList3 != null) {
                        obj = arrayList3.get(this.A00);
                        0qQ.A07(obj);
                        this.A00++;
                        A022 = 19E.A02(DbX.A0c(AnonymousClass12T.A00));
                        i2 = 15;
                    }
                } else if (C66580MXl.A1a(MediaStreamTrack.VIDEO_TRACK_KIND, 1, type) && (arrayList = this.A06) != null) {
                    obj = arrayList.get(this.A01);
                    0qQ.A07(obj);
                    this.A01++;
                    A022 = 19E.A02(AnonymousClass12T.A00.A04);
                    i2 = 16;
                }
                AnonymousClass7TE.A1Z(new C66929MfO(myO, obj, this, (AnonymousClass4D7) null, i2), A022);
            }
            if (arrayList2.size() > 4 && i == 3) {
                TextView textView = myO.A00;
                if (textView != null) {
                    textView.setVisibility(0);
                    textView.setText(002.A00('+', arrayList2.size() - 4));
                }
                ? r0 = myO.A03;
                if (r0 != 0) {
                    r0.setVisibility(0);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int itemCount = getItemCount();
        LayoutInflater A0D = DbV.A0D(viewGroup);
        int i2 = R.layout.direct_private_share_write_message_thumbnail_small_media_item;
        if (itemCount == 1) {
            i2 = R.layout.direct_private_share_write_message_thumbnail_media_item;
        }
        return new C67996MyO(A0D.inflate(i2, viewGroup, false));
    }

    public final int getItemCount() {
        int i;
        int A032 = AnonymousClass0fD.A03(-576717249);
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        int min = Math.min(i, 4);
        AnonymousClass0fD.A0A(-838574144, A032);
        return min;
    }
}
