package X;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.creation.base.CropInfo;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;

/* renamed from: X.Lny  reason: case insensitive filesystem */
public final class C65136Lny implements AnonymousClass36P {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ Location A03;
    public final /* synthetic */ Uri A04;
    public final /* synthetic */ 28D A05;
    public final /* synthetic */ MediaUploadMetadata A06;
    public final /* synthetic */ CropInfo A07;
    public final /* synthetic */ C3499582p A08;
    public final /* synthetic */ MediaCaptureConfig A09;
    public final /* synthetic */ PendingRecipient A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;

    public final /* synthetic */ void CJ6(Intent intent) {
    }

    public final /* synthetic */ void Ctk(int i, int i2) {
    }

    public final /* synthetic */ void Ctl(int i, int i2) {
    }

    public final /* synthetic */ void Ewk(File file, int i) {
    }

    public final void ExB(Intent intent, int i) {
        0qQ.A0B(intent, 0);
        intent.putExtra("isFromQcc", true);
        intent.putExtra(AnonymousClass000.A00(1678), this.A0B);
        intent.putExtra(AnonymousClass000.A00(3409), true);
        intent.putExtra(AnonymousClass000.A00(3741), this.A03);
        CropInfo cropInfo = this.A07;
        if (cropInfo != null) {
            intent.putExtra(AnonymousClass000.A00(3740), cropInfo);
        }
        String A002 = AnonymousClass000.A00(1679);
        intent.putExtra("isMirrored", this.A0D);
        int i2 = this.A00;
        intent.putExtra("mediaSource", i2);
        if (i2 == 1) {
            intent.putExtra(A002, AnonymousClass514.SQUARE);
        }
        intent.putExtra(AnonymousClass000.A00(3554), this.A01);
        MediaCaptureConfig mediaCaptureConfig = this.A09;
        if (mediaCaptureConfig != null) {
            intent.setExtrasClassLoader(MediaCaptureConfig.class.getClassLoader());
            intent.putExtra("captureConfig", mediaCaptureConfig);
        }
        intent.putExtra("cameraEntryPoint", this.A05);
        String str = this.A0C;
        if (str != null) {
            intent.putExtra("originalMediaPath", str);
        }
        Uri uri = this.A04;
        if (uri != null) {
            intent.putExtra("originalMediaUri", uri.toString());
        }
        C3499582p r0 = this.A08;
        if (r0 != null) {
            intent.putExtra("previousCreationSession", JWE.A01(r0));
        }
        intent.putExtra("media_upload_metadata", this.A06);
        intent.putExtra("targetGroupProfile", this.A0A);
        intent.putExtra(AnonymousClass000.A00(35), this.A0E);
        0kR.A07(this.A02, intent, i);
    }

    public C65136Lny(Activity activity, Location location, Uri uri, 28D r4, MediaUploadMetadata mediaUploadMetadata, CropInfo cropInfo, C3499582p r7, MediaCaptureConfig mediaCaptureConfig, PendingRecipient pendingRecipient, String str, String str2, int i, int i2, boolean z, boolean z2) {
        this.A0B = str;
        this.A03 = location;
        this.A07 = cropInfo;
        this.A0D = z;
        this.A00 = i;
        this.A01 = i2;
        this.A09 = mediaCaptureConfig;
        this.A05 = r4;
        this.A0C = str2;
        this.A04 = uri;
        this.A08 = r7;
        this.A06 = mediaUploadMetadata;
        this.A0A = pendingRecipient;
        this.A0E = z2;
        this.A02 = activity;
    }
}
