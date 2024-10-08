package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.api.schemas.SMBSupportStickerDict;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;

/* renamed from: X.9rE  reason: invalid class name and case insensitive filesystem */
public final class C390409rE extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelSMBSupportStickerFragment";
    public 28D A00;
    public C18603Vuw A01;
    public File A02;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 0);
        RectF A04 = AnonymousClass7TH.A04(this);
        AnonymousClass80D A002 = AnonymousClass80D.A00();
        AnonymousClass80D.A0F(A002, this);
        AnonymousClass80I r1 = AnonymousClass80H.A02;
        UserSession userSession = this.A00;
        0qQ.A06(userSession);
        AnonymousClass80D.A09(userSession, r1, A002, this);
        A002.A09 = viewGroup;
        A002.A0B = this.A00;
        AnonymousClass80D.A03(A04, this, A002);
        AnonymousClass80D.A0A(A002);
        A002.A1m = this.A01;
        File file = this.A02;
        if (file != null) {
            A002.A0P = C282665Eg.A03(file, 1, 0);
            A002.A0w = null;
            A002.A3y = true;
        }
        return A002;
    }

    public final String getModuleName() {
        return C273654mx.A00(926);
    }

    /* JADX WARNING: type inference failed for: r0v16, types: [java.lang.Object, X.Vuw] */
    public final void onCreate(Bundle bundle) {
        28D r0;
        int A022 = AnonymousClass0fD.A02(-362502883);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String A002 = AnonymousClass000.A00(2472);
            if (bundle2.get(A002) instanceof 28D) {
                r0 = (28D) bundle2.get(A002);
            } else {
                r0 = 28D.A5J;
            }
            this.A00 = r0;
            String string = bundle2.getString("ReelSMBSupportShareConstants.ARGUMENTS_KEY_FILE_PATH");
            if (string != null) {
                this.A02 = AnonymousClass7TE.A0t(string);
            }
            try {
                SMBSupportStickerDict parseFromJson = C45621CzX.parseFromJson(0c9.A04.A01(AnonymousClass7TE.A0k(this), C320236s2.A01(bundle2, AnonymousClass000.A00(2473))));
                0qQ.A0A(parseFromJson);
                0qQ.A0B(parseFromJson, 0);
                ? obj = new Object();
                obj.A00 = parseFromJson;
                this.A01 = obj;
            } catch (IOException unused) {
                0wb.A03(__redex_internal_original_name, "Could not parse json SMBSupportStickerModel.");
            }
            AnonymousClass0fD.A09(643107544, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(295109084, A022);
        throw A0y;
    }
}
