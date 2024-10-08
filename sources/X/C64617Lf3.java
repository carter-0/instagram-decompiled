package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.reels.smb.model.ProfileStickerAiAgentData;
import com.instagram.reels.smb.model.ProfileStickerModel;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;
import com.instagram.user.model.User;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Lf3  reason: case insensitive filesystem */
public final class C64617Lf3 implements AnonymousClass1MK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C64617Lf3(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void CyF(C226952iF r14, AnonymousClass3LX r15) {
        String str;
        C299875vz r2;
        switch (this.A00) {
            case 0:
                ((C64844Lj6) this.A01).A00 = r15.A01;
                ((CountDownLatch) this.A02).countDown();
                return;
            case 1:
                Bitmap A07 = JTQ.A07(r15);
                if (A07 != null) {
                    C59998Jd7 jd7 = (C59998Jd7) this.A02;
                    Context context = (Context) this.A01;
                    int i = jd7.A01;
                    Bitmap A072 = 1MF.A07(A07, i, i);
                    if (A072 != null) {
                        jd7.A00 = JTQ.A08(context, A072);
                    }
                    jd7.invalidateSelf();
                    return;
                }
                return;
            case 2:
                Bitmap A073 = JTQ.A07(r15);
                if (A073 != null) {
                    ((C59921Jbk) this.A02).A00 = JTQ.A08((Context) this.A01, A073);
                    return;
                }
                return;
            case 3:
                AnonymousClass7TF.A1H(r14, r15);
                Object C3s = r14.C3s();
                if (C3s != null) {
                    RemoteMedia remoteMedia = ((C60674JpL) this.A02).A02;
                    if (remoteMedia != null) {
                        str = remoteMedia.A06;
                    } else {
                        str = null;
                    }
                    if (!C3s.equals(str)) {
                        return;
                    }
                }
                Bitmap bitmap = r15.A01;
                JXQ jxq = JXQ.A00;
                C60674JpL jpL = (C60674JpL) this.A02;
                C59738JVw jVw = jpL.A08;
                C376529Ii r5 = (C376529Ii) this.A01;
                if (bitmap != null) {
                    jxq.A03(bitmap, r5, jVw, (C62320sa) null, 0);
                } else {
                    JXQ.A02(r5, jVw);
                }
                GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = jpL.A07.A00;
                galleryPickerMediaOverlayView.A0B = AnonymousClass7TF.A1V(bitmap);
                galleryPickerMediaOverlayView.invalidate();
                jpL.A04.invalidate();
                jpL.A03 = false;
                jpL.A06.A05();
                return;
            case 4:
                Bitmap A074 = JTQ.A07(r15);
                boolean z = false;
                JXQ jxq2 = JXQ.A00;
                C60657Jp4 jp4 = (C60657Jp4) this.A02;
                C59738JVw jVw2 = jp4.A05;
                C376529Ii r4 = (C376529Ii) this.A01;
                if (A074 != null) {
                    jxq2.A03(A074, r4, jVw2, (C62320sa) null, 0);
                } else {
                    JXQ.A02(r4, jVw2);
                }
                GalleryPickerMediaOverlayView galleryPickerMediaOverlayView2 = jp4.A04.A00;
                if (A074 != null) {
                    z = true;
                }
                galleryPickerMediaOverlayView2.A0B = z;
                galleryPickerMediaOverlayView2.invalidate();
                jp4.A03.invalidate();
                return;
            case 5:
                boolean A1U = AnonymousClass7TF.A1U(0, r14, r15);
                Object C3s2 = r14.C3s();
                0qQ.A0C(C3s2, "null cannot be cast to non-null type kotlin.Pair<kotlin.Int, kotlin.String>");
                0eP r1 = (0eP) C3s2;
                int A0B = C51970G9q.A0B(r1);
                String str2 = (String) r1.A01;
                Bitmap bitmap2 = r15.A01;
                if (bitmap2 != null) {
                    ((Object[]) this.A01)[A0B] = new C61076JwE(str2, bitmap2);
                }
                KLH klh = (KLH) this.A02;
                C61076JwE[] jwEArr = (C61076JwE[]) this.A01;
                int i2 = 0;
                while (jwEArr[i2] != null) {
                    i2++;
                    if (i2 >= 3) {
                        ProfileStickerModel profileStickerModel = klh.A01;
                        User user = profileStickerModel.A03;
                        C317876nz r8 = profileStickerModel.A01;
                        Integer num = profileStickerModel.A05;
                        Integer num2 = profileStickerModel.A04;
                        ProfileStickerAiAgentData profileStickerAiAgentData = profileStickerModel.A02;
                        int A022 = DbW.A02(A1U ? 1 : 0, r8, num);
                        0qQ.A0B(num2, 3);
                        ProfileStickerModel profileStickerModel2 = new ProfileStickerModel(r8, profileStickerAiAgentData, user, num, num2);
                        profileStickerModel2.A00 = jwEArr;
                        int intValue = num2.intValue();
                        if (intValue == 0) {
                            r2 = new C389569pq(klh.A05, profileStickerModel2);
                        } else if (intValue == A1U) {
                            r2 = new C389579pr(klh.A05, klh.A06, profileStickerModel2);
                        } else if (intValue == A022) {
                            r2 = new C389599pt(klh.A05, klh.A06, profileStickerModel2);
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                        klh.A00 = r2;
                        klh.A03 = false;
                        if (klh.A02) {
                            klh.A07();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 6:
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                Bitmap bitmap3 = r15.A01;
                writableNativeMap.putInt(IgReactMediaPickerNativeModule.WIDTH, bitmap3.getWidth());
                writableNativeMap.putInt(IgReactMediaPickerNativeModule.HEIGHT, bitmap3.getHeight());
                ((C13904TjR) this.A02).resolve(writableNativeMap);
                return;
            default:
                return;
        }
    }

    public final void DJx(C226952iF r4, C254673sr r5) {
        String str;
        switch (this.A00) {
            case 3:
                0qQ.A0B(r4, 0);
                C60674JpL jpL = (C60674JpL) this.A02;
                jpL.A03 = false;
                jpL.A06.A05();
                C66093MBb mBb = jpL.A00;
                if (mBb != null) {
                    String BZG = r4.BZG();
                    if (r5 != null) {
                        str = r5.A02;
                    } else {
                        str = null;
                    }
                    ((0sL) mBb.A01).invoke(BZG, str);
                    return;
                }
                return;
            case 5:
                KLH.A01((KLH) this.A02);
                return;
            case 6:
                ((C13904TjR) this.A02).reject(new Throwable());
                return;
            default:
                return;
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }
}
