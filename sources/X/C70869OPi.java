package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OPi  reason: case insensitive filesystem */
public abstract class C70869OPi {
    public static final String A01(C69421Nl3 nl3, C69420Nl2 nl2, UserSession userSession, String str, String str2, List list, boolean z) {
        Resources resources;
        int i;
        int i2;
        Object obj;
        int i3;
        Object[] objArr;
        int i4;
        String A07;
        User A00;
        Resources resources2;
        int i5;
        Object[] objArr2;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(list, 2);
        DbW.A1N(nl3, 4, nl2);
        Context A0P = C51966G9m.A0P(userSession);
        boolean equals = str.equals(userSession.A06);
        C69421Nl3 nl32 = C69421Nl3.STORY;
        if (nl3 == nl32 || nl3 == C69421Nl3.STORY_HIGHLIGHT) {
            int ordinal = nl2.ordinal();
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 1) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (0qQ.A0K(DbS.A0q(obj), str)) {
                                break;
                            }
                        }
                        User user = (User) obj;
                        if (nl3 == nl32) {
                            if (user == null || (A07 = AnonymousClass50n.A07(user)) == null) {
                                i4 = 2131960428;
                                objArr = new Object[]{str2};
                                return A0P.getString(i3, objArr);
                            }
                            i4 = 2131960423;
                            if (z) {
                                i3 = 2131960420;
                            }
                            objArr = new Object[]{str2};
                            return A0P.getString(i3, objArr);
                        } else if (user == null || (A07 = AnonymousClass50n.A07(user)) == null) {
                            i4 = 2131960406;
                            objArr = new Object[]{str2};
                            return A0P.getString(i3, objArr);
                        } else {
                            i4 = 2131960402;
                            if (z) {
                                i3 = 2131960400;
                            }
                            objArr = new Object[]{str2};
                            return A0P.getString(i3, objArr);
                        }
                        objArr = new Object[]{A07, str2};
                        return A0P.getString(i3, objArr);
                    } else if (ordinal != 4) {
                        return null;
                    } else {
                        if (equals) {
                            A00 = A00(str, list);
                            if (A00 == null) {
                                return null;
                            }
                            resources2 = A0P.getResources();
                            i5 = 2131959139;
                        } else {
                            resources = A0P.getResources();
                            i = 2131959066;
                            return resources.getString(i);
                        }
                    }
                } else if (nl3 != nl32) {
                    i2 = 2131960169;
                    if (equals) {
                        i2 = 2131960172;
                    }
                } else if (!equals) {
                    return AnonymousClass7TF.A0e(A0P.getResources(), "", 2131960170);
                } else {
                    i2 = 2131959142;
                }
            } else if (nl3 == nl32) {
                i2 = 2131960187;
                if (equals) {
                    i2 = 2131960190;
                }
            } else {
                i2 = 2131960174;
                if (equals) {
                    i2 = 2131960177;
                }
            }
            return A0P.getString(i2);
        } else if (nl3 != C69421Nl3.CLIP) {
            if (nl3 == C69421Nl3.SOCIAL_CONTEXT) {
                if (nl2.ordinal() != 2) {
                    return null;
                }
                resources = A0P.getResources();
                i = 2131959090;
                if (equals) {
                    i = 2131959088;
                }
            } else if (nl3 == C69421Nl3.FEED) {
                if (nl2.ordinal() != 4) {
                    return null;
                }
                if (equals) {
                    A00 = A00(str, list);
                    if (A00 == null) {
                        return null;
                    }
                    resources2 = A0P.getResources();
                    i5 = 2131959135;
                } else {
                    resources = A0P.getResources();
                    i = 2131959064;
                }
            } else if (nl3 == C69421Nl3.COMMENT) {
                if (nl2.ordinal() != 4) {
                    return null;
                }
                if (equals) {
                    A00 = A00(str, list);
                    if (A00 == null) {
                        return null;
                    }
                    resources2 = A0P.getResources();
                    i5 = 2131959055;
                } else {
                    resources = A0P.getResources();
                    i = 2131959054;
                }
            } else if (nl3 == C69421Nl3.NOTE || nl3 == C69421Nl3.MEDIA_NOTE) {
                int ordinal2 = nl2.ordinal();
                if (ordinal2 == 2) {
                    resources = A0P.getResources();
                    i = 2131959091;
                    if (equals) {
                        i = 2131959089;
                    }
                } else if (ordinal2 != 4) {
                    return null;
                } else {
                    if (equals) {
                        A00 = A00(str, list);
                        if (A00 == null) {
                            return null;
                        }
                        resources2 = A0P.getResources();
                        i5 = 2131959063;
                    } else {
                        resources = A0P.getResources();
                        i = 2131959062;
                    }
                }
            } else if (nl3 != C69421Nl3.LIVE || nl2.ordinal() != 1) {
                return null;
            } else {
                resources2 = A0P.getResources();
                i5 = 2131959122;
                objArr2 = new Object[]{str2};
                return resources2.getString(i5, objArr2);
            }
            return resources.getString(i);
        } else if (nl2.ordinal() != 4) {
            return null;
        } else {
            if (equals) {
                A00 = A00(str, list);
                if (A00 == null) {
                    return null;
                }
                resources2 = A0P.getResources();
                i5 = 2131959136;
            } else {
                resources = A0P.getResources();
                i = 2131959065;
                return resources.getString(i);
            }
        }
        objArr2 = new Object[]{A00.getUsername()};
        return resources2.getString(i5, objArr2);
    }

    public static final User A00(String str, List list) {
        Iterator it = list.iterator();
        User user = null;
        while (it.hasNext()) {
            User A0k = DbT.A0k(it);
            if (!0qQ.A0K(A0k.getId(), str)) {
                user = A0k;
            }
        }
        return user;
    }
}
