package com.instagram.creation.photo.crop;

import X.08y;
import X.09i;
import X.0hq;
import X.0qQ;
import X.0s1;
import X.AnonymousClass0fD;
import X.AnonymousClass1GD;
import X.AnonymousClass36R;
import X.AnonymousClass7TE;
import X.C273564mn;
import X.DbU;
import X.DbW;
import X.Dba;
import X.K6Y;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import java.util.HashMap;

public final class AvatarCropActivity extends IgFragmentActivity implements C273564mn {
    public UserSession A00;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.creation.photo.crop.AvatarCropActivity, android.app.Activity] */
    public final void D0W() {
        setResult(0);
        finish();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.creation.photo.crop.AvatarCropActivity, android.app.Activity] */
    public final void DFe(Location location, Uri uri, MediaUploadMetadata mediaUploadMetadata, CropInfo cropInfo, String str, String str2, String str3, HashMap hashMap, int i, int i2) {
        Dba.A0k(this, new Intent(uri.toString()));
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [android.content.Context, com.instagram.creation.photo.crop.AvatarCropActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0fD.A00(975380221);
        requestWindowFeature(1);
        super.onCreate(bundle);
        AnonymousClass1GD.A01(this);
        08y r1 = 09i.A0A;
        Bundle A06 = DbU.A06(this);
        if (A06 != null) {
            this.A00 = r1.A06(A06);
            setContentView((int) R.layout.activity_single_container);
            0hq supportFragmentManager = getSupportFragmentManager();
            0qQ.A07(supportFragmentManager);
            if (supportFragmentManager.A0P(R.id.layout_container_main) == null) {
                0s1 A0D = DbW.A0D(this);
                AnonymousClass36R.A01();
                K6Y k6y = new K6Y();
                k6y.setArguments(DbU.A06(this));
                A0D.A0A(k6y, R.id.layout_container_main);
                A0D.A00();
            }
            AnonymousClass0fD.A07(-376666201, A002);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A07(1347945438, A002);
        throw A0y;
    }
}
