// Generated by view binder compiler. Do not edit!
package com.example.sportial.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sportial.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityProfileScreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FragmentContainerView fragmentContainerView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView5;

  @NonNull
  public final LinearLayout linearLayout3;

  @NonNull
  public final LinearLayout linearLayout6;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final LinearLayout profileBackgroundLL;

  @NonNull
  public final AppCompatButton profileBioBtn;

  @NonNull
  public final LinearLayout profileCVButtonLL;

  @NonNull
  public final CardView profileCardView;

  @NonNull
  public final AppCompatButton profileConnectBtn;

  @NonNull
  public final LinearLayout profileFragmentsBtnsLL;

  @NonNull
  public final AppCompatButton profileFriendsBtn;

  @NonNull
  public final AppCompatButton profileGroupsBtn;

  @NonNull
  public final CardView profileImageCardView;

  @NonNull
  public final AppCompatButton profileMediaBtn;

  @NonNull
  public final AppCompatButton profileMessageBtn;

  @NonNull
  public final LinearLayout profileNameLL;

  @NonNull
  public final TextView profileNameTV;

  @NonNull
  public final AppCompatButton profilePostsBtn;

  @NonNull
  public final ImageView verificationIcon;

  private ActivityProfileScreenBinding(@NonNull ConstraintLayout rootView,
      @NonNull FragmentContainerView fragmentContainerView, @NonNull ImageView imageView,
      @NonNull ImageView imageView5, @NonNull LinearLayout linearLayout3,
      @NonNull LinearLayout linearLayout6, @NonNull ConstraintLayout main,
      @NonNull LinearLayout profileBackgroundLL, @NonNull AppCompatButton profileBioBtn,
      @NonNull LinearLayout profileCVButtonLL, @NonNull CardView profileCardView,
      @NonNull AppCompatButton profileConnectBtn, @NonNull LinearLayout profileFragmentsBtnsLL,
      @NonNull AppCompatButton profileFriendsBtn, @NonNull AppCompatButton profileGroupsBtn,
      @NonNull CardView profileImageCardView, @NonNull AppCompatButton profileMediaBtn,
      @NonNull AppCompatButton profileMessageBtn, @NonNull LinearLayout profileNameLL,
      @NonNull TextView profileNameTV, @NonNull AppCompatButton profilePostsBtn,
      @NonNull ImageView verificationIcon) {
    this.rootView = rootView;
    this.fragmentContainerView = fragmentContainerView;
    this.imageView = imageView;
    this.imageView5 = imageView5;
    this.linearLayout3 = linearLayout3;
    this.linearLayout6 = linearLayout6;
    this.main = main;
    this.profileBackgroundLL = profileBackgroundLL;
    this.profileBioBtn = profileBioBtn;
    this.profileCVButtonLL = profileCVButtonLL;
    this.profileCardView = profileCardView;
    this.profileConnectBtn = profileConnectBtn;
    this.profileFragmentsBtnsLL = profileFragmentsBtnsLL;
    this.profileFriendsBtn = profileFriendsBtn;
    this.profileGroupsBtn = profileGroupsBtn;
    this.profileImageCardView = profileImageCardView;
    this.profileMediaBtn = profileMediaBtn;
    this.profileMessageBtn = profileMessageBtn;
    this.profileNameLL = profileNameLL;
    this.profileNameTV = profileNameTV;
    this.profilePostsBtn = profilePostsBtn;
    this.verificationIcon = verificationIcon;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityProfileScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityProfileScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_profile_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityProfileScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fragmentContainerView;
      FragmentContainerView fragmentContainerView = ViewBindings.findChildViewById(rootView, id);
      if (fragmentContainerView == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView5;
      ImageView imageView5 = ViewBindings.findChildViewById(rootView, id);
      if (imageView5 == null) {
        break missingId;
      }

      id = R.id.linearLayout3;
      LinearLayout linearLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout3 == null) {
        break missingId;
      }

      id = R.id.linearLayout6;
      LinearLayout linearLayout6 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout6 == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.profile_background_LL;
      LinearLayout profileBackgroundLL = ViewBindings.findChildViewById(rootView, id);
      if (profileBackgroundLL == null) {
        break missingId;
      }

      id = R.id.profile_bio_btn;
      AppCompatButton profileBioBtn = ViewBindings.findChildViewById(rootView, id);
      if (profileBioBtn == null) {
        break missingId;
      }

      id = R.id.profile_CV_Button_LL;
      LinearLayout profileCVButtonLL = ViewBindings.findChildViewById(rootView, id);
      if (profileCVButtonLL == null) {
        break missingId;
      }

      id = R.id.profile_cardView;
      CardView profileCardView = ViewBindings.findChildViewById(rootView, id);
      if (profileCardView == null) {
        break missingId;
      }

      id = R.id.profile_connect_btn;
      AppCompatButton profileConnectBtn = ViewBindings.findChildViewById(rootView, id);
      if (profileConnectBtn == null) {
        break missingId;
      }

      id = R.id.profile_fragments_btns_LL;
      LinearLayout profileFragmentsBtnsLL = ViewBindings.findChildViewById(rootView, id);
      if (profileFragmentsBtnsLL == null) {
        break missingId;
      }

      id = R.id.profile_friends_btn;
      AppCompatButton profileFriendsBtn = ViewBindings.findChildViewById(rootView, id);
      if (profileFriendsBtn == null) {
        break missingId;
      }

      id = R.id.profile_groups_btn;
      AppCompatButton profileGroupsBtn = ViewBindings.findChildViewById(rootView, id);
      if (profileGroupsBtn == null) {
        break missingId;
      }

      id = R.id.profile_image_cardView;
      CardView profileImageCardView = ViewBindings.findChildViewById(rootView, id);
      if (profileImageCardView == null) {
        break missingId;
      }

      id = R.id.profile_media_btn;
      AppCompatButton profileMediaBtn = ViewBindings.findChildViewById(rootView, id);
      if (profileMediaBtn == null) {
        break missingId;
      }

      id = R.id.profile_message_btn;
      AppCompatButton profileMessageBtn = ViewBindings.findChildViewById(rootView, id);
      if (profileMessageBtn == null) {
        break missingId;
      }

      id = R.id.profile_name_LL;
      LinearLayout profileNameLL = ViewBindings.findChildViewById(rootView, id);
      if (profileNameLL == null) {
        break missingId;
      }

      id = R.id.profile_name_TV;
      TextView profileNameTV = ViewBindings.findChildViewById(rootView, id);
      if (profileNameTV == null) {
        break missingId;
      }

      id = R.id.profile_posts_btn;
      AppCompatButton profilePostsBtn = ViewBindings.findChildViewById(rootView, id);
      if (profilePostsBtn == null) {
        break missingId;
      }

      id = R.id.verification_icon;
      ImageView verificationIcon = ViewBindings.findChildViewById(rootView, id);
      if (verificationIcon == null) {
        break missingId;
      }

      return new ActivityProfileScreenBinding((ConstraintLayout) rootView, fragmentContainerView,
          imageView, imageView5, linearLayout3, linearLayout6, main, profileBackgroundLL,
          profileBioBtn, profileCVButtonLL, profileCardView, profileConnectBtn,
          profileFragmentsBtnsLL, profileFriendsBtn, profileGroupsBtn, profileImageCardView,
          profileMediaBtn, profileMessageBtn, profileNameLL, profileNameTV, profilePostsBtn,
          verificationIcon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}