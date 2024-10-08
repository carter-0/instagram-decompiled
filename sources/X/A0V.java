package X;

import java.io.IOException;
import java.util.ArrayList;

public abstract class A0V {
    public static C39748A7o parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("file_path".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                } else if ("highest_rating_time_stamp".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if ("keyframe_indexes".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            Integer A0X = AnonymousClass7TF.A0X(r9);
                            if (A0X != null) {
                                arrayList.add(A0X);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("frame_indices".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            Integer A0X2 = AnonymousClass7TF.A0X(r9);
                            if (A0X2 != null) {
                                arrayList2.add(A0X2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("timestampsUs".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList3 = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            Long A0Z = AnonymousClass7TF.A0Z(r9);
                            if (A0Z != null) {
                                arrayList3.add(A0Z);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("ratings".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList4 = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            arrayList4.add(AnonymousClass7TF.A0U(r9));
                        }
                    } else {
                        arrayList4 = null;
                    }
                }
                r9.A0z();
            }
            C39748A7o a7o = new C39748A7o();
            if (str != null) {
                a7o.A01 = str;
            }
            if (num != null) {
                a7o.A00 = num.intValue();
            }
            if (arrayList != null) {
                a7o.A03 = arrayList;
            }
            if (arrayList2 != null) {
                a7o.A02 = arrayList2;
            }
            if (arrayList3 != null) {
                a7o.A05 = arrayList3;
            }
            if (arrayList4 != null) {
                a7o.A04 = arrayList4;
            }
            return a7o;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
