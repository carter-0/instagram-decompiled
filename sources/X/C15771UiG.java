package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;
import com.instagram.model.venue.Venue;

/* renamed from: X.UiG  reason: case insensitive filesystem */
public final class C15771UiG extends C232222tE {
    public final UserSession A00;
    public final C17772Vfj A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r18, C249703kE r19) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        N4R n4r;
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse;
        String str2;
        IgTextView igTextView;
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse2;
        String str3;
        int i;
        StringBuilder sb;
        int i2;
        String A0l;
        C14851UCf uCf = (C14851UCf) r19;
        MediaMapPin mediaMapPin = ((C15814Uix) r18).A00;
        C17772Vfj vfj = this.A01;
        W17 w17 = uCf.A01;
        C17692VcN vcN = uCf.A00;
        boolean A1b = C51973G9u.A1b(vcN, mediaMapPin, vfj);
        View view = vcN.A01;
        WBG.A01(view, 16, mediaMapPin, vfj);
        boolean z = w17.A02;
        if (z) {
            vcN.A03.setBackgroundResource(0);
            vcN.A00.setBackgroundResource(0);
        }
        Context A0S = AnonymousClass7TE.A0S(vcN.A04);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        LocationPageInformation locationPageInformation = mediaMapPin.A06;
        if (locationPageInformation != null) {
            str = locationPageInformation.A06;
        } else {
            str = null;
        }
        if (str != null) {
            spannableStringBuilder2 = spannableStringBuilder2.append(str);
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2);
        if (!0mp.A0B(mediaMapPin.A0C)) {
            if (z) {
                0qQ.A0A(spannableStringBuilder2);
                W17.A01(A0S, spannableStringBuilder2, spannableStringBuilder3, w17, mediaMapPin);
            } else {
                0qQ.A0A(spannableStringBuilder2);
                W17.A00(spannableStringBuilder2, mediaMapPin.A0C, " • ");
            }
        }
        0qQ.A0A(spannableStringBuilder2);
        0qQ.A0B(spannableStringBuilder2, A1b ? 1 : 0);
        W17.A02(vcN.A09, vcN, w17, spannableStringBuilder2, spannableStringBuilder3);
        if (z) {
            LocationPageInformation locationPageInformation2 = mediaMapPin.A06;
            if (!(locationPageInformation2 == null || (locationPageInfoPageOperationHourResponse2 = locationPageInformation2.A01) == null)) {
                String str4 = locationPageInfoPageOperationHourResponse2.A01;
                boolean z2 = true;
                if (!(str4 == null || str4.length() == 0)) {
                    String str5 = locationPageInfoPageOperationHourResponse2.A02;
                    0qQ.A07(str5);
                    if (locationPageInfoPageOperationHourResponse2.A00.booleanValue()) {
                        str3 = A0S.getString(2131974199);
                        i = AnonymousClass7TF.A03(A0S, R.attr.igds_color_success);
                        if (str4.length() > 0) {
                            String str6 = locationPageInfoPageOperationHourResponse2.A02;
                            0qQ.A07(str6);
                            if (str6.length() == 0) {
                                A0l = C51967G9n.A0p(A0S, 2131974200);
                            }
                        }
                        String str7 = locationPageInfoPageOperationHourResponse2.A02;
                        0qQ.A07(str7);
                        if (!00l.A0X(str7, ':')) {
                            i2 = 2131974197;
                        } else {
                            sb = new StringBuilder();
                            i2 = 2131974198;
                        }
                        C13988Tno.A0s(A0S, sb, i2);
                        sb.append(' ');
                        A0l = AnonymousClass7TF.A0l(str5, sb);
                    } else {
                        str3 = A0S.getString(2131974196);
                        i = A0S.getColor(2Yu.A03(A0S));
                        if (str4.length() > 0) {
                            String str8 = locationPageInfoPageOperationHourResponse2.A02;
                            0qQ.A07(str8);
                            if (str8.length() == 0) {
                                A0l = new String();
                                z2 = false;
                            }
                        }
                        String str9 = locationPageInfoPageOperationHourResponse2.A02;
                        0qQ.A07(str9);
                        if (!00l.A0X(str9, ':')) {
                            i2 = 2131974201;
                        } else {
                            sb = new StringBuilder();
                            i2 = 2131974202;
                        }
                        C13988Tno.A0s(A0S, sb, i2);
                        sb.append(' ');
                        A0l = AnonymousClass7TF.A0l(str5, sb);
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder;
                    if (str3 != null) {
                        spannableStringBuilder4 = spannableStringBuilder.append(str3);
                    }
                    spannableStringBuilder4.setSpan(new ForegroundColorSpan(i), 0, str3.length(), 33);
                    if (z2) {
                        W17.A00(spannableStringBuilder, A0l, " • ");
                    }
                }
            }
            n4r = new N4R((CharSequence) spannableStringBuilder, (CharSequence) spannableStringBuilder, 21);
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
            String A02 = C18792W1y.A02(A0S, w17.A00, C18231Vnv.A00(mediaMapPin.A09), "MEDIA_MAP");
            if (A02 != null) {
                spannableStringBuilder.append(A02);
            }
            W17.A01(A0S, spannableStringBuilder, spannableStringBuilder5, w17, mediaMapPin);
            LocationPageInformation locationPageInformation3 = mediaMapPin.A06;
            if (!(locationPageInformation3 == null || (locationPageInfoPageOperationHourResponse = locationPageInformation3.A01) == null || (str2 = locationPageInfoPageOperationHourResponse.A01) == null || str2.length() == 0)) {
                for (SpannableStringBuilder A002 : 0sr.A1P(new SpannableStringBuilder[]{spannableStringBuilder, spannableStringBuilder5})) {
                    W17.A00(W17.A00(A002, str2, " • "), locationPageInfoPageOperationHourResponse.A02, " ");
                }
            }
            n4r = new N4R((CharSequence) spannableStringBuilder, (CharSequence) spannableStringBuilder5, 21);
        }
        CharSequence charSequence = (CharSequence) n4r.A02;
        CharSequence charSequence2 = (CharSequence) n4r.A00;
        if (mediaMapPin.A06 == null) {
            vcN.A02.setVisibility(8);
        } else {
            boolean A06 = 182.A06(0Tu.A05, w17.A00, 36315713719242228L);
            IgTextView igTextView2 = vcN.A06;
            if (A06) {
                igTextView2.setVisibility(0);
                WBG.A01(igTextView2, 14, mediaMapPin, vfj);
                vcN.A08.setVisibility(0);
                igTextView = vcN.A07;
                DbU.A1A(A0S.getResources(), igTextView, 2131965508);
                view.setOnClickListener((View.OnClickListener) null);
            } else {
                igTextView2.setVisibility(8);
                vcN.A08.setVisibility(8);
                igTextView = vcN.A07;
                DbU.A1A(A0S.getResources(), igTextView, 2131965509);
            }
            WBG.A01(igTextView, 15, mediaMapPin, vfj);
        }
        W17.A02(vcN.A0A, vcN, w17, charSequence, charSequence2);
        AnonymousClass0fU.A00(new FPF(0, (Object) vfj, (Object) mediaMapPin), vcN.A00);
        if (!G9t.A1b(w17.A01)) {
            vcN.A03.setVisibility(8);
            return;
        }
        Venue A003 = C18231Vnv.A00(mediaMapPin.A09);
        boolean A1W = AnonymousClass7TF.A1W(C225892f5.A00(w17.A00).A0L(A003.BpO(), A003), C243373Ym.SAVED);
        ImageView imageView = vcN.A05;
        int i3 = R.drawable.instagram_save_pano_outline_24;
        if (A1W) {
            i3 = R.drawable.instagram_save_pano_filled_24;
        }
        DbU.A13(A0S, imageView, i3);
        View view2 = vcN.A03;
        AnonymousClass0fU.A00(new W9v(0, vfj, mediaMapPin, A1W), view2);
        view2.setVisibility(0);
    }

    public final Class modelClass() {
        return C15814Uix.class;
    }

    public C15771UiG(UserSession userSession, C17772Vfj vfj) {
        this.A00 = userSession;
        this.A01 = vfj;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C14851UCf(DbT.A0C(layoutInflater, viewGroup, R.layout.layout_location_info_row), this.A00);
    }
}
