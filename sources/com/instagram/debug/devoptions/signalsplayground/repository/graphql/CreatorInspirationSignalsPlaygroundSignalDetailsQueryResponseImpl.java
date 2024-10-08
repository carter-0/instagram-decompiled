package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.0qQ;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass7TG;
import X.C250663lr;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponseImpl extends C250663lr implements CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = 1937064199;

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponseImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final class XdtGetCreatorsSignalPlayground extends C250663lr implements CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1710470887;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return XdtGetCreatorsSignalPlayground.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class Signal extends C250663lr implements CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 2003872400;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Signal.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class TestCases extends C250663lr implements CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal.TestCases {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -203418252;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return TestCases.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public final class User extends C250663lr implements CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal.TestCases.User {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 999722248;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return User.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public CreatorInspirationSignalsPlaygroundTestUser asCreatorInspirationSignalsPlaygroundTestUser() {
                        return (CreatorInspirationSignalsPlaygroundTestUser) A01(CreatorInspirationSignalsPlaygroundTestUserImpl.class, CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0X(CreatorInspirationSignalsPlaygroundTestUserImpl.class, "CreatorInspirationSignalsPlaygroundTestUser", CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG);
                    }

                    public User(int i) {
                        super(i);
                    }

                    public User() {
                        super(TYPE_TAG);
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal.TestCases.User getUser() {
                    return (CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal.TestCases.User) A03(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.TYPE_TAG);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0Y(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.TYPE_TAG);
                }

                public TestCases(int i) {
                    super(i);
                }

                public TestCases() {
                    super(TYPE_TAG);
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public ImmutableList getTestCases() {
                return getOptionalCompactedTreeListField(0, "test_cases", TestCases.class, TestCases.TYPE_TAG);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                int i = TestCases.TYPE_TAG;
                return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), TestCases.class, "test_cases", i);
            }

            public Signal(int i) {
                super(i);
            }

            public Signal() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal getSignal() {
            return (CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground.Signal) A03(Signal.class, "signal(identifier:$identifier)", Signal.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0Y(Signal.class, "signal(identifier:$identifier)", Signal.TYPE_TAG);
        }

        public XdtGetCreatorsSignalPlayground(int i) {
            super(i);
        }

        public XdtGetCreatorsSignalPlayground() {
            super(TYPE_TAG);
        }
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponse.XdtGetCreatorsSignalPlayground getXdtGetCreatorsSignalPlayground() {
        C250663lr A05 = A05(XdtGetCreatorsSignalPlayground.class, "xdt_get_creators_signal_playground", XdtGetCreatorsSignalPlayground.TYPE_TAG);
        0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponseImpl.XdtGetCreatorsSignalPlayground");
        return (XdtGetCreatorsSignalPlayground) A05;
    }

    public AnonymousClass4Kx modelSelectionSet() {
        int i = XdtGetCreatorsSignalPlayground.TYPE_TAG;
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtGetCreatorsSignalPlayground.class, "xdt_get_creators_signal_playground", i);
    }

    public CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponseImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundSignalDetailsQueryResponseImpl() {
        super(TYPE_TAG);
    }
}
