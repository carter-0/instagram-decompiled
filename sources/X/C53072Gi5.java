package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Gi5  reason: case insensitive filesystem */
public final class C53072Gi5 extends 2Rw {
    public List A00 = 0sn.A00;
    public final Context A01;
    public final C270564gw A02;
    public final UserSession A03;
    public final 1Xj A04;
    public final Map A05;

    public C53072Gi5(Context context, C270564gw r3, UserSession userSession, 1Xj r5, Map map) {
        0qQ.A0B(context, 1);
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = map;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C53125Gix(DbT.A0D(DbX.A0F(viewGroup, 0), viewGroup, R.layout.clips_template_landing_page_metadata_pills_item_layout, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r22, int i) {
        ImageView imageView;
        int A0B;
        C67231sQ A0n;
        C53125Gix gix = (C53125Gix) r22;
        0qQ.A0B(gix, 0);
        1Xj r5 = this.A04;
        if (r5 != null) {
            Context context = this.A01;
            UserSession userSession = this.A03;
            C270564gw r7 = this.A02;
            String str = (String) ((0eP) this.A00.get(i)).A00;
            0qQ.A0B(str, 4);
            int hashCode = str.hashCode();
            if (hashCode != -1306084975) {
                if (hashCode != 93166550) {
                    if (hashCode == 1362253043 && str.equals("clips_count")) {
                        DbX.A13(context, gix.A02, Integer.valueOf(r7.BrX().size()), 2131975060);
                        imageView = gix.A00;
                        A0B = R.drawable.instagram_templates_pano_filled_24;
                    } else {
                        return;
                    }
                } else if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND) && (A0n = C51966G9m.A0n(r5)) != null) {
                    String A042 = AnonymousClass3ZJ.A04(A0n.BUr(), A0n.BZB());
                    String A032 = AnonymousClass3ZJ.A03(A0n.BUr(), A0n.BZB());
                    0qQ.A07(A032);
                    boolean A0A = AnonymousClass3ZJ.A0A(A0n);
                    AnonymousClass4Ke r6 = new AnonymousClass4Ke(AnonymousClass3ZJ.A00(A0n.BZB()), A0n.AZY(), A042, A032, R.dimen.abc_text_size_menu_header_material, false, A0A, false, false, true, true, AnonymousClass3ZJ.A0D(userSession, r5), C263304Kd.A03(A0n), false);
                    SpannableStringBuilder A033 = AnonymousClass4Kf.A03(AnonymousClass7TF.A0A(context), AnonymousClass4Kf.A01(context, r6), AnonymousClass4Kf.A00(context, r6), userSession, r6, true);
                    IgTextView igTextView = gix.A01;
                    igTextView.setText(A033);
                    igTextView.setVisibility(0);
                    igTextView.setSelected(true);
                    gix.A02.setVisibility(8);
                    imageView = gix.A00;
                    A0B = R.drawable.instagram_music_pano_filled_12;
                } else {
                    return;
                }
            } else if (str.equals("effect")) {
                IgTextView igTextView2 = gix.A02;
                I0Y i0y = I0Y.A00;
                igTextView2.setText((CharSequence) i0y.A00(context, userSession, r5).A01);
                imageView = gix.A00;
                A0B = C51970G9q.A0B(i0y.A00(context, userSession, r5));
            } else {
                return;
            }
            imageView.setImageResource(A0B);
        }
    }

    public final int getItemCount() {
        Long BZc;
        C2605946h A1O;
        int A032 = AnonymousClass0fD.A03(1786077035);
        Map map = this.A05;
        Boolean A0v = AnonymousClass7TE.A0v();
        map.put("clips_count", A0v);
        1Xj r2 = this.A04;
        if (!(r2 == null || C51966G9m.A0n(r2) == null)) {
            Context context = this.A01;
            C67231sQ A0n = C51966G9m.A0n(r2);
            if (!(A0n == null || C291335gz.A01(A0n) == null) || ((A1O = r2.A1O()) != null && A1O.ACv(context).length() > 0)) {
                map.put(MediaStreamTrack.AUDIO_TRACK_KIND, A0v);
            }
        }
        C279514yl B0L = this.A02.B0L();
        if (B0L == null || (BZc = B0L.BZc()) == null || ((int) BZc.longValue()) != 0) {
            map.put("effect", A0v);
        }
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (AnonymousClass7TE.A1a(A1J.getValue())) {
                Dbb.A1V(A1J, A1H);
            }
        }
        List A002 = 01U.A00(A1H);
        this.A00 = A002;
        int size = A002.size();
        AnonymousClass0fD.A0A(1948480140, A032);
        return size;
    }
}
