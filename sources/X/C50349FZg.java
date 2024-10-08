package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.content.FileProvider;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.dextricks.Constants;
import com.instagram.avatar.AddAvatarHelper$LoadedImage$LoadedImageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.crop.AvatarCropActivity;
import com.instagram.model.creation.MediaCaptureConfig;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: X.FZg  reason: case insensitive filesystem */
public final class C50349FZg implements AnonymousClass36P, CallerContextable {
    public static final String __redex_internal_original_name = "AddAvatarHelper";
    public C49449Evq A00;
    public AnonymousClass36V A01;
    public C47490E4u A02;
    public File A03;
    public File A04;
    public boolean A05;
    public CharSequence[] A06 = new CharSequence[0];
    public final UserSession A07;

    public C50349FZg(Bundle bundle, UserSession userSession, C47490E4u e4u) {
        0qQ.A0B(userSession, 2);
        this.A02 = e4u;
        this.A07 = userSession;
        if (bundle != null) {
            if (bundle.containsKey("AddAvatarHelper.IMAGE_METADATA")) {
                Parcelable parcelable = bundle.getParcelable("AddAvatarHelper.IMAGE_METADATA");
                if (parcelable != null) {
                    AddAvatarHelper$LoadedImage$LoadedImageMetadata addAvatarHelper$LoadedImage$LoadedImageMetadata = (AddAvatarHelper$LoadedImage$LoadedImageMetadata) parcelable;
                    new C46669Diy(addAvatarHelper$LoadedImage$LoadedImageMetadata.A01, this, addAvatarHelper$LoadedImage$LoadedImageMetadata.A00).execute(new Void[0]);
                    bundle.remove("AddAvatarHelper.IMAGE_METADATA");
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            String string = bundle.getString("tempCameraPhotoFile");
            if (string != null) {
                this.A04 = new File(string);
            }
            String string2 = bundle.getString("tempGalleryPhotoFile");
            if (string2 != null) {
                this.A03 = new File(string2);
            }
        }
    }

    public final /* synthetic */ void CJ6(Intent intent) {
    }

    public final /* synthetic */ void Ctk(int i, int i2) {
    }

    public final /* synthetic */ void Ctl(int i, int i2) {
    }

    public final void Ewk(File file, int i) {
        0qQ.A0B(file, 0);
        C47490E4u e4u = this.A02;
        if (e4u != null) {
            FFa.A03(e4u, file, i);
        }
    }

    public final /* synthetic */ void ExB(Intent intent, int i) {
    }

    public static final void A00(Uri uri, C50349FZg fZg) {
        C47490E4u e4u = fZg.A02;
        if (e4u != null) {
            Context requireContext = e4u.requireContext();
            UserSession userSession = fZg.A07;
            Bundle bundle = new C49321Etc(requireContext).A00;
            bundle.putParcelable(AnonymousClass000.A00(2189), uri);
            bundle.putBoolean(AnonymousClass000.A00(898), true);
            bundle.putInt(AnonymousClass000.A00(217), 1080);
            Intent intent = new Intent(requireContext, AvatarCropActivity.class);
            intent.putExtras(bundle);
            intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
            0kR.A05(e4u, intent, 3);
        }
    }

    public static final void A01(C50349FZg fZg) {
        C47490E4u e4u = fZg.A02;
        if (e4u != null) {
            Context requireContext = e4u.requireContext();
            String A002 = C363878kU.A00(System.currentTimeMillis());
            0qQ.A07(A002);
            File cacheDir = requireContext.getCacheDir();
            0qQ.A07(cacheDir);
            File file = new File(002.A0u(cacheDir.getAbsolutePath(), "/images/", A002, ".jpg"));
            fZg.A04 = file;
            String A003 = Pxd.A00(635);
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                    file.createNewFile();
                    Runtime.getRuntime().exec(002.A0R("chmod 0666", file.getPath()));
                    Context requireContext2 = e4u.requireContext();
                    Intent intent = new Intent(A003);
                    Uri A004 = FileProvider.A00(requireContext2, file);
                    0qQ.A07(A004);
                    intent.addFlags(3);
                    PackageManager packageManager = requireContext2.getPackageManager();
                    if (packageManager != null) {
                        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, Constants.LOAD_RESULT_PGO_ATTEMPTED);
                        0qQ.A07(queryIntentActivities);
                        for (ResolveInfo resolveInfo : queryIntentActivities) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (activityInfo != null) {
                                String str = activityInfo.packageName;
                                0qQ.A06(str);
                                requireContext2.grantUriPermission(str, A004, 3);
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                        intent.putExtra("output", A004);
                        0kR.A06(e4u, intent, 4);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            } catch (IOException unused) {
            }
        }
    }

    public final void A02() {
        AnonymousClass36V r4 = this.A01;
        if (r4 != null) {
            AnonymousClass36W r3 = AnonymousClass36W.PROFILE_PHOTO;
            JWU jwu = new JWU(r3);
            jwu.A03 = true;
            jwu.A05 = false;
            jwu.A09 = true;
            jwu.A0C = false;
            jwu.A0D = false;
            jwu.A0A = false;
            r4.Exv(EXF.A0J, new MediaCaptureConfig(jwu), r3);
        }
    }
}
