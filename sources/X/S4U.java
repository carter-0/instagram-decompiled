package X;

import android.text.TextUtils;
import com.facebook.phonenumbers.PhoneNumberUtil;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Pattern;

public abstract class S4U {
    public int A00 = 0;
    public int A01;
    public String A02;

    public void A00(String str) {
        if (this instanceof C8053Qg5) {
            return;
        }
        if (this instanceof C8052Qg4) {
            ((C8052Qg4) this).A00 = Pattern.compile(str);
        } else if (this instanceof Qg3) {
        } else {
            if (this instanceof Qg2) {
                ((Qg2) this).A00 = Integer.parseInt(str);
            } else if (this instanceof Qg1) {
                ((Qg1) this).A00 = Integer.parseInt(str);
            } else if (this instanceof Qg0) {
                ((Qg0) this).A00 = Integer.parseInt(str);
            } else if (!(this instanceof C8051Qfz)) {
            }
        }
    }

    public boolean A01(String str) {
        boolean z;
        boolean contains;
        int parseInt;
        if (this instanceof C8053Qg5) {
            C8053Qg5 qg5 = (C8053Qg5) this;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            try {
                PhoneNumberUtil phoneNumberUtil = qg5.A00;
                return phoneNumberUtil.A0N(phoneNumberUtil.A0F(str, "US"));
            } catch (C231962sh e) {
                System.err.println(Pxf.A0l("NumberParseException was thrown: ", e));
                return false;
            }
        } else {
            if (this instanceof C8052Qg4) {
                C8052Qg4 qg4 = (C8052Qg4) this;
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                contains = DbV.A1b(str, qg4.A00);
                z = true;
            } else if (this instanceof Qg3) {
                return AnonymousClass7TF.A1V(((Qg3) this).A00.A00(Pxh.A0w(), str));
            } else {
                if (this instanceof Qg2) {
                    Qg2 qg2 = (Qg2) this;
                    if (str == null || str.length() < qg2.A00) {
                        return false;
                    }
                    return true;
                } else if (this instanceof Qg1) {
                    Qg1 qg1 = (Qg1) this;
                    if (str == null || str.length() > qg1.A00) {
                        return false;
                    }
                    return true;
                } else if (this instanceof Qg0) {
                    Qg0 qg0 = (Qg0) this;
                    if (TextUtils.isEmpty(str) || DbX.A05(str) != qg0.A00) {
                        return false;
                    }
                    return true;
                } else if (this instanceof C8051Qfz) {
                    return !TextUtils.isEmpty(str);
                } else {
                    if (this instanceof C8050Qfy) {
                        if (TextUtils.isEmpty(str) || !TextUtils.isDigitsOnly(str) || str.length() != 4 || (parseInt = Integer.parseInt(str.substring(0, 2))) < 1 || parseInt > 12) {
                            return false;
                        }
                        int i = Calendar.getInstance().get(1);
                        int parseInt2 = Integer.parseInt(str.substring(2));
                        int i2 = Calendar.getInstance().get(1);
                        int i3 = ((i2 / 100) * 100) + parseInt2;
                        if (i3 < i2) {
                            i3 += 100;
                        }
                        if ((i3 != i || parseInt >= Calendar.getInstance().get(2) + 1) && i3 <= i + 20) {
                            return true;
                        }
                        return false;
                    } else if (this instanceof Qfx) {
                        return C11098S9z.A01(str);
                    } else {
                        List list = ((C8049Qfw) this).A00;
                        z = true;
                        if (str == null || str.length() == 0) {
                            return false;
                        }
                        C8946RGo A022 = C8946RGo.A06.A02(str);
                        if (list == null || A022 == C8946RGo.UNKNOWN) {
                            return true;
                        }
                        contains = list.contains(A022);
                    }
                }
            }
            if (!contains) {
                return false;
            }
            return z;
        }
    }
}
