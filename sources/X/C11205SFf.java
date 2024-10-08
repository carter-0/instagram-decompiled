package X;

import android.content.Context;
import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.SFf  reason: case insensitive filesystem */
public final class C11205SFf {
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final String A06;
    public final boolean A07;

    public C11205SFf(Boolean bool, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = str;
        this.A07 = z;
        this.A02 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A00 = str2;
        this.A03 = z5;
        if (bool != null) {
            this.A01 = bool.booleanValue();
        }
    }

    public static C11205SFf A00(Context context) {
        boolean z;
        Boolean bool = null;
        Cursor A012 = 0fM.A01(context.getContentResolver(), Pxh.A0I(context.getPackageName()), (String) null, (String) null, (String[]) null, (String[]) null, -1630508427);
        if (A012 != null) {
            try {
                if (A012.moveToFirst()) {
                    int columnIndex = A012.getColumnIndex("package_name");
                    int columnIndex2 = A012.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
                    int columnIndex3 = A012.getColumnIndex("is_managed");
                    int columnIndex4 = A012.getColumnIndex("auto_updates");
                    int columnIndex5 = A012.getColumnIndex("notif_update_available");
                    int columnIndex6 = A012.getColumnIndex("notif_update_installed");
                    int columnIndex7 = A012.getColumnIndex("rollout_token");
                    int columnIndex8 = A012.getColumnIndex("terms_of_service_accepted");
                    int columnIndex9 = A012.getColumnIndex("show_accept_tos");
                    int columnIndex10 = A012.getColumnIndex("show_show_explicit_tos");
                    int columnIndex11 = A012.getColumnIndex("is_restricted_mode");
                    int columnIndex12 = A012.getColumnIndex("wa_updates_enabled");
                    int columnIndex13 = A012.getColumnIndex("updates_over_cellular_enabled");
                    int columnIndex14 = A012.getColumnIndex("wa_cross_install_enabled");
                    String string = A012.getString(columnIndex);
                    A012.getString(columnIndex2);
                    boolean A1P = AnonymousClass7TF.A1P(A012.getInt(columnIndex3));
                    boolean A1P2 = AnonymousClass7TF.A1P(A012.getInt(columnIndex4));
                    boolean A1P3 = AnonymousClass7TF.A1P(A012.getInt(columnIndex5));
                    boolean A1P4 = AnonymousClass7TF.A1P(A012.getInt(columnIndex6));
                    String string2 = A012.getString(columnIndex7);
                    if (columnIndex8 >= 0) {
                        z = AnonymousClass7TF.A1P(A012.getInt(columnIndex8));
                    } else {
                        z = false;
                    }
                    if (columnIndex9 >= 0) {
                        A012.getInt(columnIndex9);
                        A012.getInt(columnIndex10);
                    }
                    if (columnIndex11 >= 0) {
                        A012.getInt(columnIndex11);
                    }
                    if (columnIndex12 >= 0) {
                        A012.getInt(columnIndex12);
                    }
                    if (columnIndex13 >= 0) {
                        bool = Boolean.valueOf(AnonymousClass7TF.A1P(A012.getInt(columnIndex13)));
                    }
                    if (columnIndex14 >= 0) {
                        A012.getInt(columnIndex14);
                    }
                    return new C11205SFf(bool, string, string2, A1P, A1P2, A1P3, A1P4, z);
                }
                throw AnonymousClass7TE.A0z("Failed to fetch settings: empty cursor");
            } finally {
                A012.close();
            }
        } else {
            throw AnonymousClass7TE.A0z("Failed to fetch settings: null cursor.");
        }
    }
}
