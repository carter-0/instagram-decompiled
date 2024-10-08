package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.List;

/* renamed from: X.Udi  reason: case insensitive filesystem */
public final class C15493Udi extends C231632rz {
    public int A00;
    public Context A01;
    public C15384Ubj A02;
    public AnonymousClass0iw A03;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C270194gL r0;
        ImageUrl A022;
        boolean z;
        Object obj3 = obj2;
        Object obj4 = obj;
        int A032 = AnonymousClass0fD.A03(1119709469);
        if (view == null) {
            view = createView(i, (ViewGroup) null);
        }
        VRH vrh = (VRH) DbT.A0o(view);
        C3251571g r13 = ((VRG) obj4).A00;
        AnonymousClass6u8 r3 = (AnonymousClass6u8) obj3;
        C15384Ubj ubj = this.A02;
        AnonymousClass0iw r10 = this.A03;
        0qQ.A0B(vrh, 0);
        AnonymousClass7TF.A1C(r3, 2, ubj);
        0qQ.A0B(r10, 4);
        View view2 = vrh.A00;
        0nA.A0X(view2, C13990Tnq.A08(view2, r3.A04 ? 1 : 0));
        List list = vrh.A01;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C19513Waz waz = (C19513Waz) list.get(i2);
            if (i2 < r13.A01()) {
                VXR vxr = (VXR) r13.A02(i2);
                if (vxr != null) {
                    int intValue = vxr.A01.intValue();
                    0qQ.A0B(waz, 0);
                    if (intValue != 2) {
                        C16855V8k.A00(waz);
                        if (intValue != 1) {
                            waz.A03.setVisibility(4);
                        } else {
                            MediaFrameLayout mediaFrameLayout = waz.A03;
                            mediaFrameLayout.setVisibility(0);
                            mediaFrameLayout.setBackgroundColor(waz.A00);
                        }
                    } else {
                        C16855V8k.A00(waz);
                        waz.A03.setVisibility(0);
                        IgImageView igImageView = waz.A02;
                        igImageView.setVisibility(0);
                        C45408Cvo cvo = vxr.A00;
                        if (cvo == null || (r0 = cvo.A02) == null || (A022 = r0.A02()) == null) {
                            igImageView.setPlaceHolderColor(waz.A00);
                        } else {
                            igImageView.setUrl(A022, r10);
                            WB4.A00(igImageView, ubj, waz, cvo, 1);
                            UserSession userSession = ubj.A01;
                            C270194gL r14 = cvo.A02;
                            r14.getClass();
                            0Aj A0e = AnonymousClass7TE.A0e(DbT.A0Q(ubj, userSession, 0), "ig_live_archive_thumbnail_impression");
                            A0e.A9F("a_pk", DbV.A0q(r14.A03().getId()));
                            String str = r14.A0e;
                            str.getClass();
                            C51965G9l.A1I(A0e, str);
                            String str2 = r14.A0X;
                            str2.getClass();
                            A0e.A9F(TraceFieldType.BroadcastId, DbV.A0q(str2));
                            C278134wK r02 = r14.A07;
                            if (r02 != null) {
                                A0e.A9F("archive_id", DbV.A0q(r02.A00));
                                C278134wK r03 = r14.A07;
                                boolean z2 = false;
                                if (r03 != null) {
                                    z = r03.A01;
                                } else {
                                    z = false;
                                }
                                A0e.A7p(C273654mx.A00(246), Boolean.valueOf(z));
                                if (r14.A05(userSession) != null) {
                                    z2 = true;
                                }
                                A0e.A7p("is_archived_playback_ready", Boolean.valueOf(z2));
                                A0e.A9F("published_time", Long.valueOf(r14.A01()));
                                DbS.A1O(A0e, "archive_live");
                                A0e.Cgf();
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                    }
                } else {
                    continue;
                }
            } else {
                C16855V8k.A00(waz);
            }
        }
        AnonymousClass0fD.A0A(-1461864432, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(2049336061);
        Context context = this.A01;
        int i2 = this.A00;
        0qQ.A0B(context, 0);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing);
        int i3 = i2 - 1;
        int A09 = (0nA.A09(context) - (AnonymousClass7TF.A02(context, R.dimen.photo_grid_spacing) * i3)) / i2;
        DisplayMetrics A0H = 0nA.A0H(context);
        0qQ.A0B(A0H, 0);
        float f = ((float) A0H.widthPixels) / ((float) A0H.heightPixels);
        LinearLayout linearLayout = new LinearLayout(context);
        VRH vrh = new VRH(linearLayout);
        for (int i4 = 0; i4 < i2; i4++) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.layout_archive_live_item, linearLayout, false);
            0qQ.A0C(inflate, C273654mx.A00(172));
            MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) inflate;
            mediaFrameLayout.A00 = f;
            IgImageButton igImageButton = (IgImageButton) AnonymousClass7TF.A0F(mediaFrameLayout, R.id.day_cover_image);
            igImageButton.A00 = f;
            igImageButton.setEnableTouchOverlay(false);
            C19513Waz waz = new C19513Waz(context, JTR.A0X(mediaFrameLayout, R.id.error_badge_stub), igImageButton, mediaFrameLayout);
            mediaFrameLayout.setTag(waz);
            vrh.A01.add(waz);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A09, -2);
            int i5 = dimensionPixelSize;
            if (i4 == i3) {
                i5 = 0;
            }
            layoutParams.rightMargin = i5;
            linearLayout.addView(waz.A03, layoutParams);
        }
        linearLayout.setTag(vrh);
        AnonymousClass0fD.A0A(1492523219, A032);
        return linearLayout;
    }
}
