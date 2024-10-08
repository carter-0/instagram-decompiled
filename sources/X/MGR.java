package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.cdl.p004native.ContentDeliveryLibrary;
import com.facebook.commonavatarliveediting.CdlProviderImpl;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;
import java.io.File;
import java.util.Map;

public final class MGR extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public Object A01;
    public final int A02 = 2;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGR(N49 n49, N49 n492, N49 n493, C69064Ne1 ne1, GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success, String str, AnonymousClass4D7 r8) {
        super(2, r8);
        this.A05 = groupLinkPreviewResponse$Success;
        this.A03 = n49;
        this.A06 = str;
        this.A00 = n492;
        this.A04 = n493;
        this.A01 = ne1;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MGR, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MGR, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.MGR, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        AnonymousClass4D7 r10 = r13;
        switch (this.A02) {
            case 0:
                AnonymousClass4D7 r7 = r13;
                ? mgr = new MGR((CdlProviderImpl) this.A01, this.A06, (Map) this.A04, r7, (0sP) this.A03, (Float[]) this.A05);
                mgr.A00 = obj;
                return mgr;
            case 1:
                String str = this.A06;
                ? mgr2 = new MGR((Context) this.A03, (MediaMetadataRetriever) this.A05, (UserSession) this.A00, str, r13, (0sL) this.A04);
                mgr2.A01 = obj;
                return mgr2;
            default:
                N49 n49 = (N49) this.A03;
                String str2 = this.A06;
                return new MGR(n49, (N49) this.A00, (N49) this.A04, (C69064Ne1) this.A01, (GroupLinkPreviewResponse$Success) this.A05, str2, r10);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Bitmap bitmap;
        Integer A0l;
        Integer A0l2;
        Integer A0l3;
        switch (this.A02) {
            case 0:
                0eS.A00(obj);
                Object obj2 = this.A00;
                CdlProviderImpl cdlProviderImpl = (CdlProviderImpl) this.A01;
                L7W l7w = cdlProviderImpl.A00;
                if (l7w == null) {
                    return null;
                }
                String str = this.A06;
                Map map = (Map) this.A04;
                Float[] fArr = (Float[]) this.A05;
                0sP pqV = new C74189PqV(obj2, (Object) cdlProviderImpl, this.A03, str, 1);
                0qQ.A0B(str, 0);
                AnonymousClass7TF.A1B(map, 1, fArr);
                l7w.A01.A01("generate_color_ramps_start", str, (String) null, map);
                LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder = new LiveEditingRawMemoryPointerHolder();
                ContentDeliveryLibrary contentDeliveryLibrary = l7w.A00;
                int length = fArr.length;
                float[] fArr2 = new float[length];
                for (int i4 = 0; i4 < length; i4++) {
                    fArr2[i4] = fArr[i4].floatValue();
                }
                return Boolean.valueOf(contentDeliveryLibrary.generateColorRamp(str, map, fArr2, liveEditingRawMemoryPointerHolder, new C64363Laf(l7w, liveEditingRawMemoryPointerHolder, str, map, pqV)));
            case 1:
                0eS.A00(obj);
                File A0t = AnonymousClass7TE.A0t(AnonymousClass457.A09((Context) this.A03, "mp4", System.nanoTime(), true));
                String str2 = this.A06;
                0lg r0 = (0lg) this.A00;
                boolean z = false;
                0qQ.A0B(r0, 3);
                if (str2 == null || C59730JVo.A07(r0, A0t, str2, -1) == null) {
                    0f9 AEf = 0wj.A01.AEf("MetaAIIntentsGeneratedVideoResultAdapter", 817902720);
                    AEf.ABQ(DialogModule.KEY_MESSAGE, "Attempt to download failed. Could not find cache or file.");
                    AEf.report();
                } else {
                    z = true;
                }
                if (z) {
                    MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) this.A05;
                    mediaMetadataRetriever.setDataSource(A0t.getCanonicalPath());
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    int i5 = 0;
                    if (extractMetadata == null || (A0l3 = 00y.A0l(extractMetadata)) == null) {
                        i = 0;
                    } else {
                        i = A0l3.intValue();
                    }
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
                    if (extractMetadata2 == null || (A0l2 = 00y.A0l(extractMetadata2)) == null) {
                        i2 = 0;
                    } else {
                        i2 = A0l2.intValue();
                    }
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    if (extractMetadata3 == null || (A0l = 00y.A0l(extractMetadata3)) == null) {
                        i3 = 0;
                    } else {
                        i3 = A0l.intValue();
                    }
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(24);
                    if (extractMetadata4 != null) {
                        i5 = C51967G9n.A04(00y.A0l(extractMetadata4), 0);
                    }
                    Medium A032 = C282665Eg.A03(A0t, 3, i);
                    A032.A04 = i3;
                    A032.A0B = i2;
                    A032.A07 = i5;
                    try {
                        bitmap = AIQ.A00.A02(mediaMetadataRetriever, i2, i3);
                    } catch (Throwable th) {
                        bitmap = JTO.A1B(th);
                    }
                    if (bitmap instanceof 0eQ) {
                        bitmap = null;
                    }
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        File A002 = AnonymousClass45F.A00();
                        AEI.A02(bitmap2, A002, true);
                        A032.A0a = A002.getCanonicalPath();
                    }
                    ((0sL) this.A04).invoke(A0t, A032);
                    break;
                }
                break;
            default:
                0eS.A00(obj);
                GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success = (GroupLinkPreviewResponse$Success) this.A05;
                if (groupLinkPreviewResponse$Success == null || !(!(((C69064Ne1) this.A01).A01.FIG(new C68756NVr(groupLinkPreviewResponse$Success)) instanceof AnonymousClass1Ws))) {
                    N49 n49 = (N49) this.A03;
                    if (n49 != null) {
                        C252733pa r3 = (C252733pa) this.A01;
                        String str3 = n49.A00;
                        String str4 = n49.A01;
                        AnonymousClass7TE.A1Z(new MFe((Object) r3, str4, str3, (AnonymousClass4D7) null, 14), r3.A01);
                    }
                    String str5 = this.A06;
                    if (str5 != null) {
                        C252733pa r5 = (C252733pa) this.A01;
                        AnonymousClass7TE.A1Z(new MFW(r5, str5, (AnonymousClass4D7) null, 29), r5.A01);
                    }
                    N49 n492 = (N49) this.A00;
                    if (n492 != null) {
                        ((C69064Ne1) this.A01).A01(n492.A00, n492.A01);
                    }
                    N49 n493 = (N49) this.A04;
                    if (n493 != null) {
                        C252733pa r52 = (C252733pa) this.A01;
                        String str6 = n493.A01;
                        AnonymousClass7TE.A1Z(new MFW(r52, str6, (AnonymousClass4D7) null, 28), r52.A01);
                        break;
                    }
                }
                break;
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGR) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGR(Context context, MediaMetadataRetriever mediaMetadataRetriever, UserSession userSession, String str, AnonymousClass4D7 r6, 0sL r7) {
        super(2, r6);
        this.A03 = context;
        this.A06 = str;
        this.A00 = userSession;
        this.A05 = mediaMetadataRetriever;
        this.A04 = r7;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGR(CdlProviderImpl cdlProviderImpl, String str, Map map, AnonymousClass4D7 r5, 0sP r6, Float[] fArr) {
        super(2, r5);
        this.A01 = cdlProviderImpl;
        this.A06 = str;
        this.A04 = map;
        this.A05 = fArr;
        this.A03 = r6;
    }
}
