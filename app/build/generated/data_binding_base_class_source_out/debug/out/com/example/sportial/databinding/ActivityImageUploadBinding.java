// Generated by view binder compiler. Do not edit!
package com.example.sportial.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sportial.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityImageUploadBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final AppCompatButton backButton;

  @NonNull
  public final AppCompatButton continueButton;

  @NonNull
  public final LinearLayoutCompat main;

  @NonNull
  public final ImageView profileImageView;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final AppCompatButton uploadImageButton;

  private ActivityImageUploadBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull AppCompatButton backButton, @NonNull AppCompatButton continueButton,
      @NonNull LinearLayoutCompat main, @NonNull ImageView profileImageView,
      @NonNull TextView textView10, @NonNull AppCompatButton uploadImageButton) {
    this.rootView = rootView;
    this.backButton = backButton;
    this.continueButton = continueButton;
    this.main = main;
    this.profileImageView = profileImageView;
    this.textView10 = textView10;
    this.uploadImageButton = uploadImageButton;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityImageUploadBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityImageUploadBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_image_upload, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityImageUploadBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_button;
      AppCompatButton backButton = ViewBindings.findChildViewById(rootView, id);
      if (backButton == null) {
        break missingId;
      }

      id = R.id.continue_button;
      AppCompatButton continueButton = ViewBindings.findChildViewById(rootView, id);
      if (continueButton == null) {
        break missingId;
      }

      LinearLayoutCompat main = (LinearLayoutCompat) rootView;

      id = R.id.profile_image_view;
      ImageView profileImageView = ViewBindings.findChildViewById(rootView, id);
      if (profileImageView == null) {
        break missingId;
      }

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.uploadImageButton;
      AppCompatButton uploadImageButton = ViewBindings.findChildViewById(rootView, id);
      if (uploadImageButton == null) {
        break missingId;
      }

      return new ActivityImageUploadBinding((LinearLayoutCompat) rootView, backButton,
          continueButton, main, profileImageView, textView10, uploadImageButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
