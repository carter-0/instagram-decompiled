package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6ve  reason: invalid class name and case insensitive filesystem */
public final class C322326ve {
    public long A00;
    public long A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final UserFlowLoggerImpl A0A = new UserFlowLoggerImpl(02m.A0p);
    public final UserSession A0B;

    public C322326ve(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A0B = userSession;
    }

    public final void A04(String str) {
        long j;
        UserFlowLoggerImpl userFlowLoggerImpl;
        String str2;
        if (str.equals("edit_full_name") || str.equals("edit_user_name") || str.equals("edit_bio")) {
            long j2 = this.A02;
            if (j2 != 0) {
                if (this.A04 || this.A06 || this.A03) {
                    this.A0A.flowEndFail(j2, "Encountered Edit Profile Form Failure", "");
                } else {
                    this.A0A.flowEndSuccess(j2);
                }
                this.A07 = false;
                this.A08 = false;
                this.A03 = false;
                this.A04 = false;
                this.A06 = false;
                this.A02 = 0;
            }
        } else if (str.equals("edit_profile_picture")) {
            long j3 = this.A01;
            if (j3 != 0) {
                boolean z = this.A05;
                UserFlowLoggerImpl userFlowLoggerImpl2 = this.A0A;
                if (z) {
                    userFlowLoggerImpl2.flowEndFail(j3, "Encountered Edit Profile Picture Failure", "");
                } else {
                    userFlowLoggerImpl2.flowEndSuccess(j3);
                }
                this.A01 = 0;
                this.A05 = false;
            }
        } else {
            if (str.equals("edit_link")) {
                j = this.A00;
                if (j != 0) {
                    if (this.A09) {
                        userFlowLoggerImpl = this.A0A;
                        str2 = "Encountered Edit Profile Links Failure";
                    }
                    this.A0A.flowEndSuccess(j);
                    this.A09 = false;
                    this.A00 = 0;
                }
                return;
            } else if (str.equals("edit_profile_link")) {
                j = this.A00;
                if (j != 0) {
                    if (this.A09) {
                        userFlowLoggerImpl = this.A0A;
                        str2 = "Encountered Edit Profile Facebook Link Failure";
                    }
                    this.A0A.flowEndSuccess(j);
                    this.A09 = false;
                    this.A00 = 0;
                }
                return;
            } else {
                return;
            }
            userFlowLoggerImpl.flowEndFail(j, str2, "");
            this.A09 = false;
            this.A00 = 0;
        }
    }

    public final void A06(String str) {
        UserFlowLoggerImpl userFlowLoggerImpl;
        long j;
        String str2;
        UserFlowLoggerImpl userFlowLoggerImpl2;
        long generateNewFlowId;
        String str3;
        boolean equals = str.equals("edit_full_name");
        if (equals || str.equals("edit_user_name") || str.equals("edit_bio")) {
            if (this.A02 == 0) {
                UserFlowLoggerImpl userFlowLoggerImpl3 = this.A0A;
                long generateNewFlowId2 = userFlowLoggerImpl3.generateNewFlowId(915546946);
                this.A02 = generateNewFlowId2;
                userFlowLoggerImpl3.flowStart(generateNewFlowId2, new UserFlowConfig("edit_profile_form", false));
                userFlowLoggerImpl3.flowAnnotate(this.A02, "profile_edit_category", str);
            }
            if (equals) {
                this.A04 = false;
                this.A07 = true;
            } else {
                this.A06 = false;
                this.A08 = true;
            }
            userFlowLoggerImpl = this.A0A;
            j = this.A02;
            str2 = "edit_profile_form_load";
        } else if (!str.equals("edit_profile_picture")) {
            if (str.equals("edit_link")) {
                if (this.A00 == 0) {
                    this.A09 = false;
                    userFlowLoggerImpl2 = this.A0A;
                    generateNewFlowId = userFlowLoggerImpl2.generateNewFlowId(915541438);
                    this.A00 = generateNewFlowId;
                    str3 = "edit_profile_links";
                } else {
                    return;
                }
            } else if (str.equals("edit_profile_link") && this.A00 == 0) {
                this.A09 = false;
                userFlowLoggerImpl2 = this.A0A;
                generateNewFlowId = userFlowLoggerImpl2.generateNewFlowId(915541438);
                this.A00 = generateNewFlowId;
                str3 = "edit_profile_facebook_link";
            } else {
                return;
            }
            userFlowLoggerImpl2.flowStart(generateNewFlowId, new UserFlowConfig(str3, false));
            return;
        } else if (this.A01 == 0) {
            this.A05 = false;
            userFlowLoggerImpl = this.A0A;
            long generateNewFlowId3 = userFlowLoggerImpl.generateNewFlowId(915547322);
            this.A01 = generateNewFlowId3;
            userFlowLoggerImpl.flowStart(generateNewFlowId3, new UserFlowConfig("edit_profile_picture", false));
            userFlowLoggerImpl.flowAnnotate(this.A01, "profile_edit_category", str);
            j = this.A01;
            str2 = "edit_profile_picture_library_load";
        } else {
            return;
        }
        userFlowLoggerImpl.flowMarkPoint(j, str2);
    }

    public final void A0A(String str, boolean z) {
        long j = this.A02;
        if (j != 0) {
            int hashCode = str.hashCode();
            if (hashCode != -609746934) {
                if (hashCode != -579725096) {
                    if (hashCode == 1983847949 && str.equals("name_successfully_edited")) {
                        this.A04 = false;
                    }
                } else if (str.equals("username_successfully_edited")) {
                    this.A06 = false;
                }
            } else if (str.equals("bio_successfully_edited")) {
                this.A03 = false;
            }
            UserFlowLoggerImpl userFlowLoggerImpl = this.A0A;
            userFlowLoggerImpl.flowAnnotate(j, "is_oepf", z);
            userFlowLoggerImpl.flowMarkPoint(this.A02, str);
        }
    }

    public static final long A00(C322326ve r2, String str) {
        return r2.A0A.generateFlowId(915549363, str.hashCode());
    }

    public static final void A01(1XP r4, C322326ve r5, long j) {
        Object obj;
        String str;
        if (r4 == null) {
            r5.A0A.flowAnnotate(j, TraceFieldType.FailureReason, "Error response was null");
            return;
        }
        List list = r4.mErrorStrings;
        if (list != null) {
            obj = list.get(0);
        } else {
            obj = null;
        }
        String str2 = "Missing failure reason";
        if (obj != null) {
            List list2 = r4.mErrorStrings;
            if (list2 == null || (str2 = (String) list2.get(0)) == null) {
                str2 = "Null error in error string";
            }
        } else if (r4.getErrorMessage() != null) {
            str2 = r4.getErrorMessage();
            if (str2 == null) {
                str2 = "Null error message";
            }
        } else if ((r4 instanceof C47365Dvz) && (str = ((C47365Dvz) r4).A01) != null) {
            str2 = str;
        }
        UserFlowLoggerImpl userFlowLoggerImpl = r5.A0A;
        userFlowLoggerImpl.flowAnnotate(j, TraceFieldType.FailureReason, str2);
        String str3 = r4.mErrorType;
        if (str3 != null) {
            userFlowLoggerImpl.flowAnnotate(j, "error_type", str3);
        }
        String errorCode = r4.getErrorCode();
        if (errorCode != null) {
            userFlowLoggerImpl.flowAnnotate(j, TraceFieldType.ErrorCode, errorCode);
        }
        String str4 = r4.mErrorSource;
        if (str4 != null) {
            userFlowLoggerImpl.flowAnnotate(j, AnonymousClass000.A00(1314), str4);
        }
    }

    public final void A02(String str) {
        long j = this.A00;
        if (j != 0) {
            this.A0A.flowAnnotate(j, TraceFieldType.FailureReason, str);
            this.A09 = true;
        }
    }

    public final void A05(String str) {
        long j = this.A01;
        if (j != 0) {
            this.A0A.flowMarkPoint(j, str);
        }
    }

    public final void A03(String str) {
        long A002 = A00(this, str);
        if (A002 != 0) {
            UserFlowLoggerImpl userFlowLoggerImpl = this.A0A;
            if (userFlowLoggerImpl.isOngoingFlow(A002)) {
                userFlowLoggerImpl.flowEndSuccess(A002);
            }
        }
    }

    public final void A07(String str, String str2) {
        long A002 = A00(this, str);
        if (A002 != 0) {
            UserFlowLoggerImpl userFlowLoggerImpl = this.A0A;
            if (userFlowLoggerImpl.isOngoingFlow(A002)) {
                userFlowLoggerImpl.flowEndFail(A002, str2, "");
            }
        }
    }

    public final void A08(String str, String str2) {
        long A002 = A00(this, str);
        if (A002 != 0) {
            UserFlowLoggerImpl userFlowLoggerImpl = this.A0A;
            if (userFlowLoggerImpl.isOngoingFlow(A002)) {
                userFlowLoggerImpl.flowMarkPoint(A002, str2);
            }
        }
    }

    public final void A09(String str, String str2, boolean z) {
        long A002 = A00(this, str);
        if (A002 != 0) {
            UserFlowLoggerImpl userFlowLoggerImpl = this.A0A;
            if (userFlowLoggerImpl.isOngoingFlow(A002)) {
                userFlowLoggerImpl.flowAnnotate(A002, str2, z);
            }
        }
    }
}
