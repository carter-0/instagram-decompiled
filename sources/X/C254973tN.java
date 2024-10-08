package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AfiInterestsRecoStyle;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3tN  reason: invalid class name and case insensitive filesystem */
public abstract class C254973tN {
    public static C53432GoP parseFromJson(16F r10) {
        String str;
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str2 = null;
            Integer num = null;
            ArrayList arrayList = null;
            Integer num2 = null;
            AfiInterestsRecoStyle afiInterestsRecoStyle = null;
            String str3 = null;
            String str4 = null;
            while (r10.A1J() != 16L.A09) {
                String A0q = r10.A0q();
                r10.A1J();
                if ("expand_button_label".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                } else if ("expanded_num_rows".equals(A0q)) {
                    num = Integer.valueOf(r10.A1D());
                } else if ("interests".equals(A0q)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r10.A1J() != 16L.A08) {
                            C53431GoO parseFromJson = HTI.parseFromJson(r10);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("num_rows".equals(A0q)) {
                    num2 = Integer.valueOf(r10.A1D());
                } else if ("style".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                    afiInterestsRecoStyle = (AfiInterestsRecoStyle) AfiInterestsRecoStyle.A01.get(str);
                    if (afiInterestsRecoStyle == null) {
                        afiInterestsRecoStyle = AfiInterestsRecoStyle.UNRECOGNIZED;
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r10.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (r10.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            return new C53432GoP(afiInterestsRecoStyle, num, num2, str2, str3, str4, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
