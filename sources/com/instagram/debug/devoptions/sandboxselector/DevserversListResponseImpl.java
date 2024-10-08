package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.AVF;
import X.AnonymousClass4Kp;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4LF;
import X.AnonymousClass7TG;
import X.C16088UoJ;
import X.C21014X9q;
import X.C250663lr;
import X.C295925p8;
import X.C41847B3o;
import X.C66579MXk;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevserversListResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DevserversListResponseImpl extends C250663lr implements DevserversListResponse {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -1578175719;

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return DevserversListResponseImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final class XdtApiV1DevserversList extends C250663lr implements DevserversListResponse.XdtApiV1DevserversList {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -563281936;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return XdtApiV1DevserversList.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class DevserverInfos extends C250663lr implements DevserversListResponse.XdtApiV1DevserversList.DevserverInfos {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -1422414991;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return DevserverInfos.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public boolean getFragmentDevServerInfoDescriptionIsFulfilled() {
                return getCoercedBooleanField(3, "is_defer_fulfilled(fragment_name:\"DevServerInfoDescription\")");
            }

            public String getHostType() {
                return C41847B3o.A1A(this, DevServerEntity.COLUMN_HOST_TYPE, 1);
            }

            public String getUrl() {
                return C41847B3o.A1A(this, "url", 2);
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public DevServerInfoDescription asDevServerInfoDescription() {
                return (DevServerInfoDescription) reinterpretIfFulfills(0, DevServerInfoDescriptionImpl.class, DevServerInfoDescriptionImpl.TYPE_TAG, (String) null, (String) null, (String) null, "DevServerInfoDescription", (String) null);
            }

            public boolean hasFragmentDevServerInfoDescriptionIsFulfilled() {
                return hasFieldValue("is_defer_fulfilled(fragment_name:\"DevServerInfoDescription\")");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0j(AnonymousClass4LF.A00, new AVF(new C295925p8(DevServerInfoDescriptionImpl.class, "DevServerInfoDescription", DevServerInfoDescriptionImpl.TYPE_TAG), "DevServerInfoDescription", (String) null), new AnonymousClass4L7(AnonymousClass4Kz.A01(), DevServerEntity.COLUMN_HOST_TYPE), new AnonymousClass4L7(AnonymousClass4Kz.A01(), "url"), "is_defer_fulfilled(fragment_name:\"DevServerInfoDescription\")");
            }

            public DevserverInfos(int i) {
                super(i);
            }

            public DevserverInfos() {
                super(TYPE_TAG);
            }
        }

        public ImmutableList getErrorMessages() {
            return getRequiredCompactedStringListField(1, "error_messages");
        }

        public boolean hasIsInternal() {
            return true;
        }

        public boolean isInternal() {
            return getRequiredBooleanField(2, "is_internal");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public ImmutableList getDevserverInfos() {
            return A06(DevserverInfos.class, "devserver_infos", DevserverInfos.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            int i = DevserverInfos.TYPE_TAG;
            return AnonymousClass7TG.A0U(AnonymousClass4LF.A00(), new AnonymousClass4Kp(AnonymousClass4Ks.A02(), DevserverInfos.class, "devserver_infos", i), new AnonymousClass4L7(AnonymousClass4Kz.A02(), "error_messages"), "is_internal");
        }

        public XdtApiV1DevserversList(int i) {
            super(i);
        }

        public XdtApiV1DevserversList() {
            super(TYPE_TAG);
        }
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public DevserversListResponse.XdtApiV1DevserversList getXdtApiV1DevserversList() {
        C250663lr A05 = A05(XdtApiV1DevserversList.class, C66579MXk.A00(182), XdtApiV1DevserversList.TYPE_TAG);
        0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.sandboxselector.DevserversListResponseImpl.XdtApiV1DevserversList");
        return (XdtApiV1DevserversList) A05;
    }

    public C21014X9q getXdtApiV1DevserversListAsApiTypeModel() {
        TreeJNI treeValue = getTreeValue(C66579MXk.A00(182), C16088UoJ.class);
        0qQ.A0C(treeValue, "null cannot be cast to non-null type com.instagram.api.schemas.DevserverListResponseIntf");
        return (C21014X9q) treeValue;
    }

    public AnonymousClass4Kx modelSelectionSet() {
        int i = XdtApiV1DevserversList.TYPE_TAG;
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtApiV1DevserversList.class, C66579MXk.A00(182), i);
    }

    public DevserversListResponseImpl(int i) {
        super(i);
    }

    public DevserversListResponseImpl() {
        super(TYPE_TAG);
    }
}
