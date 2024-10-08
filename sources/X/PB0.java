package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.util.List;
import org.webrtc.CameraCapturer;

public final class PB0 implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7DZ A01;

    /* JADX WARNING: type inference failed for: r8v0, types: [X.7XR, X.7XX] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.PB0 A00(X.AnonymousClass0iw r7, X.AnonymousClass7XR r8, X.AnonymousClass9HC r9) {
        /*
            r6 = r9
            boolean r1 = r9.A1X
            X.77j r0 = new X.77j
            r0.<init>(r1)
            X.P81 r2 = new X.P81
            r5 = r8
            r2.<init>(r8)
            X.77k r3 = r0.A00(r8)
            X.7DV r4 = new X.7DV
            r4.<init>(r8, r1)
            X.77l r1 = new X.77l
            r1.<init>(r2, r3, r4, r5, r6)
            X.7DY[] r0 = new X.AnonymousClass7DY[]{r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            X.7DZ r1 = new X.7DZ
            r1.<init>(r0)
            X.PB0 r0 = new X.PB0
            r0.<init>(r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PB0.A00(X.0iw, X.7XR, X.9HC):X.PB0");
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r12, AnonymousClass7FW r13) {
        View view;
        IgImageView igImageView;
        TextView textView;
        int i;
        C72576PBh pBh = (C72576PBh) r12;
        NYQ nyq = (NYQ) r13;
        LinearLayout linearLayout = pBh.A02;
        AnonymousClass0iw r5 = this.A00;
        pBh.A07.A03(8);
        pBh.A06.A03(8);
        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = pBh.A09;
        roundedCornerMediaFrameLayout.setVisibility(8);
        IgProgressImageView igProgressImageView = pBh.A08;
        igProgressImageView.A04();
        C71662eb r3 = pBh.A04;
        r3.A03(8);
        C71662eb r7 = pBh.A05;
        r7.A03(8);
        int i2 = 8388611;
        if (nyq.CU2()) {
            i2 = 8388613;
        }
        linearLayout.setGravity(i2);
        roundedCornerMediaFrameLayout.A00 = 0.6666667f;
        igProgressImageView.setAspectRatio(0.6666667f);
        C69604Nom nom = nyq.A02;
        if (nom instanceof C68860NZs) {
            C68860NZs nZs = (C68860NZs) nom;
            roundedCornerMediaFrameLayout.setVisibility(0);
            float A002 = (float) C3265577g.A00(nyq.A00);
            roundedCornerMediaFrameLayout.A01(A002, A002, A002, A002);
            C328667Fr r8 = nyq.A01;
            AnonymousClass777 r2 = r8.A0F;
            if (r2 instanceof AnonymousClass776) {
                igProgressImageView.setExpiration(nZs.A01);
                igProgressImageView.setUrl(((AnonymousClass776) r2).A00, r5);
            } else if (r2 instanceof C68849NZh) {
                igProgressImageView.setBackgroundColor(((C68849NZh) r2).A00);
            } else {
                throw C66582MXn.A0k(r2, "Invalid MediaFields: ", AnonymousClass7TE.A1A());
            }
            if (nZs.A05) {
                r7.A03(8);
                view = r3.A01();
                DbT.A1F(view, R.id.iglive_label_row_layout, 0);
                AnonymousClass3NV r22 = nZs.A03;
                AnonymousClass3NV r72 = AnonymousClass3NV.A0A;
                C240913Nc r1 = pBh.A00;
                if (r1 == null) {
                    r1 = C240903Nb.A00(r3.A01(), R.id.iglive_label_image_stub);
                    pBh.A00 = r1;
                }
                if (r22 == r72) {
                    r1.A00().setVisibility(0);
                } else if (r1.A01()) {
                    r1.A00().setVisibility(8);
                }
                View requireViewById = view.requireViewById(R.id.iglive_label_layout);
                switch (DbU.A02(r22, 0)) {
                    case 0:
                    case 4:
                        i = R.drawable.live_label_background;
                        break;
                    case 1:
                        i = R.drawable.live_practice_label_background;
                        break;
                    case 2:
                        i = R.drawable.live_subscribers_label_background;
                        break;
                    case 3:
                        i = R.drawable.live_close_friends_label_background;
                        break;
                    case 5:
                        i = R.drawable.live_channel_label_background;
                        break;
                    case 6:
                        i = R.drawable.live_internal_label_background;
                        break;
                    default:
                        throw AnonymousClass7TE.A1K();
                }
                requireViewById.setBackgroundResource(i);
                igImageView = DbT.A0b(view, R.id.reel_viewer_profile_picture);
                textView = DbU.A0G(view, R.id.iglive_header_main_text);
                DbT.A1F(view, R.id.iglive_header_close, 8);
                View requireViewById2 = view.requireViewById(R.id.iglive_view_count_container);
                int i3 = nZs.A00;
                if (i3 > 0) {
                    TextView A0G = DbU.A0G(view, R.id.iglive_view_count);
                    requireViewById2.setVisibility(0);
                    Integer valueOf = Integer.valueOf(i3);
                    Resources resources = A0G.getResources();
                    0qQ.A0B(resources, 1);
                    A0G.setText(C253673rC.A04(resources, valueOf, CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false));
                } else {
                    requireViewById2.setVisibility(8);
                }
            } else {
                r3.A03(8);
                view = r7.A01();
                igImageView = DbT.A0b(view, R.id.reel_viewer_profile_picture);
                textView = DbU.A0G(view, R.id.primary_text);
            }
            view.setVisibility(0);
            AnonymousClass774 r23 = r8.A0E;
            r23.getClass();
            List list = r23.A0A;
            if (!list.isEmpty()) {
                igImageView.setUrl((ImageUrl) list.get(0), r5);
            }
            if (list.size() > 1) {
                0wb.A03("LiveViewerInviteContentDefinition", "Header icons size was larger than expected");
            }
            textView.setText(r23.A03);
            String str = nZs.A04;
            if (str != null && !str.isEmpty()) {
                pBh.A03.setText(str);
            }
        }
        this.A01.A02(pBh, nyq);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        this.A01.A01(r2);
    }

    public PB0(AnonymousClass0iw r1, AnonymousClass7DZ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.direct_live_viewer_invite_message);
        AnonymousClass7PV.A01(A0C);
        C72576PBh pBh = new C72576PBh(A0C);
        this.A01.A00(pBh);
        return pBh;
    }
}
