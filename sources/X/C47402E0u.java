package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.brandedcontent.adseligibility.util.AdsEligibilityErrorDataItem;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.E0u  reason: case insensitive filesystem */
public final class C47402E0u extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ContentIneligibleFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new MMG(this, 6));
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return "content_ineligible_screen";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> stringArrayList;
        int i;
        int i2;
        int i3;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        ArrayList arrayList = null;
        if (bundle2 != null) {
            arrayList = bundle2.getParcelableArrayList("error_data_list");
        }
        if (arrayList != null) {
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (stringArrayList = bundle3.getStringArrayList("error_data_codes")) == null) {
                throw AnonymousClass7TE.A0w("Required value was null.");
            }
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null) {
                boolean z = bundle4.getBoolean(AnonymousClass000.A00(1492), false);
                if (Boolean.valueOf(z) != null) {
                    IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(view, R.id.headline);
                    AnonymousClass0eM r2 = this.A00;
                    int ordinal = ((C357048Wg) r2.getValue()).ordinal();
                    if (ordinal == 0) {
                        i = 2131974426;
                        if (z) {
                            i = 2131954033;
                        }
                    } else if (ordinal == 2) {
                        i = 2131971525;
                    } else if (ordinal == 1) {
                        i = 2131962332;
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    igdsHeadline.setHeadline(i);
                    int ordinal2 = ((C357048Wg) r2.getValue()).ordinal();
                    if (ordinal2 == 0) {
                        i2 = 2131974360;
                        if (z) {
                            i2 = 2131954029;
                        }
                    } else if (ordinal2 == 2) {
                        i2 = 2131971453;
                    } else if (ordinal2 == 1) {
                        i2 = 2131962284;
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    String A16 = AnonymousClass7TE.A16(requireContext(), 2131969190);
                    SpannableStringBuilder A0D = DbY.A0D(requireContext(), A16, i2);
                    AnonymousClass7AV.A04(A0D, new C48053ESw(this, (ArrayList) stringArrayList, Dbb.A04(this)), A16);
                    igdsHeadline.setBody((CharSequence) A0D);
                    FGX A02 = FGX.A02(requireContext(), true);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AdsEligibilityErrorDataItem adsEligibilityErrorDataItem = (AdsEligibilityErrorDataItem) it.next();
                        XDU A03 = C14091Tpi.A03(adsEligibilityErrorDataItem.A01);
                        if (A03 == null) {
                            A03 = XDU.A9N;
                        }
                        Integer A04 = C14091Tpi.A04(A03, GOg.SIZE_24, C52337GOf.OUTLINE);
                        if (A04 != null) {
                            i3 = A04.intValue();
                        } else {
                            i3 = R.drawable.instagram_warning_pano_outline_24;
                        }
                        A02.A05(adsEligibilityErrorDataItem.A02, adsEligibilityErrorDataItem.A00, i3);
                    }
                    igdsHeadline.setBulletList(A02.A04());
                    return;
                }
            }
            throw AnonymousClass7TE.A0w("Required value was null.");
        }
        throw AnonymousClass7TE.A0w("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(389976978);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_content_ineligible_screen, viewGroup, false);
        AnonymousClass0fD.A09(977821189, A02);
        return inflate;
    }
}
