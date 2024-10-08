package X;

import android.graphics.RectF;
import android.os.Bundle;

/* renamed from: X.UvD  reason: case insensitive filesystem */
public final class C16457UvD extends C15291UZw {
    public static final String __redex_internal_original_name = "QuestionResponseCameraFragment";
    public int A00 = -1;
    public RectF A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-239839462);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("CREATOR_PROFILE_PICTURE_URL");
        if (string != null) {
            this.A02 = string;
            String string2 = requireArguments.getString("CREATOR_USERNAME");
            if (string2 != null) {
                this.A03 = string2;
                String string3 = requireArguments.getString("MEDIA_ID");
                if (string3 != null) {
                    this.A05 = string3;
                    String string4 = requireArguments.getString("QUESTION_ID");
                    if (string4 != null) {
                        this.A06 = string4;
                        String string5 = requireArguments.getString("REEL_VIEWER_NAME");
                        if (string5 != null) {
                            this.A07 = string5;
                            String string6 = requireArguments.getString("MEDIA_DELIVERY_CLASS");
                            if (string6 != null) {
                                this.A04 = string6;
                                String string7 = requireArguments.getString("TRAY_SESSION_ID");
                                if (string7 != null) {
                                    this.A08 = string7;
                                    this.A00 = requireArguments.getInt("TRAY_POSITION", -1);
                                    this.A01 = (RectF) requireArguments.getParcelable(C66579MXk.A00(55));
                                    AnonymousClass0fD.A09(88766580, A022);
                                    return;
                                }
                                illegalStateException = new IllegalStateException("Required value was null.");
                                i = -1398473108;
                            } else {
                                illegalStateException = new IllegalStateException("Required value was null.");
                                i = 604157767;
                            }
                        } else {
                            illegalStateException = new IllegalStateException("Required value was null.");
                            i = -1762007867;
                        }
                    } else {
                        illegalStateException = new IllegalStateException("Required value was null.");
                        i = 1583592324;
                    }
                } else {
                    illegalStateException = new IllegalStateException("Required value was null.");
                    i = -289140874;
                }
            } else {
                illegalStateException = new IllegalStateException("Required value was null.");
                i = -1078420028;
            }
        } else {
            illegalStateException = new IllegalStateException("Required value was null.");
            i = -15332101;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
