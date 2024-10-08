package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.model.keyword.Keyword;

/* renamed from: X.Mfb  reason: case insensitive filesystem */
public abstract class C66942Mfb implements Comparable {
    public int A00;
    public int A01;
    public long A02;
    public String A03;

    public Object A00() {
        if (this instanceof C67365Mmh) {
            Object obj = ((C67365Mmh) this).A09;
            if (obj != null) {
                return obj;
            }
            0qQ.A0F("data");
            throw AnonymousClass00P.createAndThrow();
        } else if (this instanceof C66632Ma1) {
            return ((C66632Ma1) this).A06();
        } else {
            if (this instanceof C67387Mn4) {
                return ((C67387Mn4) this).A01;
            }
            if (this instanceof C69155Nfe) {
                return ((C69155Nfe) this).A00;
            }
            if (this instanceof C69158Nfh) {
                return ((C69158Nfh) this).A00;
            }
            if (this instanceof C69157Nfg) {
                return ((C69157Nfg) this).A00;
            }
            if (this instanceof C69156Nff) {
                return ((C69156Nff) this).A00;
            }
            if (this instanceof C69160Nfj) {
                return ((C69160Nfj) this).A00;
            }
            C69159Nfi nfi = (C69159Nfi) this;
            OriginalSoundData originalSoundData = nfi.A01;
            if (originalSoundData != null || (originalSoundData = nfi.A00) != null) {
                return originalSoundData;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public String A01() {
        String id;
        if (this instanceof C66632Ma1) {
            return ((C66632Ma1) this).A06().getId();
        }
        if (this instanceof C69157Nfg) {
            return String.valueOf(((N5G) ((C69157Nfg) this).A00).A00);
        }
        if (this instanceof C69158Nfh) {
            String A05 = ((C69158Nfh) this).A00.A00().A05();
            0qQ.A07(A05);
            return A05;
        } else if (this instanceof C67387Mn4) {
            Keyword keyword = ((C67387Mn4) this).A01;
            String str = keyword.A03;
            if (str == null) {
                return keyword.A04;
            }
            return str;
        } else if (this instanceof C69160Nfj) {
            String str2 = ((C69160Nfj) this).A00.A0C;
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            throw DbT.A0m();
        } else if (this instanceof C69155Nfe) {
            return ((C69155Nfe) this).A00;
        } else {
            if (this instanceof C69156Nff) {
                return ((C69156Nff) this).A00.A00;
            }
            if (this instanceof C67365Mmh) {
                return ((C67365Mmh) this).A0A;
            }
            C66569MWx mWx = ((C69159Nfi) this).A03;
            if (mWx == null || (id = mWx.getId()) == null) {
                return "";
            }
            return id;
        }
    }

    public String A02() {
        String title;
        if (this instanceof C66632Ma1) {
            return ((C66632Ma1) this).A06().getUsername();
        }
        if (this instanceof C67387Mn4) {
            return ((C67387Mn4) this).A01.A04;
        }
        if (this instanceof C69160Nfj) {
            title = ((C69160Nfj) this).A00.A0D;
        } else if (this instanceof C69158Nfh) {
            return ((C69158Nfh) this).A00.A01();
        } else {
            if (this instanceof C69157Nfg) {
                return ((N5G) ((C69157Nfg) this).A00).A02;
            }
            if (this instanceof C69155Nfe) {
                return ((C69155Nfe) this).A00;
            }
            if (this instanceof C69156Nff) {
                return ((C69156Nff) this).A00.A01;
            }
            if (this instanceof C67365Mmh) {
                return ((C67365Mmh) this).A0B;
            }
            C66569MWx A06 = ((C69159Nfi) this).A06();
            if (A06 == null) {
                return "";
            }
            title = A06.getTitle();
        }
        if (title == null) {
            return "";
        }
        return title;
    }

    public String A03() {
        if (this instanceof C66632Ma1) {
            return ((C66632Ma1) this).A06().getId();
        }
        if (!(this instanceof C67387Mn4)) {
            if (this instanceof C69155Nfe) {
                return ((C69155Nfe) this).A00;
            }
            if (this instanceof C69158Nfh) {
                String A022 = ((C69158Nfh) this).A00.A00().A02();
                0qQ.A07(A022);
                return A022;
            } else if (!(this instanceof C69157Nfg)) {
                if (this instanceof C69156Nff) {
                    return ((C69156Nff) this).A00.A00;
                }
                if (this instanceof C69160Nfj) {
                    String str = ((C69160Nfj) this).A00.A0C;
                    if (str == null) {
                        return "";
                    }
                    return str;
                } else if (this instanceof C67365Mmh) {
                    C67365Mmh mmh = (C67365Mmh) this;
                    if (mmh.A01 != 2) {
                        return mmh.A0A;
                    }
                    C18072Vl0 vl0 = mmh.A06;
                    if (vl0 == null) {
                        return "";
                    }
                    String A023 = vl0.A00().A02();
                    0qQ.A07(A023);
                    return A023;
                }
            }
        }
        return A01();
    }

    public String A04() {
        Integer num;
        if (this instanceof C67387Mn4) {
            C67387Mn4 mn4 = (C67387Mn4) this;
            if (0qQ.A0K(mn4.A01.A07, "meta_ai_suggestion")) {
                num = AnonymousClass05K.A0K;
            } else if (mn4.A01.A09) {
                num = AnonymousClass05K.A1F;
            } else {
                num = AnonymousClass05K.A15;
            }
        } else if (this instanceof C66632Ma1) {
            return "USER";
        } else {
            if (this instanceof C69158Nfh) {
                return "PLACE";
            }
            if (this instanceof C69157Nfg) {
                return AnonymousClass000.A00(978);
            }
            if (this instanceof C69155Nfe) {
                return "UPSELL";
            }
            if (this instanceof C69156Nff) {
                return "MAP_QUERY";
            }
            if (this instanceof C69160Nfj) {
                return "HASHTAG";
            }
            if (!(this instanceof C67365Mmh)) {
                return "AUDIO";
            }
            num = ((C67365Mmh) this).A08;
            if (num == null) {
                return "null";
            }
        }
        return C67419Mna.A00(num);
    }

    public boolean A05(String str) {
        String str2;
        if (this instanceof C66632Ma1) {
            C66632Ma1 ma1 = (C66632Ma1) this;
            0qQ.A0B(str, 0);
            if (C67393MnA.A02(ma1.A06().getUsername(), str) || C67393MnA.A02(ma1.A06().getFullName(), str)) {
                return true;
            }
            return false;
        } else if (this instanceof C69155Nfe) {
            return false;
        } else {
            if (this instanceof C69158Nfh) {
                0qQ.A0B(str, 0);
                str2 = ((C69158Nfh) this).A00.A01();
            } else if (this instanceof C69157Nfg) {
                0qQ.A0B(str, 0);
                str2 = ((N5G) ((C69157Nfg) this).A00).A02;
            } else if (this instanceof C69156Nff) {
                0qQ.A0B(str, 0);
                str2 = ((C69156Nff) this).A00.A01;
            } else if (this instanceof C67387Mn4) {
                0qQ.A0B(str, 0);
                str2 = ((C67387Mn4) this).A01.A04;
            } else if (this instanceof C69160Nfj) {
                0qQ.A0B(str, 0);
                str2 = ((C69160Nfj) this).A00.A0D;
            } else if (this instanceof C67365Mmh) {
                throw AnonymousClass7TE.A0w("BlendedSearchEntry doesn't support text matching");
            } else {
                0qQ.A0B(str, 0);
                C66569MWx mWx = ((C69159Nfi) this).A03;
                if (mWx == null || (str2 = mWx.getTitle()) == null) {
                    str2 = "";
                }
            }
            return C67393MnA.A02(str2, str);
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C66942Mfb mfb = (C66942Mfb) obj;
        0qQ.A0B(mfb, 0);
        return 0qQ.A01(mfb.A02, this.A02);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C66942Mfb)) {
            return false;
        }
        C66942Mfb mfb = (C66942Mfb) obj;
        if (this.A01 == mfb.A01) {
            return C51971G9r.A1Z(A01(), mfb.A01(), false);
        }
        return false;
    }

    public C66942Mfb() {
        this.A01 = -1;
        this.A00 = -1;
    }

    public int hashCode() {
        return AnonymousClass7TE.A0O(A01()) + this.A01;
    }

    public C66942Mfb(int i) {
        this();
        this.A01 = i;
    }
}
