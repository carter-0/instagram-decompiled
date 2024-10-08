package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Uku  reason: case insensitive filesystem */
public final class C15929Uku extends UZB {
    public static final String __redex_internal_original_name = "DirectPinnedLocationMapFragment";
    public final AnonymousClass0eM A00 = UZB.A00(this, 36);
    public final AnonymousClass0eM A01 = UZB.A00(this, 37);
    public final AnonymousClass0eM A02 = UZB.A00(this, 38);
    public final AnonymousClass0eM A03 = UZB.A00(this, 39);
    public final AnonymousClass9HB A04 = new AnonymousClass9HB();

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        TextView A0d;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        View A0G = AnonymousClass7TF.A0G(view2, R.id.center_location_button);
        T6B t6b = this.A01;
        if (t6b != null) {
            if (t6b.A00(__redex_internal_original_name) != null) {
                A0G.setVisibility(0);
                WB8.A00(A0G, 41, this);
            }
            AnonymousClass0fU.A00(new C71407Ok6(this, 70), view2.requireViewById(R.id.back_button));
            ViewStub A0X = JTR.A0X(view2, R.id.pinned_location_bottomsheet_stub);
            if (A0X.getParent() != null) {
                View findViewById = A0X.inflate().findViewById(R.id.pinned_location_bottomsheet);
                BottomSheetBehavior A012 = BottomSheetBehavior.A01(findViewById);
                0qQ.A07(A012);
                A012.A0W(3);
                A012.A0N = false;
                AnonymousClass0eM r2 = this.A02;
                if (!(r2.getValue() == null || (A0d = AnonymousClass7TE.A0d(findViewById, R.id.pinned_location_address)) == null)) {
                    A0d.setText(DbS.A0t(r2));
                    A0d.setVisibility(0);
                }
                T6B t6b2 = this.A01;
                if (t6b2 != null) {
                    Location A002 = t6b2.A00(__redex_internal_original_name);
                    Number A0r = C66580MXl.A0r(this.A00);
                    Number A0r2 = C66580MXl.A0r(this.A01);
                    if (!(A002 == null || A0r == null || A0r2 == null || (textView = (TextView) findViewById.findViewById(R.id.pinned_location_distance)) == null)) {
                        Context requireContext = requireContext();
                        String A013 = C18792W1y.A01(requireContext, A002.getLatitude(), A002.getLongitude(), A0r.doubleValue(), A0r2.doubleValue());
                        0qQ.A07(A013);
                        textView.setText(DbY.A0c(requireContext, A013, 2131959665));
                        textView.setVisibility(0);
                    }
                    String A0t = DbS.A0t(this.A03);
                    if (A0t != null) {
                        Intent intent = new Intent("android.intent.action.VIEW", 0cp.A03(A0t));
                        View findViewById2 = findViewById.findViewById(R.id.get_directions_button);
                        if (findViewById2 != null) {
                            WBG.A01(findViewById2, 8, this, intent);
                            findViewById2.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("locationManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A06(VZ8 vz8) {
        Number A0r;
        super.A06(vz8);
        AnonymousClass0eM r6 = this.A00;
        Number A0r2 = C66580MXl.A0r(r6);
        AnonymousClass0eM r5 = this.A01;
        Number A0r3 = C66580MXl.A0r(r5);
        if (A0r2 != null && A0r3 != null) {
            A04(A0r2.doubleValue(), A0r3.doubleValue());
            VZ8 vz82 = this.A00;
            if (vz82 != null && (A0r = C66580MXl.A0r(r6)) != null) {
                double doubleValue = A0r.doubleValue();
                Number A0r4 = C66580MXl.A0r(r5);
                if (A0r4 != null) {
                    double doubleValue2 = A0r4.doubleValue();
                    WFU wfu = vz82.A01;
                    Drawable drawable = requireContext().getDrawable(R.drawable.direct_location_sharing_map_pin);
                    0nA.A04(wfu.A0G, 64);
                    wfu.A0A(new C16076Uo3(drawable, (C19879Wh8) null, wfu, (ImageUrl) null, (C20958X6l) null, "unused_media_id", (String) null, (String) null, doubleValue, doubleValue2, AnonymousClass1GB.A01(0nA.A04(requireActivity(), 50)), false, false, false));
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1652778763);
        0qQ.A0B(layoutInflater, 0);
        this.A04.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_location_sharing_xma, viewGroup, false);
        AnonymousClass0fD.A09(-2100255025, A022);
        return inflate;
    }
}
