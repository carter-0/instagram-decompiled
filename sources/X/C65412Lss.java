package X;

import android.content.Context;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Lss  reason: case insensitive filesystem */
public final class C65412Lss implements MSW {
    public final /* synthetic */ C61942KSr A00;

    public C65412Lss(C61942KSr kSr) {
        this.A00 = kSr;
    }

    public final void Dg7() {
        L8G l8g = this.A00.A0G;
        if (l8g != null) {
            UserSession userSession = l8g.A01;
            2cc A002 = C71342cb.A00(userSession);
            AnonymousClass4DH r12 = l8g.A00;
            A002.A06(r12.getActivity());
            IGTVUploadViewModel iGTVUploadViewModel = l8g.A02;
            AnonymousClass3Q2 r10 = iGTVUploadViewModel.A02().A02;
            if (r10.A33 == null) {
                String str = iGTVUploadViewModel.A0M.A0J;
                if (str == null) {
                    str = iGTVUploadViewModel.A02().A00.A0a;
                }
                r10.A33 = str;
            }
            Context context = r12.getContext();
            if (context != null) {
                C64167LRj lRj = new C64167LRj(context, C62630Kj1.PEOPLE);
                String str2 = iGTVUploadViewModel.A02().A00.A0X;
                0qQ.A0B(str2, 1);
                String str3 = r10.A35;
                ArrayList arrayList = r10.A40;
                List list = r10.A48;
                ArrayList arrayList2 = r10.A41;
                ArrayList arrayList3 = r10.A43;
                ArrayList A04 = C64175LSc.A04(r10);
                ClipInfo clipInfo = r10.A1N;
                List list2 = r10.A4L;
                ClipInfo clipInfo2 = clipInfo;
                String str4 = str2;
                MediaTaggingInfo mediaTaggingInfo = new MediaTaggingInfo(C64175LSc.A00(r10), r10.A1G, clipInfo2, str3, str4, r10.A2d, (String) null, arrayList, arrayList2, arrayList3, A04, list, list2, (List) null, (List) null);
                float f = r10.A02;
                if (f > 0.0f) {
                    mediaTaggingInfo.A00 = f;
                    mediaTaggingInfo.A0H = true;
                }
                lRj.A01 = mediaTaggingInfo;
                lRj.A09 = null;
                lRj.A03 = null;
                lRj.A0D = iGTVUploadViewModel.A0M.A0U;
                lRj.A03(userSession);
                0kR.A05(r12, lRj.A02(), IgNetworkConsentStorage.MAX_ENTRIES);
            }
        }
    }
}
